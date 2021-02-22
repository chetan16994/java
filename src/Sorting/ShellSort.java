package Sorting;

public class ShellSort {

//    variation of insertion sort. will compare on left side gap as well after particular sort from right is succesful
//    gap strategy could be anything. But not too few or too much gaps
//    better than insertion sort because if smallest element is on extreme right side then too many swaps/comparison
    public int[] sort (int[] arr){
        int length= arr.length;
        int gap=length/2;
        int i,j;
        for(gap=(length/2);gap>=1; gap=gap/2) {
            for(j=gap;j<length;j++){
                for (i=j-gap;i>=0;i=i-gap){
                    if(arr[i+gap]>arr[i])
                        break;
                    else{
                        int temp=arr[i];
                        arr[i]=arr[i+gap];
                        arr[i+gap]=temp;
                    }
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int [] arr={88,1,64,25,12,22,11,66};
        ShellSort obj=new ShellSort();
        int[] arr1=obj.sort(arr);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}
