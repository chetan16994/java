package LinkedList;

public class DeleteLinkedList {
    public static void printList(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" -> ");
            curr=curr.next;
        }
        System.out.println("null");
    }

    public static Node deleteByKey(Node head,int key){
        Node curr=head;

//      condition 1: if ket at head
//        make the next node a new head and return
        if((int) curr.data==key) {
            System.out.println("found at head ");
            Node newHead=curr.next;
            System.out.println(curr.next.data);
            return newHead;
        }

//        condition 2: if between tail and head
//        traverse till last node and search for key till second last node
//        loop breaks in 2 cases either key found or reached tail node
//        now check why loop break in next if statement
//        if found key then delete else not found
        while ((int)curr.next.data!=key && curr.next.next!=null){
            System.out.println(curr.data);
            curr=curr.next;
        }
        if((int)curr.next.data==key)
            curr.next=curr.next.next;
        else
            System.out.println("not found");
        return head;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        Node head=null;
        for (int i = arr.length-1; i >=0 ; i--) {
            head=new Node(arr[i],head);
        }
        printList(head);
        Node newHead=deleteByKey(head,5);
        printList(newHead);
    }
}
