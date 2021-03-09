package LinkedList;

public class SumLinkedList {
    public static void printList(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" -> ");
            curr=curr.next;
        }
        System.out.println("null");
    }
    public static int sumLinkedList(Node head){
        Node curr=head;
        int sum=0;
        while (curr.next!=null){
            sum=sum+(int)curr.getData();
            curr=curr.next;
        }
        sum=sum+(int)curr.data;
        return sum;
    }
    public static void main(String[] args) {
        int[] arr={1,7};
        Node head=null;
        for (int i = arr.length-1; i >=0 ; i--) {
            head=new Node(arr[i],head);
        }
        printList(head);
        System.out.println("sum of linked list : "+sumLinkedList(head));

    }
}
