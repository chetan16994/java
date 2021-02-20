package old;

public class ArrayReverse {

    void reverse(Integer arr[],int start,int last){

        for (int j=0, i = start-1; j <=(last-start)/2; j++,i++) {
            int temp=arr[i];
            arr[i]=arr[last-1-j];
            arr[last-1-j]=temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Integer[] arr={1,2,3,4,5,6,7,8};
        ArrayReverse ob1=new ArrayReverse();
        ob1.reverse(arr,5,8);
    }
}
