package randomPrac;

import java.util.List;
import java.util.Scanner;

class Node{
    int data;
    List<Node> children;
    public Node(int data){
        this.data=data;
        this.children=null;
    }
}
public class Prac1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        int[] arr=new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        int target=sc.nextInt();
        int sum=0;
        int answer=-1;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if (sum >= target) {
                answer=i+1;
                break;
            }
        }
        System.out.println("answer is : "+answer);
    }
}
