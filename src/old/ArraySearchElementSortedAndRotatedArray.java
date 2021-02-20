package old;

public class ArraySearchElementSortedAndRotatedArray {

    static int binarySearch(int[] arr, int l,int h, int key){
        int mid=l+h/2;
        int i=0;
        if (key==arr[mid])
            return mid;
        if(arr[l]<arr[mid]){
            if (key>=arr[l] || key<=arr[mid])
                return binarySearch(arr,l,mid,key);
            return binarySearch(arr,mid+1,h,key);
        }
        else{
            if (key>=arr[mid+1] || key<=arr[h])
                return binarySearch(arr,mid+1,h,key);
            return binarySearch(arr,l,mid,key);
        }
    }

    public static void main(String[] args) {
//        int[] arr={5,6,7,8,9,4,3,2,1};
        int[] arr={5, 6, 7, 8, 9, 10, 1, 2, 3};
        System.out.println(binarySearch(arr,0,arr.length-1,3));


    }

}
