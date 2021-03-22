package CircularLinkedList;

public class CircularLinkedList {

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

    public void addNodeAtEnd(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }else {
            tail.next =newNode;
        }
        tail=newNode;
        tail.next =head;
    }

    public void addNodeAtPosition(int position, int data){
        Node newNode=new Node(data);
        Node curr=head;
        int count=2;
        if(position==1){
            newNode.next=head;
            head=newNode;
            tail.next=head;
            return;
        }
        else{
            do{
                if(position==count){
                    newNode.next=curr.next;
                    curr.next=newNode;
                    break;
                }
                curr=curr.next;
                count++;
            }while (curr!=head);
        }
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

    public void deleteNode(int data){
        Node curr=head;
//        empty
        if(head==null)
            return;
        if((int)head.data==data){
//            single node
            if(tail==head){
                head=null;
                tail=null;
            } else {
//                more than one node, delete head
                head=head.next;
                tail.next=head;
            }
        }
        do{
            if((int)curr.next.data==data){
                curr.next=curr.next.next;
                break;
            }
            curr=curr.next;
        }while (curr.next!=head);
//        while (curr.next!=head){
//            if((int)curr.next.data==data){
//                curr.next=curr.next.next;
//                break;
//            }
//            curr=curr.next;
//        }
    }
    public boolean containsNode(int data){
        Node curr=head;
        if(head==null)
            return false;
        do{
            if((int)curr.data==data){
                System.out.println("data found : "+curr.data);
                return true;
            }
            curr=curr.next;
        }while (curr!=head);

        return false;
    }

    public static void main(String[] args) {
        CircularLinkedList cl=new CircularLinkedList();
        System.out.println(" insertion at end");
        cl.addNodeAtFront(6);
        cl.traverse();
        cl.addNodeAtFront(7);
        cl.traverse();
        cl.addNodeAtFront(8);
        cl.traverse();
        cl.addNodeAtFront(9);
        cl.traverse();
        cl.addNodeAtFront(10);
        cl.traverse();
        cl.deleteNode(7);
        System.out.println("final");
        cl.traverse();
//        System.out.println(cl.containsNode(8));
//
//        cl.addNodeAtPosition(5,2);
//        cl.traverse();
    }
}
