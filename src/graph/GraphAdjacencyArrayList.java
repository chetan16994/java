package graph;

import java.util.ArrayList;

public class GraphAdjacencyArrayList {

    static void addEdge(ArrayList<ArrayList<Integer>> list,int source, int destination){
        list.get(source).add(destination);
        list.get(destination).add(source);
    }

    static void printGraph(ArrayList<ArrayList<Integer>> list){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).size()>0){
                System.out.println("Vertex "+i+" is connected to : ");
                for (int j = 0; j < list.get(i).size(); j++) {
                    System.out.println(list.get(i).get(j)+ " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int vertex = 5;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(vertex);

        for (int i = 0; i < vertex; i++)
            list.add(new ArrayList<Integer>());

        addEdge(list,0,1);
        addEdge(list,0, 4);
        addEdge(list,1, 2);
        addEdge(list,1, 3);
        addEdge(list,1, 4);
        addEdge(list,2, 3);
        addEdge(list,3, 4);
        printGraph(list);
    }
}

