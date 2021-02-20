package old;

import java.util.Arrays;
import java.util.Scanner;

public class Buy{

    public static void solve(int T){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int B=sc.nextInt();
        int arr[]=new int[N];
        for (int i=0;i<N;i++){
               arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int count=0;
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
            if(sum>B)
                break;
            else
                count++;
        }
        T=T+1;
        System.out.println("Case #"+T+": "+count);
//        return count;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
//        System.out.println("t:"+T);
        for(int i=0;i<T;i++){
            solve(i);
//            System.out.println("inside");
//            System.out.println("Case #"+i+":"+solve());
        }

    }
}