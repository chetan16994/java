public class InsertionSort {

    public int[] sort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j >0; j--) {
                if(arr[j]>arr[j-1])
                    break;
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int [] arr={64,25,12,22,11};
        InsertionSort obj=new InsertionSort();
        int[] arr1=obj.sort(arr);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}
