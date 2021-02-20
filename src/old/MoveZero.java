package old;

public class MoveZero {

    static void move(int arr[]){
//        int arr1[]=new int[arr.length];
        int j=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]!=0) {
                arr[j]=arr[i];
                j++;
            }
        }
        while(j<arr.length)
            arr[j++]=0;

        for (int i:arr) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        move(arr);
    }
}
