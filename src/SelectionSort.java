public class SelectionSort {

//  select min and keep and put it at first then iterate one less from start

    public int[] sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int min_ind=i;
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[j]<arr[min_ind])
                    min_ind=j;
            }
            int temp=arr[i];
            arr[i]=arr[min_ind];
            arr[min_ind]=temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int [] arr={64,25,12,22,11};
        SelectionSort obj=new SelectionSort();
        int[] arr1=obj.sort(arr);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}
