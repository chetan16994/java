package LinkedList;

public class IntersectionOf2SortedList {

    public static void printList(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" -> ");
            curr=curr.next;
        }
        System.out.println("null");
    }

    public static void intersection(Node head1,Node head2){
        Node curr1=head1;
        Node dummy=null;

        while(curr1!=null){
            Node curr2=head2;
            while (curr2!=null){
                if(curr1.data==curr2.data){
                    dummy=new Node(curr1.data,dummy);
                    System.out.println("--------------- found : "+curr1.data);
                    break;
                }
                if((int)curr1.data<(int)curr2.data)
                    break;
                curr2=curr2.next;
            }
            curr1=curr1.next;
        }
        printList(dummy);
    }

    public static void main(String[] args) {
        int[] arr1={1,2,3,4,6,9,10};
        Node head1=null;

        for (int i = arr1.length-1; i >=0 ; i--) {
            head1=new Node(arr1[i],head1);
        }
        int[] arr2={2,4,6,8};
        Node head2=null;

        for (int i = arr2.length-1; i >=0 ; i--) {
            head2=new Node(arr2[i],head2);
        }

        printList(head1);
        printList(head2);

        intersection(head1,head2);
    }
}
