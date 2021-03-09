package LinkedList;

public class MiddleLinkedList_counter {
    public static void printList(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+ "->");
            curr=curr.next;
        }
        System.out.println("null");
    }
    public static Node middleCounter(Node head){
        Node curr=head;
        Node mid=head;
        int counter=0;
        while (curr!=null){
            if((counter%2)==1){
                mid=mid.next;
            }
            counter++;
            curr=curr.next;
        }
        return mid;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        Node head=null;

        for (int i = arr.length-1; i >=0 ; i--) {
            head=new Node(arr[i],head);
        }
        printList(head);
        System.out.println(middleCounter(head).data);
    }
}
