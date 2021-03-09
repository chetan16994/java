package LinkedList;

public class RearrangeLastToFirstNode {
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

//    public static Node constructList(int[] arr){
//        Node head=null;
//        for (int i = arr.length-1; i>=0  ; i--) {
//            head=push(arr[i], head);
//        }
//        return head;
//    }

    public static Node rearrange(Node head){
        Node curr=head;

//        if single node return as it is
        if(curr.next==null)
            return head;

//        traverse to find second last node (curr)
//        make original tail as new head and make it point to original head
//        make second last node (new tail) points to null
        while (curr.next.next!=null){
            curr=curr.next;
        }
        Node newHead=curr.next;
        newHead.next=head;
        curr.next=null;
        return newHead;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
//        Node head=constructList(arr);

        Node head = null;
        for (int i = arr.length - 1; i >= 0; i--) {
            head = new Node(arr[i], head);
        }
        printList(head);
        Node newHead=rearrange(head);
        System.out.println("list after re arranging");
        printList(newHead);
    }
}
