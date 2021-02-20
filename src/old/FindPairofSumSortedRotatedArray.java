package old;

public class FindPairofSumSortedRotatedArray {
    static boolean pairInSortedRotated(int[] arr,int sum){
        int i;
        int n=arr.length;
        for (i=0;i<arr.length;i++){
            if (arr[i] > arr[i+1])
                break;
        }

        int l=(i+1)%n;
        int r=i;
        while (l!=r){
            if (arr[l]+arr[r]==sum)
                return true;
            else if(arr[l]+arr[r]>sum)
                r=( r==0)? n-1:r-1;  //  r = (n + r - 1) % n;
            else
                l= (l==n)? 0:l+1;  // l = (l + 1) % n;
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {11, 15, 6, 8, 9, 10};
        int sum = 21;
        System.out.println(pairInSortedRotated(arr,sum));
    }
}
