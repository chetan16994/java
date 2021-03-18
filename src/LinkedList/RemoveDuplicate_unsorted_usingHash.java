package LinkedList;

import java.util.HashMap;
import java.util.HashSet;

public class RemoveDuplicate_unsorted_usingHash {
    public static void printList(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+ "->");
            curr=curr.next;
        }
        System.out.println("null");
    }

    public static Node removeDuplicateHash(Node head){
        Node curr=head;
        Node prev=null;
        HashSet<Integer> hs=new HashSet<>();
        while(curr!=null){
            if(!hs.contains(curr.data)) {
                hs.add((int) curr.data);
                prev=curr;
            }
            else {
                prev.next = curr.next;
            }
            curr=curr.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] arr={4,1,5,2,2,1,5,7,2,3,4};
        Node head=null;

        for (int i = arr.length-1; i >=0 ; i--) {
            head=new Node(arr[i],head);
        }
        printList(head);
        Node head1=removeDuplicateHash(head);
        printList(head1);
    }
}
