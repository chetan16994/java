package LinkedList;

import java.util.HashSet;

public class CheckPalindrome {
    public static void printList(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+ "->");
            curr=curr.next;
        }
        System.out.println("null");
    }

    public static Boolean checkForPalindrome(Node head){
        Node curr=head;
        StringBuilder str=new StringBuilder();
        while (curr!=null){
            str.append(curr.data);
            curr=curr.next;
        }
        int i=0;
        int len=str.length();
        while (i<=(len/2)){
            if (str.charAt(i)!=str.charAt(len-(i+1))){
                return false;
            }
            i++;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] arr={"a","b","b","a"};
        Node head=null;

        for (int i = arr.length-1; i >=0 ; i--) {
            head=new Node(arr[i],head);
        }
        printList(head);
        System.out.println(checkForPalindrome(head));
    }
}
