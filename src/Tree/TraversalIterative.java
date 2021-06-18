package Tree;

public class TraversalIterative {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            left=null;
            right=null;
        }
    }
    static Node root;
    public void insert(int data){
        Node newNode=new Node( data);
        if (root==null){
            root=newNode;
        }else{
            Node current=root;
            Node parent;
            while(true){
                parent=current;
                if (data<current.data){
                    current=current.left;
                    if (current==null){
                        parent.left=newNode;
                        return;
                    }
                }else{
                    current=current.right;
                    if (current==null){
                        parent.right=newNode;
                        return;
                    }
                }
            }
        }

    }
    public void postOrder(Node node){
        if(node != null){
            postOrder(node.left);
            postOrder(node.right);
            System.out.println(node.data);
        }
    }
    public void inOrder(Node node){
        if(node != null){
            inOrder(node.left);
            System.out.println(node.data);
            inOrder(node.right);
        }
    }
    public void preOrder(Node node){
        if(node != null){
            System.out.println(node.data);
            preOrder(node.left);
            preOrder(node.right);
        }
    }
    public static void main(String[] args) {
        TraversalIterative obj=new TraversalIterative();
        obj.insert(1);
        obj.insert(2);
        obj.insert(3);
        obj.preOrder(root);
        obj.postOrder(root);
        obj.inOrder(root);
    }
}
