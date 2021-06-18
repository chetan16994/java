package Tree;

public class DeleteBST {

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

    public Node insert(Node node, int data){
        if (node==null){
            return new Node(data);
        }
        if (data< node.data)
            node.left=insert(node.left,data);
        else if (data> node.data)
            node.right=insert(node.right,data);

        return node;
    }

    public void inOrder(Node node){
        if(node != null){
            inOrder(node.left);
            System.out.println(node.data);
            inOrder(node.right);
        }
    }

//    void deleteKey(int key) {
//        root = deleteRec(root, key);
//    }

    Node deleteRec(Node node, int key){

        if (node == null)
            return node;

        if (key < node.data)
            node.left = deleteRec(node.left, key);
        else if (key > node.data)
            node.right = deleteRec(node.right, key);

        else {
            if (node.left == null)
                return node.right;
            else if (node.right == null)
                return node.left;

            node.data = minValue(node.right);
            node.right = deleteRec(node.right, node.data);
        }

        return node;
    }

    int minValue(Node node)
    {
        int minv = node.data;
        while (node.left != null)
        {
            minv = node.left.data;
            node = node.left;
        }
        return minv;
    }

    public static void main(String[] args) {
        DeleteBST obj=new DeleteBST();
        root=obj.insert(root,32);
//        obj.insert(root,1);
        obj.insert(root,33);
        obj.insert(root,13);
        obj.insert(root,42);
        obj.insert(root,15);
        obj.insert(root,12);
        obj.insert(root,37);
        obj.insert(root,48);

        obj.inOrder(root);

        System.out.println("\nDelete 42");
        obj.deleteRec(root,42);

        obj.inOrder(root);

    }
}
