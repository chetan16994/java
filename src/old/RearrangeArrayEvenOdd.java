package old;

import java.util.Arrays;

public class RearrangeArrayEvenOdd {

    static int[] rearrange(int arr[]){

        int arr1[]=new int[arr.length];
        System.arraycopy(arr,0,arr1,0,arr.length);

        Arrays.sort(arr1);
        int k;

        if (arr.length%2==0)
            k=(arr.length/2);
        else
            k=(arr.length/2)+1;


        for (int i=0,j=k-1;j>=0;j--,i=i+2){
                arr[i]=arr1[j];
        }

        for (int i = 1, j=k; j<arr.length;j++,i=i+2) {
                arr[i]=arr1[j];
        }


        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6,7};
        int arr1[]=rearrange(arr);
        for (int i:arr1 ) {
            System.out.println(i);
        }
    }
}
