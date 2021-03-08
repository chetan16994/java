package LinkedList;

public class Interchange_last_and_first_Node {
    public static void printList(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" -> ");
            curr=curr.next;
        }
        System.out.println("null");
    }
    public static Node push(int data,  Node head){
        Node newNode=new Node(data,head);
        return newNode;
    }
    public static Node constructList(int[] arr){
        Node head=null;
        for (int i = arr.length-1; i>=0  ; i--) {
            head=push(arr[i], head);
        }
        return head;
    }
    public static Node moveNode(Node head){

//        only one node hence return as it is
        Node curr=head;
        if(curr.next==null)
            return head;

//        just two nodes hence swap
        if(curr.next.next==null){
            Node newHead=curr.next;
            newHead.next=head;
            head.next=null;
            return newHead;
        }

//        traverse and look for second last node and store second last node in curr
//        store original tail in a node named originalNode
//        and make it point to original head's next (second node)
//        point second last node (curr) to original head
//        finally point original head to null
        while (curr.next.next!=null){
            curr=curr.next;
        }
        Node originalTail=curr.next;
        originalTail.next=head.next;
        curr.next=head;
        head.next=null;
        return originalTail;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        Node head=constructList(arr);
        printList(head);
        System.out.println("linked list after moving ");
        Node newHead=moveNode(head);
        printList(newHead);
    }
}
