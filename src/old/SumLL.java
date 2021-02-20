package old;

public class SumLL {

Node head;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }
}
void push(int data){
    Node new_node=new Node(data);
    new_node.next=head;
    head=new_node;
}
void printLL(){
    Node nd=head;
    while(nd!=null){
        System.out.print(nd.data+ "->");
        nd=nd.next;
    }
    System.out.println("null");
}
void constuctNode(int[] keys){
    for (int i = keys.length - 1; i >= 0; i--) {
        push(keys[i]);
    }
    printLL();
}
public void sumNode(int[] keys){
    constuctNode(keys);
    int sum=0;
    Node temp=head;
    while(temp!=null){
        sum=sum+temp.data;
        temp=temp.next;
    }
    System.out.println("summ is "+sum);
}

    public static void main(String[] args) {
        SumLL l1=new SumLL();
        int[] keys = { 1, 2, 3, 4 };
//        l1.constuctNode(keys);
//        l1.printLL();
        l1.sumNode(keys);
    }
}
