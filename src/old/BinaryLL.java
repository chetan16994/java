package old;

public class BinaryLL {

    static Node1 head;

    class Node1 {
        int data;
        Node1 next;
        Node1(int d){
         data=d;
         next=null;
        }
    }

    void push(int new_data){
        Node1 new_node1 =new Node1(new_data);
        new_node1.next=head;
        head= new_node1;
    }

    static Node1  middle(Node1 start, Node1 last){
        if (start==null)
            return null;

        Node1 fast=start;
        Node1 slow=start;
        if (fast!=last){
            while (fast!=last && fast.next!=last){
                fast=fast.next.next;
                slow=slow.next;
            }
            System.out.println("middle is "+slow.data);
        }
        return slow;
    }

    static Node1 binary(Node1 head, int value){
        Node1 start=head;
        Node1 last=null;

        do {
            Node1 mid=middle(start,last);
            if (mid==null)
                return null;

            if (mid.data==value)
                return mid;

            else if(mid.data>value){
                start=mid.next;
            }
            else {
                last=mid;
            }
        }while (last==null || last!=start);
        return null;
    }

    void printList(){
        Node1 tnode=head;
        while(tnode!=null){
            System.out.print(tnode.data+"->");
            tnode=tnode.next;
        }
        System.out.println("NULL");
    }



    public static void main(String[] args) {
        BinaryLL l1=new BinaryLL();
        for (int i = 1; i <11; i++) {
            l1.push(i);
//            l1.printList();
//            l1.middle();
        }
        l1.printList();
        if (binary(head, 7) == null)
        {
            System.out.println("Value not present");
        }
        else
        {
            System.out.println("Present");
        }
    }
}
