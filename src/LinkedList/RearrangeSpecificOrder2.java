package LinkedList;


//https://www.techiedelight.com/rearrange-the-linked-list-specific-manner/


public class RearrangeSpecificOrder2{
    public static void printList(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" -> ");
            curr=curr.next;
        }
        System.out.println("null");
    }
    public static Node rearrange(Node head){

        // empty list or one node
        if (head == null || (head).next == null) {
            return head;
        }

        // Find the middle point using tortoise and hare
        // method
//        we used fast ptr = head.next cuz we want the middle point to be 3 in case of 1-6
//        so we can split exactly later
        Node fast_ptr=head.next;
        Node slow_ptr=head;

        while (fast_ptr!=null && fast_ptr.next!=null){
            fast_ptr=fast_ptr.next.next;
            slow_ptr=slow_ptr.next;
        }

//      split into 2 list
        Node second=slow_ptr.next;
        Node first=head;
        slow_ptr.next=null;

        second=reverse(second);

        printList(first);
        printList(second);

//        dummy node to form a new list
        Node dummy=new Node();
        Node curr=dummy;

//        storing alternatively
        while (first!=null || second!=null){

            if(first!=null) {
                curr.next = first;
                curr = curr.next;
                first = first.next;
            }
            if(second!=null) {
                curr.next = second;
                curr = curr.next;
                second = second.next;
            }
        }
        dummy=dummy.next;
        return dummy;
    }
    public static Node reverse(Node head){
        Node curr=head;
        Node prev=null;
        Node next=null;

        while (curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
        return(head);
    }

    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,6};
        Node head1=null;

        for (int i = arr1.length-1; i >=0 ; i--) {
            head1=new Node(arr1[i],head1);
        }
        printList(head1);
        head1=rearrange(head1);
        printList(head1);
    }
}
