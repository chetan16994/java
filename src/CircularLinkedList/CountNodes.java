package CircularLinkedList;

public class CountNodes {
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

    public static void count(){
        int count=0;
        Node curr=head;

        do{
            count++;
            curr=curr.next;
        }while (curr!=head);
        System.out.println("nodes : "+count);

    }

    public static void main(String[] args) {
        CountNodes obj=new CountNodes();
        System.out.println(" insertion at front");
        addNodeAtFront(8);
        addNodeAtFront(6);
        addNodeAtFront(4);
//        obj.addNodeAtFront(3);
        addNodeAtFront(2);
//        obj.addNodeAtFront(1);
        traverse();
        count();

    }
}
