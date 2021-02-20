package old;

import java.util.Scanner;

class ArrayRotation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();

        while (testcase-- > 0) {

            int n = sc.nextInt();
            int d = sc.nextInt();

            int[] arr = new int[n];
            int[] temp = new int[d];
            for (int i = 0; i < n; i++) {
                if (i < d) {
                    temp[i] = sc.nextInt();
                } else {
                    arr[i - d] = sc.nextInt();
                }
            }
            for (int j = 0, i = n - d; i < n; j++, i++) {
                arr[i] = temp[j];
            }
            for (int i = 0; i < n; i++) {
                System.out.println(arr[i]);
            }
        }
    }
}