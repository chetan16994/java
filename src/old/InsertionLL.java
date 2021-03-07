package old;

public class InsertionLL {
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    static void push(int newData){
        Node newNode=new Node(newData);
        newNode.next=head;
        head=newNode;
    }

    static void append(int newdata1){
        Node newnode= new Node(newdata1);
        if (head==null){
            head=new Node(newdata1);
            return;
        }

        Node last=head;
        while (last.next!=null)
            last=last.next;

        last.next=newnode;

    }

    static void insertAfter(Node prev,int newData){
        Node newnode=new Node(newData);
        if (prev==null){
            System.out.println("given previous node cant be null");
            return;
        }
        newnode.next=prev.next;
        prev.next=newnode;
    }

    static void printLL(){
        Node tnode=head;
        while (tnode!=null) {
            System.out.println(tnode.data + "->");
            tnode = tnode.next;
        }
        System.out.println("NULL");

    }
    public static void main(String[] args) {
        for (int i = 1; i <5; i++) {
            if (i==4)
                insertAfter(head,33333);
            push(i);
        }
        System.out.println("inserted after given node");
        printLL();
        System.out.println("inserted at first");
        push(0);
        printLL();
        System.out.println("inserted at last");
        append(6);
        printLL();

    }
}
