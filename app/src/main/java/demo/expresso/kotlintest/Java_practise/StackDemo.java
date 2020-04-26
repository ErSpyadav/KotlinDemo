package demo.expresso.kotlintest.Java_practise;

import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {
        Stack stack = new Stack();
        for (int i = 0; i < 10; i++) {
                    stack.push(i);
        }

        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.search(12));//Negative value
        System.out.println(stack.search(7));//Positive value
    }
}
