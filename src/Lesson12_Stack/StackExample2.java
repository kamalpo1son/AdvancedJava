package src.Lesson12_Stack;

import java.util.Stack;

public class StackExample2 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Kamal");
        stack.push("Oleg");
        stack.push("Alex");
        stack.push("Kei");
        System.out.println(stack);
//        while (!stack.isEmpty()) {
//            System.out.println(stack.pop());
//            System.out.println(stack);
//        }
        System.out.println(stack.peek());
        System.out.println(stack);
    }
}
