package CircularLinkedList;

public class ExchangeFirstAndLast {

    public static Node head = null;
    public static Node tail = null;

    public static void traverse(){
        Node currentNode=head;
        if(head!=null){
            do{
                System.out.print(currentNode.data+" ");
                currentNode=currentNode.next;
            }while (currentNode!=head);
            System.out.println(" ");
        }
    }

    public static void addNodeAtFront(int data){
        Node newNode=new Node(data);
        if (head == null) {
            head=newNode;
            tail=newNode;
        }else{
            newNode.next = head;
            head=newNode;
        }
        tail.next=head;
    }
    public static void exchange(){
        Node curr=head;

        if (curr.next.next==head){
            head=curr.next;
            tail=curr;
            return;
        }
        do {
            curr=curr.next;
            if (curr.next.next==head){
                Node temp2=curr.next;
                curr.next.next=head.next;
                curr.next=head;
                head.next=temp2;


                head=head.next;
                tail=curr.next;

            }
        }while (curr!=head);
//        System.out.println(curr.data);
    }

    public static void main(String[] args) {
        System.out.println(" insertion at front");
        addNodeAtFront(8);
        addNodeAtFront(6);
        addNodeAtFront(4);
//        obj.addNodeAtFront(3);
        addNodeAtFront(2);
//        obj.addNodeAtFront(1);
        traverse();
        exchange();
        traverse();
        System.out.println(head.data);
        System.out.println(tail.data);
    }
}
