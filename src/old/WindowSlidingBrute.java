package old;

public class WindowSlidingBrute {
    
    public static int findingsSubArray(int[] array, int k){
        
        int maxSum=0;
        for (int i = 0; i < array.length; i++) {
            int sum=0;
            for (int j = i; j < i+k && j<array.length; j++) {
                sum=sum+array[j];
            }
            maxSum=Math.max(maxSum,sum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr={1, 4, 2, 10, 23, 3, 1, 0, 20};
        int k=4;

        System.out.println(findingsSubArray(arr, k));
    }
}