package DoublyLinkedList;

public class DoublyLinkedList {
    public static Node head=null;
    public static Node tail=null;

    public static void addAtEnd(int data){
        Node newNode=new Node(data);
        if (head==null){
            head=newNode;
            tail=newNode;
            head.prev=null;
            tail.next=null;
        }else{
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
            tail.next=null;
        }
    }

    public static void addAtFront(int data){
        Node newNode=new Node(data);
        if (head==null){
            head=newNode;
            tail=newNode;
            tail.next=null;
            head.prev=null;
        }else{
            head.prev=newNode;
            newNode.next=head;
            head=newNode;
            head.prev=null;
        }
    }

    public static void delete(int data){
        Node curr=head;

//        if head
        if((int)head.data==data){
            head=head.next;
            head.prev=null;
            return;
        }
        else{
            while (curr.next.next!=null){
                if((int)curr.next.data==data){
                    Node deleted=curr.next;
                    Node temp=curr.next.next;
                    curr.next=curr.next.next;
                    temp.prev=curr;

                    deleted.prev=null;
                    deleted.next=null;

                    return;
                }
                curr=curr.next;
            }
//f tail
            if((int)curr.next.data==data){
                Node deleted=curr.next;
                curr.next=null;
                tail=curr;

                deleted.prev=null;
                deleted.next=null;
            }
        }
    }

    public static void traverse(){
        Node curr=head;
        while (curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        DoublyLinkedList d=new DoublyLinkedList();
        addAtEnd(1);
        traverse();
        addAtEnd(2);
        traverse();
        addAtEnd(3);
        traverse();
        addAtEnd(4);
        traverse();

        delete(4);
        traverse();

//        System.out.println(head.prev);
//        System.out.println(tail.next);


//        addAtFront(1);
//        traverse();
//        addAtFront(2);
//        traverse();
//        addAtFront(3);
//        traverse();
//        addAtFront(4);
//        traverse();
    }
}
