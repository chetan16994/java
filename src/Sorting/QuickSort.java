package Sorting;

// best average time
// divide and conquer
// jenny video

public class QuickSort {
    public static void quickSort(int [] arr,int lb,int ub){
        if(lb<ub){
            int loc=partition(arr,lb,ub);
            quickSort(arr,lb,loc-1);
            quickSort(arr,loc+1,ub);
        }
    }
    public static int partition(int[] arr, int lb, int ub){
        int pivot=arr[lb];
        int start=lb;
        int end=ub;

        while(start<end){
//            we have added start<end here because once start reaches end it will increment and go out of bound
//            but in below end condition its not the case because first element is always pivot
            while(arr[start]<=pivot && start<end)
                start++;
            while(arr[end]>pivot)
                end--;
            if(start<end)
                swap(arr,start,end);
        }
        swap(arr,lb,end);
        return end;
    }
    public static void swap(int[] arr,int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        int [] arr={38,1,88,64,25,12,22,11,99};
//        int [] arr={1,2,33,44};
        QuickSort obj=new QuickSort();
        obj.quickSort(arr,0,arr.length-1);
        printArray(arr);
    }
}
