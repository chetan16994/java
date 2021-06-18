package Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ReverseRecursion {

   static Queue<Integer> queue;

   public static void print(){
       Iterator itr= queue.iterator();
       while (itr.hasNext())
           System.out.println(itr.next());
   }

   public static Queue<Integer> reverseQueue(Queue<Integer> q){
//        base case
       if (q.isEmpty())
           return q;

       int data=q.remove();

       q=reverseQueue(q);

       q.add(data);

       return q;
   }

    public static void main(String[] args) {
        queue= new LinkedList<Integer>();
        queue.add(5);
        queue.add(4);
        queue.add(3);
        queue.add(2);
        print();
        queue=reverseQueue(queue);
        print();
    }
}
