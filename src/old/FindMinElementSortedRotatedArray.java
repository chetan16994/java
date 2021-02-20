package old;

public class FindMinElementSortedRotatedArray {

    static int findMin(int[] arr){
        int i=1;
        int n=arr.length;
        int min=arr[0];
        while (i<n){
            if (arr[i]<min) {
                min = arr[i];
                break;
            }
            i++;
        }
        return min;
    }
    public static void main(String[] args) {
        int arr[]={5,6,7,9,3};
        System.out.println(findMin(arr));
    }
}
