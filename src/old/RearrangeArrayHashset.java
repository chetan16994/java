package old;

import java.util.HashSet;
import java.util.Set;

public class RearrangeArrayHashset {

    static int[] rearrange(int[] arr){

        Set<Integer> s1=new HashSet<>();

        for (int i=0;i<arr.length;i++)
            s1.add(arr[i]);

        for(int i=0;i<arr.length;i++){
            if (s1.contains(i))
                arr[i]=i;
            else
                arr[i]=-1;
        }

        return arr;
    }

    public static void main(String[] args) {

        int arr[]={-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
        int arr1[]=rearrange(arr);
        for (int i1 : arr1)
            System.out.println(i1 + " ");
    }
}
