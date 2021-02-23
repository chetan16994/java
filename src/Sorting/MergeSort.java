package Sorting;

public class MergeSort {

//     using rescursion
//    keep breaking and then merge using merge function
//     refer to screenshot in project folder
    public void mergeSort(int[] arr,int lb,int ub){
        if(lb<ub){
            int mid=(lb+ub)/2;
            mergeSort(arr,lb,mid);
            mergeSort(arr,mid+1,ub);
            merge(arr,lb,mid,ub);
        }
    }
    public void merge(int[] arr, int lb, int mid, int ub){
        int i=lb;
        int j=mid+1;
        int k=lb;
        int[] arr1=new int[arr.length];
        while(i<=mid && j<=ub){
            if(arr[i]>arr[j]){
                arr1[k]=arr[j];
                j++;
                k++;
            }else{
                arr1[k]=arr[i];
                i++;
                k++;
            }
        }
        if(i>mid){
            while(j<=ub){
                arr1[k]=arr[j];
                j++;
                k++;
            }
        }else{
            while(i<=mid){
                arr1[k]=arr[i];
                i++;
                k++;
            }
        }
        for (k = lb; k <= ub; k++) {
             arr[k]=arr1[k];
        }
    }
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        int [] arr={88,1,64,25,12,22,11,66};
        MergeSort obj=new MergeSort();
        obj.mergeSort(arr,0, arr.length-1);
        printArray(arr);
    }
}