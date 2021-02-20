package old;

import java.util.LinkedList;

public class MiddleLL {
    public static void main(String[] args) {
        LinkedList<Integer> l1=new LinkedList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);

        for (int s:
             l1) {
            System.out.println(s);
        }
        int count=0;
        for (int i = 0; i <=l1.size()/2; i++) {
            count=l1.get(i);
        }
        System.out.println(count);
    }
}
