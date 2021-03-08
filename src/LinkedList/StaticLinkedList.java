package LinkedList;

public class StaticLinkedList {

    public static void printList(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.println(curr.data+ "-->");
            curr=curr.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
//        Node n1=new Node("ab",null);
//        Node n2=new Node("cd",n1);
//        System.out.println( n2.getNext().getData());

        Node e=new Node(5,null);
        Node d=new Node(4,e);
        Node c=new Node(3,d);
        Node b=new Node(2,c);
        Node a=new Node(1,b);

        Node head=a;
        printList(head);
    }
}
