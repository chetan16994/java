package randomPrac;

import java.util.*;

public class Graph1 {

    public Map<int[][], Map<String,Integer>> getGraphMatrix(List<List<String>> edges){

        Map<String, Integer> maping=new HashMap<>();

        for (List<String> edge: edges){
            maping.putIfAbsent(edge.get(0),maping.size());
            maping.putIfAbsent(edge.get(1), maping.size());
        }
        int[][] mat=new int[maping.size()][];

        for (List<String> edge:edges){
            mat[maping.get(edge.get(0))][maping.get(edge.get(1))]=1;
            mat[maping.get(edge.get(1))][maping.get(edge.get(0))]=1;
        }
        Map<int[][], Map<String, Integer> > ans=new HashMap<>();
        ans.put(mat,maping);
        return ans;
    }

    public Map<String,List<String>> getGraph(List<List<String>> edges){
        Map<String,List<String>> graph=new HashMap<>();

        for (List<String> edge: edges){

            graph.putIfAbsent(edge.get(0),new LinkedList<>());
            graph.putIfAbsent(edge.get(1),new LinkedList<>());

            graph.get(edge.get(0)).add(edge.get(1));
            graph.get(edge.get(1)).add(edge.get(0));
        }
        return graph;
    }
    public static void main(String[] args) {
        Graph1 obj=new Graph1();
        List<List<String>> edges=List.of(List.of("a", "b"),List.of("a","c"),List.of("c", "d"));
        System.out.println(obj.getGraph(edges));
    }
}
