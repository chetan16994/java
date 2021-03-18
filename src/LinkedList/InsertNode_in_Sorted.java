package LinkedList;

public class InsertNode_in_Sorted {
    public static void printList(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" -> ");
            curr=curr.next;
        }
        System.out.println("null");
    }
    public static Node insert(Node head,Node new1){
        Node curr=head;
        Node old=null;
        while (curr!=null){
            if((int)new1.data>=(int)curr.data && (int)new1.data<=(int)curr.next.data){
                old=curr.next;
                curr.next=new1;
                curr.next.next=old;
                break;
            }
            curr=curr.next;
        }
        return head;
    }
    public static void main(String[] args) {
        int[] arr1={1,2,2,4,5,6};
        Node head1=null;

        for (int i = arr1.length-1; i >=0 ; i--) {
            head1=new Node(arr1[i],head1);
        }
        printList(head1);
        Node newHead=insert(head1,new Node(3,null));
        printList(newHead);
    }
}