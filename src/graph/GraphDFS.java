package graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class GraphDFS {
    int vertex;
    LinkedList<Integer>[] list;

    public GraphDFS(int vertex){
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
    void DFSIterative(int s){
        boolean[] visited =new boolean[vertex];
        Stack<Integer> st=new Stack<>();
        st.add(s);

        visited[s]=true;
        while (!st.isEmpty()){
            s=st.pop();
            System.out.println(s);
            for (int n:list[s]){
                if (!visited[n]){
                    st.push(n);
                    visited[n]=true;
                }
            }
        }
    }

    void DFS(int s){
        boolean[] visited =new boolean[vertex];
        DFSUtil(s,visited);
    }
    void DFSUtil(int s, boolean[] visited){
        visited[s]=true;
        System.out.println(s);
        for (int n:list[s]){
            if (!visited[n]){
                DFSUtil(n,visited);
            }
        }
    }

    public static void main(String[] args) {
        int vertex=7;
        GraphDFS graph = new GraphDFS(vertex);
        graph.addEdge(0,1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(4, 5);
        graph.addEdge(4, 6);

//        graph.printGraph();

        graph.DFSIterative(3);
        graph.DFS(3);
    }
}
