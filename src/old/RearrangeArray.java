package old;

import java.util.Arrays;

public class RearrangeArray {

    static int[] rearrange(int[] arr){
        int[] arr1=new int[arr.length];
        Arrays.fill(arr1,-1);
        for (int i=0;i<arr.length;i++){
              if (arr[i]!=-1){
                arr1[arr[i]]=arr[i];
              }
        }
        return arr1;
    }

    public static void main(String[] args) {

        int arr[]={-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
        int arr1[]=rearrange(arr);
        for (int i1 : arr1)
            System.out.println(i1 + " ");
    }
}
