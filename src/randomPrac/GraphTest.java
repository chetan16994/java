package randomPrac;

import java.util.*;
import java.util.stream.Collectors;

public class GraphTest {


    public static Map<Character, List<Character>> getGraph(List<List<Character>> edges){
        Map<Character, List<Character>> graph = new HashMap<>();
        for(List<Character> edge: edges){

            graph.putIfAbsent(edge.get(0), new LinkedList<>());
            graph.putIfAbsent(edge.get(1), new LinkedList<>());

            graph.get(edge.get(0)).add(edge.get(1));
//            graph.get(edge.get(1)).add(edge.get(0));
        }
        return graph;
    }


    public static void dfs(Map<Character, List<Character>> graph){
        Map<Character, Integer> visited = new HashMap<>();
        Stack<Character> stack = new Stack<>();

        for(Character node: graph.keySet()) stack.push(node);
        System.out.println(stack);

        while (!stack.empty()){
            Character cur = stack.pop();
            System.out.println(cur);
            if(!visited.containsKey(cur)){
                visited.put(cur, 0); // explored
                stack.push(cur);
                for(Character child: graph.getOrDefault(cur, Collections.emptyList())) {
                    System.out.println("child : "+child);
                    if (visited.getOrDefault(child,-1) == 0)
                        stack.add(child);
                }
            } else {
                visited.put(cur, 1); // visited
            }
        }
    }

    public static void dfs2(Map<Character, List<Character>> graph){
        Map<Character, Integer> visited = new HashMap<>();
        for(Character node: graph.keySet()){
            System.out.println("--- "+node);
            visit(node, graph, visited);
        }
    }

    public static  void visit(Character node, Map<Character, List<Character>> graph, Map<Character, Integer> visited){
        if(visited.getOrDefault(node, -1) == 1) return;
        visited.put(node, 0); // explored
        for(Character child: graph.get(node)){
            if(visited.getOrDefault(child, -1) == 0) {
                System.out.println("Cycle detected");
            }
            visit(child, graph, visited);
        }
        visited.put(node, 1); // visited
    }


    public static void main(String[] args){
        List<List<Character>> edges=List.of(
                List.of('a', 'b'),
                List.of('a','c'),
                List.of('b','d'),
                List.of('d','e'),
                List.of('b','e')
        );
        Map<Character, List<Character>> graph = getGraph(edges);
        System.out.println(graph);
//        dfs2(graph);
        dfs(graph);
    }

}