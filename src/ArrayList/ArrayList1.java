package ArrayList;

import java.util.*;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(11);
        al.add(7);
        al.add(11);
        al.add(12);
        al.set(1,5);
        al.add(0,6);

//        how to iterate

        Iterator itr=al.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
        for (Integer i: al  ) {
            System.out.println(i);
        }

//        add remove

        ArrayList<Integer> al2=new ArrayList<>();
        al2.add(8);
        al2.add(9);
        al2.add(10);
        al.addAll(2,al2);
        System.out.println("after add all"+al);
        al.add(13);

//        clone

        ArrayList<Integer> alClone= (ArrayList<Integer>) al.clone();
        System.out.println(alClone);
        System.out.println(al.contains(11));
        System.out.println(al.indexOf(11));
        System.out.println(al.lastIndexOf(11));

//         List Iterator

        ListIterator<Integer> litr=al.listIterator();
        System.out.println("list iterator");
        System.out.println(litr.next());
        litr.add(66);
        System.out.println(al);
        System.out.println(litr.previous());
        System.out.println(litr.next());
        litr.remove();
        System.out.println(al);
        System.out.println(litr.next());


//        remove if
        al.removeIf(num -> num%2!=0);
        System.out.println(al);

//        split iterartor
        Spliterator slitr=al.spliterator();
        slitr.tryAdvance( i -> System.out.println(i));
        slitr.tryAdvance(i-> System.out.println(i));

        slitr.forEachRemaining(i -> System.out.println(i));

//        sublist
        ArrayList<Integer> alSub= new ArrayList<>(al.subList(0,3));
        System.out.println(alSub);

//        reverse
        Collections.reverse(alSub);
        System.out.println(alSub);

//        to array

        Object[] objArr=al.toArray();
        for (Object obj:objArr  ) {
            System.out.println(obj);
        }

        Integer[] objArr1=new Integer[al.size()];
        objArr1=al.toArray(objArr1);
        for (Integer i:objArr1 ) {
            System.out.println(i);
        }

//        array to list\
        String[] arr={"1","2","3"};
        List<String> arrList=  Arrays.asList(arr);
        System.out.println(arrList);

//        swap
        Collections.swap(arrList,1,2);
        System.out.println(arrList);
        }
}
