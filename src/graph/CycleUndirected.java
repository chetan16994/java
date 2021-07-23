package graph;

import java.util.*;

public class CycleUndirected {
    public static Map<Character, List<Character>> getGraphUndirected(List<List<Character>> edges){
        Map<Character, List<Character>> graph = new HashMap<>();
        for(List<Character> edge: edges){

            graph.putIfAbsent(edge.get(0), new LinkedList<>());
            graph.putIfAbsent(edge.get(1), new LinkedList<>());

            graph.get(edge.get(0)).add(edge.get(1));
            graph.get(edge.get(1)).add(edge.get(0));
        }
        return graph;
    }
    public static void DFSRecursion(Map<Character, List<Character>> graph){
        Map<Character,Integer> visited=new HashMap<>();
        for (Character vertex:graph.keySet())
            visited.put(vertex,-1);

        for(Character node: graph.keySet()){
            visit(node, visited, graph);
        }
    }
    public static void visit(Character currVertex, Map<Character,Integer> visited, Map<Character, List<Character>> graph){
        if(visited.get(currVertex)==0) return;
            visited.put(currVertex,0);   //being visited
        for (Character child : graph.get(currVertex)) {
                    if (visited.get(child)==0)
                        System.out.println("cycle detected -->  "+currVertex+" : "+child);
                    visited.put(child,0);
                    visit(child, visited, graph);

            }
//        visited.put(currVertex,1);
    }
    static void CycleUsingDFS(Map<Character,List<Character>> graph){
        Map<Character,Integer> visited=new HashMap<>();
        for (Character vertex:graph.keySet())
            visited.put(vertex,-1);

        Stack<Character> stack=new Stack();

        for (Character node: graph.keySet()) stack.push(node); visited.put(stack.get(0),0);

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

    public static void CycleUsingBFS(Map<Character, List<Character>> graph){

        Map<Character,Integer> visited=new LinkedHashMap<>();
        for (Character vertex:graph.keySet())
            visited.put(vertex,-1);
        Queue<Character> queue=new LinkedList();
        for (Character vertex:graph.keySet()) {queue.add(vertex); visited.put(vertex,0); break;};
//        queue.add('a'); visited.put('a',0); //being visited

        while (!queue.isEmpty()){
            Character curr=queue.poll();
            if (visited.get(curr)!=-1){
                System.out.println(curr);
                for (Character child: graph.get(curr)){
                    if (visited.get(child)!=1){     // dont push already VISITED
                        if (visited.get(child)==0)
                            System.out.println("cycle detected  --->   "+curr+" : "+child);
                        queue.add(child);
                        visited.put(child,0); //being visited
                    }
                }
            }
            visited.put(curr,1);  //visited
        }
    }

    public static void main(String[] args) {
        List<List<Character>> edges=List.of(
                List.of('a', 'b'),
                List.of('a','c'),
                List.of('b','d'),
                List.of('d','e'),
                List.of('e','b')
        );
        Map<Character, List<Character>> graph = getGraphUndirected(edges);
        System.out.println(graph);
        System.out.println("using DFS recursion");
        DFSRecursion(graph);
//        System.out.println("using DFS");
//        CycleUsingDFS(graph);
//        System.out.println("using BFS");
//        CycleUsingBFS(graph);
    }
}
