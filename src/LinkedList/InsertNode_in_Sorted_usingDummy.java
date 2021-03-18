package LinkedList;

public class InsertNode_in_Sorted_usingDummy {
    public static void printList(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" -> ");
            curr=curr.next;
        }
        System.out.println("null");
    }

    public static Node insertUsingDummy(Node head,Node new1){
        Node dummy=new Node();
        Node curr=dummy;
        dummy.next=head;

        while (curr.next!=null && (int)curr.next.data < (int)new1.data){
            curr=curr.next;
        }
        new1.next=curr.next;
        curr.next=new1;
        return dummy.next;
    }
    public static void main(String[] args) {
        int[] arr1={1,2,2,4,5,6};
        Node head1=null;

        for (int i = arr1.length-1; i >=0 ; i--) {
            head1=new Node(arr1[i],head1);
        }
        printList(head1);
        Node newHead=insertUsingDummy(head1,new Node(8,null));
        printList(newHead);
    }
}
