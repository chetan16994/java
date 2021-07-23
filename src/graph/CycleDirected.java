package graph;

import java.util.*;

public class CycleDirected {
    public static Map<Character, List<Character>> getGraphDirected(List<List<Character>> edges){
        Map<Character, List<Character>> graph = new HashMap<>();
        for(List<Character> edge: edges){

            graph.putIfAbsent(edge.get(0), new LinkedList<>());
            graph.putIfAbsent(edge.get(1), new LinkedList<>());

            graph.get(edge.get(0)).add(edge.get(1));
//            graph.get(edge.get(1)).add(edge.get(0));
        }
        return graph;
    }
    static void CycleUsingDFS(Map<Character,List<Character>> graph){
        Map<Character,Integer> visited=new HashMap<>();
        for (Character vertex:graph.keySet())
            visited.put(vertex,-1);

        Stack<Character> stack=new Stack();

        for (Character node: graph.keySet()) {stack.push(node); visited.put(node,0); break;}

//        stack.push('c');
//        visited.put('c',0);  // being visited

        while (!stack.isEmpty()){
            Character curr=stack.pop();
            if (visited.get(curr)!=-1){   // dont push already visited
                visited.put(curr,1);
                System.out.println(curr);
                for (Character child: graph.get(curr)){
                    if (visited.get(child)!=1){     // dont push already VISITED
                        if (visited.get(child)==0)
                            System.out.println("cycle detected -->  "+curr+" : "+child);
                        stack.add(child);
                        visited.put(child,0); //being visited
                    }
                }
            }
        }
    }

    public static boolean isCyclic(Map<Character,List<Character>> graph){

        Map<Character,Boolean> visited=new HashMap<>();
        Map<Character,Boolean> helper=new HashMap<>();

        for (Character vertex:graph.keySet()){
            visited.put(vertex,false);
            helper.put(vertex,false);
        }
        for (Character vertex:graph.keySet()){
            if (!visited.get(vertex)){
                if (DFS(graph,vertex, visited,helper))
                    return true;
            }
        }
        return false;
    }
    public static boolean DFS(Map<Character,List<Character>> graph, Character vertex, Map<Character,Boolean> visited,  Map<Character,Boolean> helper){
        visited.put(vertex,true);
        helper.put(vertex,true);

        for (Character curr: graph.get(vertex)){
            if (helper.get(curr)==true) return true;
            if (visited.get(curr)==false){
                if (DFS(graph,curr,visited,helper))
                    return true;
            }
        }
        helper.put(vertex,false);
        return false;
    }
    public static void main(String[] args) {
        List<List<Character>> edges=List.of(
                List.of('a', 'b'),
                List.of('h', 'a'),
                List.of('b','c'),
                List.of('b', 'd'),
                List.of('c','e'),
                List.of('c','g'),
                List.of('f', 'c'),
                List.of('g', 'f')
        );
        Map<Character, List<Character>> graph = getGraphDirected(edges);
        System.out.println(graph);
//        System.out.println("using DFS");
//        CycleUsingDFS(graph);
        System.out.println(isCyclic(graph));
    }
}
