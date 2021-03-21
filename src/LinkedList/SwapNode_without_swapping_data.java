package LinkedList;

public class SwapNode_without_swapping_data {
    public static void printList(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" -> ");
            curr=curr.next;
        }
        System.out.println("null");
    }
    public static Node swap(Node head, int a, int b){

        System.out.println("interchange "+a+" and "+b);

        if(a==b) {
            System.out.println("both element same");
            return head;
        }

        Node curr=head;
        Node first=null;
        Node second=null;
        Node first_prev=null;
        Node second_prev=null;

        int found=0;
        Boolean isHead=false;
        if((int)head.data==a || (int)head.data==b){
            found++;
            isHead=true;
            first=curr;
            first_prev=null;
        }
        while (curr.next!=null && found<2){
            if((int)curr.next.data==a || (int)curr.next.data==b ){
                found++;
                if(found==1){
                    first=curr.next;
                    first_prev=curr;
                }else{
                    second=curr.next;
                    second_prev=curr;
                }
            }
            curr=curr.next;
        }

        if(found!=2){
            System.out.println("element not found");
            return head;
        }

        if(first!=second_prev) {

            if (isHead) {
                Node temp=first.next;
                second_prev.next=first;
                first.next=second.next;
                second.next=temp;
                head=second;
            } else {
                Node temp=second.next;
                first_prev.next=second;
                second.next=first.next;
                second_prev.next=first;
                first.next=temp;
            }
        }else{
            if(isHead){
                head=second;
                Node temp=second.next;
                second.next=first;
                first.next=temp;
            }else {
                Node temp = second.next;
                first_prev.next = second;
                second.next = first;
                first.next = temp;
            }
        }
        return head;
    }
    public static void main(String[] args) {
        int[] arr1 = {10,15,12,13,20,14};
        Node head1 = null;

        for (int i = arr1.length - 1; i >= 0; i--) {
            head1 = new Node(arr1[i], head1);
        }
        printList(head1);
        printList(swap(head1,10,133));
    }
}
