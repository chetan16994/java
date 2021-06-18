package Tree;

public class Search {
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

//    public void insert(int i){
//        root = insert(root, i);
//    }

    public Node insert(Node node,int data){
        if (node==null){
            return new Node(data);
        }
        if (data< node.data)
            node.left=insert(node.left,data);
        else if (data> node.data)
            node.right=insert(node.right,data);

        return node;
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

    public Node searchElement(int searchedValue){
        Node current=root;
        while (current.data!=searchedValue){
            if (current.data>searchedValue)
                current=current.left;
            else
                current=current.right;
            if (current==null)
                return null;
        }
        return current;
    }
    public static void main(String[] args) {
        Search obj=new Search();

        root=obj.insert(root,1);
//        obj.insert(root,1);
        obj.insert(root,33);
        obj.insert(root,13);
        obj.insert(root,42);
        obj.insert(root,15);

        System.out.println("pre order");
        obj.preOrder(root);
        System.out.println("post order");
        obj.postOrder(root);
        System.out.println("in order");
        obj.inOrder(root);

        System.out.println(obj.searchElement(151) != null ? "151 is present":"151 is not present");
    }
}
