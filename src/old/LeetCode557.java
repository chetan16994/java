package old;

public class LeetCode557 {
    static String s2="";
    public static String reverseWords(String s){

        int i=0;
        String s3="";
        while (i<s.length()){
            if (s.charAt(i)==32 ){
                reverseWords1(s3);
                s3="";
            }
            else if(i==s.length()-1){
                s3+=s.charAt(i);
                reverseWords1(s3);
            }
                else{
                s3 += s.charAt(i);
            }
            i++;
        }
        StringBuilder s4=new StringBuilder(s2);
        s4.deleteCharAt(s4.length()-1);
        return s4.toString();
    }

    public static void reverseWords1(String s) {
       StringBuilder sb=new StringBuilder(s);
       int i=0;
       int j=s.length()-1;
       while(i<s.length()){
           sb.setCharAt(i,s.charAt(j));
           i++;
           j--;
       }
       s2+= sb.toString();
       s2+=" ";
    }
    public static void main(String[] args) {
        String str1="Let's take LeetCode contest";
        System.out.println(reverseWords(str1));
    }
}
