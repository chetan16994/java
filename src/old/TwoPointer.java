package old;

import java.util.Arrays;

public class TwoPointer {

    // https://www.geeksforgeeks.org/given-an-array-a-and-a-number-x-check-for-pair-in-a-with-sum-as-x/
    // check using hashing
    
    
    static boolean isPairSum(int[] arr,int n){
        Arrays.sort(arr);
        int i=0;
        int j=arr.length-1;
        while (i<j){
            if (arr[i]+arr[j]==n)
                return true;
            else if(arr[i]+arr[j]>n)
                    j--;
                else
                    i++;
        }
        return false;
    }
    public static void main(String[] args) {
        int A[] = { 10,20,35,50,75,80};
        int n = 71;
        System.out.println(isPairSum(A,n));
    }
}
