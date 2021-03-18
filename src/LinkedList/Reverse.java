package LinkedList;

public class Reverse {
    public static void printList(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+ "->");
            curr=curr.next;
        }
        System.out.println("null");
    }
    public static Node reverse(Node head){
        Node curr=head;
        Node prev=null;
        Node next=null;

        while (curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            System.out.println(prev.data);
            curr=next;
        }
        head=prev;
        return(head);
    }

    public static void main(String[] args) {
        String[] arr={"a","b","c","d"};
        Node head=null;
        for (int i = arr.length-1; i >=0 ; i--) {
            head=new Node(arr[i],head);
        }
        printList(head);
        Node newHead=reverse(head);
        printList(newHead);
    }
}
