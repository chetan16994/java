package CircularLinkedList;

public class SortedInsert {

    public Node head = null;
    public Node tail = null;

    public void traverse(){
        Node currentNode=head;
        if(head!=null){
            do{
                System.out.print(currentNode.data+" ");
                currentNode=currentNode.next;
            }while (currentNode!=head);
            System.out.println(" ");
        }
    }

    public void addNodeAtFront(int data){
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

    public void insert(int data){
        Node newNode=new Node(data);

//        if empty just add
        if (head==null){
            head=newNode;
            tail=newNode;
        }
        Node curr=head;

//        if less than equal to head add at first
        if(data<=(int)head.data){
            newNode.next=head;
            head=newNode;
            tail.next=head;
            return;
        }
        do {
            if (data > (int)curr.data && data<=(int)curr.next.data){
                    Node temp=curr.next;
                    curr.next=newNode;
                    newNode.next=temp;
                return;
            }
            curr=curr.next;
        }while (curr.next!=head);
//        case if the data is greter than all list
        curr.next=newNode;
        newNode.next=head;
    }

    public static void main(String[] args) {
        SortedInsert obj=new SortedInsert();
        System.out.println(" insertion at front");
        obj.addNodeAtFront(8);
        obj.addNodeAtFront(6);
        obj.addNodeAtFront(4);
//        obj.addNodeAtFront(3);
        obj.addNodeAtFront(2);
//        obj.addNodeAtFront(1);
        obj.traverse();

        obj.insert(1);
        obj.traverse();

    }
}
