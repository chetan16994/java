package LinkedList;

public class DeleteByPositionLinkedList {
    public static void printList(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" -> ");
            curr=curr.next;
        }
        System.out.println("null");
    }
    public static Node deleteByPosition(Node head,int pos){
        Node curr=head;
        int counter=2;
        if (pos==1){
            head=curr.next;
            return head;
        }
        while (curr.next.next!=null && counter!=pos){
            curr=curr.next;
            counter++;
        }
        if(counter==pos)
            curr.next=curr.next.next;
        else
            System.out.println("position out of range");
        return head;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        Node head=null;
        for (int i = arr.length-1; i >=0 ; i--) {
            head=new Node(arr[i],head);
        }
        printList(head);
        Node newHead=deleteByPosition(head,6);
        printList(newHead);
    }
}
