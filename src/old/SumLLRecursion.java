package old;

public class SumLLRecursion {

//Node head;

class Node{
    int data;
    Node next;
}

Node push(Node head2,int newdata){
    Node new_node=new Node();
    new_node.data=newdata;
    new_node.next=head2;

    return new_node;
}
static void printLL(Node head){
    Node nd=head;
    while(nd!=null){
        System.out.print(nd.data+ "->");
        nd=nd.next;
    }
    System.out.println("null");
}
Node constuctNode(int[] keys){
    Node head=null;
    for (int i = keys.length - 1; i >= 0; i--) {
        head=push(head,keys[i]);
    }

    return head;
}

static int sum=0;


public static void sumNode(Node head){
//    System.out.println(head.data);

    if (head==null)
        return;

    sumNode(head.next);
    sum=sum+head.data;

}
static int sumUtil(Node head){
    sum=0;
    sumNode(head);
    return sum;
}

    public static void main(String[] args) {
        SumLLRecursion l1=new SumLLRecursion();
        int[] keys = { 1, 2, 3, 4 };
        Node head=l1.constuctNode(keys);
        printLL(head);
        System.out.println("sum is "+sumUtil(head));
    }
}
