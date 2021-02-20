package old;

public class ArrayReversalAlgo {
    static Integer[] reverse(Integer arr[], int start, int last) {

        for (int j = 0, i = start - 1; j <= (last - start) / 2; j++, i++) {
            int temp = arr[i];
            arr[i] = arr[last - 1 - j];
            arr[last - 1 - j] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7};
        int d = 3;
        int n = arr.length;

        arr = reverse(arr, 1, d);
        arr = reverse(arr, d + 1, n);
        arr = reverse(arr, 1, n);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
