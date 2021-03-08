package LinkedList;

public class InsertAtTail_afterTraversal {

    public static void printList(Node head){
        Node curr = head;
        while (curr != null){
            System.out.print(curr.data + " —> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
//    make a new node
    public static Node push(int data, Node head){
        Node newNode=new Node(data,head);
        return newNode;
    }
//    finds the tail and sends it to push for making a new node at the end
//     return the real head every time cuz we want to iterate from start every time
    public static Node appendNode(int data,Node head){
        Node curr=head;
        if(head==null){
            head=push(data,null);
        }else {
            while (curr.next != null)
                curr = curr.next;
            curr.next = push(data, null);
        }
        System.out.println(head.data);
        return head;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        Node head=null;
        for (int i:arr)
            head=appendNode(i,head);
        printList(head);
    }
}
