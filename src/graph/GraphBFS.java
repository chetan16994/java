package graph;

import java.util.Iterator;
import java.util.LinkedList;

public class GraphBFS {
    int vertex;
    LinkedList<Integer> list[];

    public GraphBFS(int vertex){
        this.vertex=vertex;
        list=new LinkedList[vertex];
        for (int i = 0; i < vertex; i++) {
            list[i]=new LinkedList<>();
        }
    }

    public void addEdge(int source, int destination){
        list[source].addFirst(destination);
        list[destination].addFirst(source);
    }

    public void printGraph(){
        for (int i = 0; i < vertex; i++) {
            if (list[i].size()>0){
                System.out.println("Vertex "+i+" is connected to : ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.println(list[i].get(j)+ " ");
                }
                System.out.println();
            }
        }
    }
    void BFS(int s){
        boolean visited[]=new boolean[vertex];
        visited[s]=true;

        LinkedList<Integer> queue=new LinkedList<>();
        queue.add(s);

        while (!queue.isEmpty()){
            s=queue.poll();
            System.out.println(s);

            for (int n : list[s]) {
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    public static void main(String[] args) {
        GraphBFS graph = new GraphBFS(5);
        graph.addEdge(0,1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.printGraph();

        graph.BFS(3);
    }
}
