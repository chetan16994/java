package old;

import java.math.BigInteger;
import java.util.Scanner;

class ArrayRotationJugglingAlgo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }

        BigInteger b1= new BigInteger(String.valueOf(n));
        BigInteger b2=new BigInteger(String.valueOf(d));

        BigInteger gcd=b1.gcd(b2);
        Integer gcd1= new Integer(String.valueOf(gcd));

        System.out.println("jj : "+gcd1);

        for (int i = 0; i < gcd1; i++) {
            int k,temp=arr[i];
            int j=i;
            while(true){
                k=j+d;
                if (k>=n){
                    k=k-n;
                }
                if (k==i)
                    break;
                arr[j]=arr[k];
                j=k;
            }
            arr[j]=temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
