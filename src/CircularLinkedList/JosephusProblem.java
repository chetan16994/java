package CircularLinkedList;

public class JosephusProblem {
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

    public static void getJosephusPosition(int skip){
        Node curr=head;
        do{
            int i=1;
            while (i < skip - 1) {
                 curr = curr.next;
                 i++;
            }
            curr.next=curr.next.next;
            if (skip==2){
                curr=curr.next;
            }
        }while (curr.next!=curr);
        System.out.println("survived place : "+curr.data);
    }

    public static void main(String[] args) {
        System.out.println(" insertion at front");
        for (int i = 5; i >0; i--) {
            addNodeAtFront(i);
        }
        traverse();
        getJosephusPosition(3);
    }
}
