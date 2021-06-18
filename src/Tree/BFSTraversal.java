package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BFSTraversal {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            left=right=null;
        }
    }

    static Node root;

    Node insertRec(Node node, int data){
        if (node==null)
            return new Node(data);
        if (data< node.data)
            node.left=insertRec(node.left,data);
        else if (data> node.data)
            node.right=insertRec(node.right,data);

        return node;
    }

    public void BFS(){
        Queue<Node> q=new LinkedList<Node>();
        q.add(root);

        while (!q.isEmpty()){
            Node tempNode=q.poll();
            System.out.println(tempNode.data);

            if (tempNode.left!=null)
                q.add(tempNode.left);
            if (tempNode.right!=null)
                q.add(tempNode.right);
        }
    }

    public static void main(String[] args) {
        BFSTraversal obj=new BFSTraversal();
        root=obj.insertRec(null, 32);
        obj.insertRec(root,33);
        obj.insertRec(root,13);
        obj.insertRec(root,12);
        obj.insertRec(root,15);
        obj.insertRec(root,42);
        obj.insertRec(root,37);
        obj.insertRec(root,48);

        obj.BFS();
    }
}
