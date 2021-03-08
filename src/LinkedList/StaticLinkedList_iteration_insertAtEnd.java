package LinkedList;

public class StaticLinkedList_iteration_insertAtEnd {
    
    static Node head=null;

    public static void printList(Node head){
        Node curr = head;
        while (curr != null)
        {
            System.out.print(curr.data + " —> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
    public static Node constructList(int[] arr){
        Node[] node = new Node[arr.length];
        for (int i = 0; i < arr.length; i++){
            node[i] = new Node(arr[i], null);
            if (i > 0)
                node[i - 1].next = node[i];
        }
        return node[0];
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        head=constructList(arr);
        printList(head);
    }
}
