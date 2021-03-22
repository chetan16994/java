package CircularLinkedList;

public class SplitIntoTwoHalves {

    static Node list1,list2;
    public Node head = null;
    public Node tail = null;

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
    public void traverse(Node head){
        Node curr=head;
        do{
            System.out.print(curr.data+" ");
            curr=curr.next;
        }while (curr!=head);
        System.out.println("");
    }

    public void split(){

        Node slow=head;
        Node fast=head;

        do{
            slow=slow.next;
            fast=fast.next.next;
        }while ( fast.next!=head && fast.next.next!=head);

        System.out.println("middle : "+slow.data);

//       assign head of original List to first list
//        now find the end of first list (middle point)
        list1=head;
        Node curr1=head;
        do{
            curr1=curr1.next;
        }while (curr1.data!=slow.data);


//        assign head of second list to next of middle/split point
//        now find till the original list ends
        list2=slow.next;
        Node curr2=list2;
        do{
            curr2=curr2.next;
        }while (curr2.next!=head);

//        assign the tail of second list to its new head (at start of second list)
        curr2.next=list2;
//        assign tail of list1 to first head
        curr1.next=head;

        traverse(list1);
        traverse(list2);
    }
    public static void main(String[] args) {

        SplitIntoTwoHalves obj=new SplitIntoTwoHalves();
        System.out.println(" insertion at front");
        obj.addNodeAtFront(6);
        obj.addNodeAtFront(5);
        obj.addNodeAtFront(4);
        obj.addNodeAtFront(3);
        obj.addNodeAtFront(2);
        obj.addNodeAtFront(1);

        obj.traverse();

//        Node head=null;
//        head = new Node(1);
//        head.next = new Node(2);
//        head.next.next = new Node(3);
//        head.next.next.next = new Node(4);
//        head.next.next.next.next = new Node(5);
//        head.next.next.next.next.next = new Node(6);
//        head.next.next.next.next.next.next = head;
//
//        obj.traverse(head);

        obj.split();

    }
}
