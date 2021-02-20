package old;

import java.util.Scanner;

class ArrayRotationONEbyONE {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }

        for (int i = 0; i < d; i++) {
            int k=arr[0];
            for (int j = 0; j <n-1 ; j++) {
                arr[j]=arr[j+1];
            }
            arr[n-1]=k;
        }
        for (int i = 0; i <n ; i++) {
            System.out.println(arr[i]);
        }
    }
}