package LinkedList;

public class RemoveDuplicate_unsorted_2_Loops {
    public static void printList(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+ "->");
            curr=curr.next;
        }
        System.out.println("null");
    }

    public static Node removeDuplicate2Loops(Node head){

        Node curr=head;

        while(curr!=null){
            Node temp=curr;
            while (temp.next!=null){
                if(temp.next.data==curr.data){
                    temp.next=temp.next.next;
//                    break;
                }else{
                    temp=temp.next;
                }
            }
            curr=curr.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] arr={1,1,5,2,1,5,7,2,3,3,4,4};
        Node head=null;

        for (int i = arr.length-1; i >=0 ; i--) {
            head=new Node(arr[i],head);
        }
        printList(head);
        Node head1=removeDuplicate2Loops(head);
        printList(head1);
    }
}
