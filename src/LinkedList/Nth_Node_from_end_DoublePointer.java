package LinkedList;

import java.security.PublicKey;

public class Nth_Node_from_end_DoublePointer {
    public static void printList(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+ "->");
            curr=curr.next;
        }
        System.out.println("null");
    }
    public static Node printNthFromLast(Node head, int n){
        Node main_ptr=head;
        Node ref_ptr=head;
        Node curr=head;

        int distance=0;
        while (curr!=null){
                if(distance<n) {
                    ref_ptr = ref_ptr.next;
                    distance++;
                }
                else {
                    main_ptr=main_ptr.next;
                    ref_ptr=ref_ptr.next;
                }
                curr=curr.next;
        }
        return main_ptr;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        Node head=null;

        for (int i = arr.length-1; i >=0 ; i--) {
            head=new Node(arr[i],head);
        }
        printList(head);
        System.out.println(printNthFromLast(head,0).data);

    }
}
