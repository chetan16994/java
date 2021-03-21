package CircularLinkedList;

public class CircularLinkedList {

    public Node head = null;
    public Node tail = null;

    public void addNode(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }else {
            tail.next =newNode;
        }
        tail=newNode;
        tail.next =head;
    }
    public void traverse(){
        Node currentNode=head;
        if(head!=null){
            do{
                System.out.println(currentNode.data);
                currentNode=currentNode.next;
            }while (currentNode!=head);
        }
    }

    public void deleteNode(int data){
        Node curr=head;
//        empty
        if(head==null)
            return;
        if(head.data==data){
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
        while (curr.next!=head){
            if(curr.next.data==data){
                curr.next=curr.next.next;
                break;
            }
            curr=curr.next;
        }
    }
    public boolean containsNode(int data){
        Node curr=head;
        if(head==null)
            return false;
        do{
            if(curr.data==data){
                System.out.println("data found : "+curr.data);
                return true;
            }
            curr=curr.next;
        }while (curr!=head);

        return false;
    }

    public static void main(String[] args) {
        CircularLinkedList cl=new CircularLinkedList();
        cl.addNode(6);
        cl.addNode(7);
        cl.addNode(8);
        cl.addNode(9);
        cl.addNode(10);
        cl.traverse();
        cl.deleteNode(10);
        System.out.println("final");
        cl.traverse();
        System.out.println(cl.containsNode(8));
    }
}
