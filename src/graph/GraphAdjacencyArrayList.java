package graph;

import java.util.ArrayList;

public class GraphAdjacencyArrayList {
    int vertex ;
    ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    public GraphAdjacencyArrayList(int vertex){
        this.vertex=vertex;
        for (int i = 0; i < vertex; i++)
            list.add(new ArrayList<Integer>());
    }

    void addEdge(int source, int destination){
        list.get(source).add(destination);
        list.get(destination).add(source);
    }

    void printGraph(){
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
        GraphAdjacencyArrayList graph=new GraphAdjacencyArrayList(5);
        graph.addEdge(0,1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.printGraph();
    }
}

