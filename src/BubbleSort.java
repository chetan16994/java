public class BubbleSort {

//    heaviest go down and then one less iteration
    public int[] sort(int[] arr){
        int i,j,temp;
        boolean swapped=false;
        for (i = 0; i < arr.length-1; i++) {
            for (j = 0; j < arr.length-(i+1); j++) {
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if(swapped==false) break;
        }
        return arr;
    }
    public static void main(String[] args) {
        int [] arr={64, 34, 25, 12, 22, 11, 90};
        BubbleSort obj=new BubbleSort();
        int[] arr1=obj.sort(arr);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}
