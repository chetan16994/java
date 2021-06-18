package randomPrac;

// Java program to reverse a Queue by recursion
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// Java program to reverse a queue recursively
public class Prac2 {

    static Queue<Integer> queue;

    // Utility function to print the queue
    static void Print()
    {
        while (!queue.isEmpty())
        {
            System.out.print(queue.peek() + " ");
            queue.remove();
        }
    }

    // Recurrsive function to reverse the queue
    static Queue<Integer> reverseQueue(Queue<Integer> q)
    {
        // Base case
        if (q.isEmpty())
            return q;

        // Dequeue current item (from front)
        int data = q.peek();
        q.remove();

        // Reverse remaining queue
        q = reverseQueue(q);

        // Enqueue current item (to rear)
        System.out.println("----"+data+11);
        q.add(data);

        return q;
    }

    // Driver code
    public static void main(String args[])
    {
        queue = new LinkedList<Integer>();
        queue.add(3);
        queue.add(2);
        queue.add(1);
        queue = reverseQueue(queue);
        Print();
    }
}

