package Stack;

import java.util.Stack;

public class Stack1 {
    public static void stackPush(Stack<Integer> stack){
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
    }
    
    public static void stackPop(Stack<Integer> stack){
        for (int i = 0; i < 5; i++) {
            Integer y=(Integer) stack.pop();
            System.out.println(y);
        }
    }

    public static void stackPeek(Stack<Integer> stack){
        Integer element=(Integer) stack.peek();
        System.out.println("element on stack top : "+element);
    }

    public static void stackSearch(Stack<Integer> stack, int element){
        Integer pos=(Integer) stack.search(element);

        if(pos==-1)
            System.out.println("not found");
        else
            System.out.println("position : "+pos);
    }
    
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();

        stackPush(st);
        stackPop(st);
        stackPush(st);
        stackPeek(st);
        stackSearch(st,0);
        stackSearch(st,7);
    }
}
