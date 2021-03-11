package LinkedList;

public class CheckPalindrome_MIddle {
    public static void printList(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+ "->");
            curr=curr.next;
        }
        System.out.println("null");
    }

    public static Boolean checkForPalindromeMiddle(Node head){

        Node fast=head;
        Node slow=head;
        Node previous_slow=head;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            previous_slow=slow;
            slow=slow.next;
        }
        Node secondHalf=slow;
        if(fast!=null)
            secondHalf=slow.next;
        previous_slow.next=null;

        Node reversedHead=reverse(secondHalf);
        return compareList(head,reversedHead);
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
    public static Boolean compareList(Node head1,Node head2){
        Node curr1=head1;
        Node curr2=head2;

        while (curr1!=null){
            if(curr1.data!=curr2.data)
                return false;
            curr1=curr1.next;
            curr2=curr2.next;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] arr={"a","b","b","a"};
        Node head=null;

        for (int i = arr.length-1; i >=0 ; i--) {
            head=new Node(arr[i],head);
        }
        printList(head);
        System.out.println(checkForPalindromeMiddle(head));
    }
}
