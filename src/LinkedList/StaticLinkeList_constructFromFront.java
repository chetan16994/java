package LinkedList;

public class StaticLinkeList_constructFromFront {

    public static void printList(Node head){
        Node curr = head;
        while (curr != null){
            System.out.print(curr.data + " —> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
    public static Node push(int data, Node head){
        Node newNode=new Node(data,head);
        return newNode;
    }
    public static Node constructList(int[] arr){
        Node head=null;
        for (int i = arr.length-1; i >=0 ; i--) {
            head=push(arr[i],head);
        }
        return head;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 ,5};
        Node head=constructList(arr);
        printList(head);
    }
}
