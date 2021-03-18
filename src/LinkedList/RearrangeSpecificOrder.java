package LinkedList;


//https://www.techiedelight.com/rearrange-the-linked-list-specific-manner/


public class RearrangeSpecificOrder {
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

        Node dummyFirst=new Node();
        Node dummySecond=new Node();

        Node first=dummyFirst;
        Node second=dummySecond;

        Node curr=head;

        while (curr!=null){
            first.next=curr;
            first=first.next;
            if(curr.next !=null){
                second.next=curr.next;
                second=second.next;
//                System.out.println(second.data);
                curr=curr.next;
            }
            curr=curr.next;
        }

        first.next=dummySecond.next;
        second.next=null;
        head=dummyFirst.next;

        return head;
    }

    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        Node head1=null;

        for (int i = arr1.length-1; i >=0 ; i--) {
            head1=new Node(arr1[i],head1);
        }
        printList(head1);
        head1=rearrange(head1);
        printList(head1);
    }
}
