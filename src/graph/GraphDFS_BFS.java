package graph;

import java.util.*;

public class GraphDFS_BFS {
    public Map<String,List<String>> getGraph(List<List<String>> edges){
        Map<String,List<String>> graph=new HashMap<>();

        for (List<String> edge: edges){
            graph.putIfAbsent(edge.get(0),new LinkedList<>());
            graph.putIfAbsent(edge.get(1),new LinkedList<>());

            graph.get(edge.get(0)).add(edge.get(1));
//            graph.get(edge.get(1)).add(edge.get(0));
        }
        return graph;
    }

    void DFS(Map<String,List<String>> graph){
        Set<String> visited=new HashSet<>();
        Stack<String> stack=new Stack();

        for (String node: graph.keySet()) stack.push(node);
//        stack.push("o");
        System.out.println(stack);
        while (!stack.isEmpty()){
            String curr=stack.pop();
            if (!visited.contains(curr)){
                visited.add(curr);
                System.out.println(curr);
                for (String child: graph.get(curr)){
                    if (!visited.contains(child)){
                        stack.push(child);
                    }
                }
            }
        }
    }

    public void DFSRecursion(Map<String, List<String>> graph){
        Set<String> visited =new HashSet<>();
        for(String node: graph.keySet()){
            dfs(node, visited, graph);
        }
    }
    public void dfs(String currVertex, Set<String> visited,Map<String, List<String>> graph){
        if (!visited.contains(currVertex)) {
            visited.add(currVertex);
            System.out.println(currVertex);
            for (String child : graph.get(currVertex)) {
                if (!visited.contains(child)) {
                    dfs(child, visited, graph);
                }
            }
        }
    }

    public void BFS(Map<String, List<String>> graph){
        Set<String> visited=new HashSet<>();
        Queue<String> queue=new LinkedList();
        for (String node: graph.keySet()) queue.add(node);
//        queue.add("o");
        while (!queue.isEmpty()){
//            System.out.println(" queue : "+queue);
            String curr=queue.poll();
            if (!visited.contains(curr)){
                visited.add(curr);
                System.out.println(curr);
                for (String child: graph.get(curr)){
                    if (!visited.contains(child)){
                        queue.add(child);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        List<List<String>> edges=List.of(
                List.of("q","s"),
                List.of("q","b"),
                List.of("s","b"),
                List.of("a","q"),
                List.of("o","n"),
                List.of("z","n"),
                List.of("z","a"),
                List.of("n","a")
                );

        GraphDFS_BFS obj=new GraphDFS_BFS();
        Map<String,List<String>> graph=obj.getGraph(edges);
        System.out.println(graph);
        System.out.println("dfs");
        obj.DFS(graph);
        System.out.println("DFS REC");
        obj.DFSRecursion(graph);
        System.out.println("BFS");
        obj.BFS(graph);

    }
}
