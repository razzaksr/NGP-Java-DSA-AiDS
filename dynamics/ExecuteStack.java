package dynamics;

import java.util.Stack;

/*
Stack:
push, pop, peek, isEmpty, clear, search
*/

public class ExecuteStack {
    public static void main(String[] args) {
        // generic
        // Stack<Integer> intStack = new Stack<>();
        // generic
        Stack<String> myStack = new Stack<>();
        myStack.push("Java Full Stack Developer");
        // myStack.push(90);
        myStack.push("Spring Boot");
        myStack.push("React JS");
        System.out.println(myStack);
        // non generic
        // Stack myStack = new Stack();
        // myStack.push("Java Full Stack Developer");
        // myStack.push(90);
        // myStack.push(true);
        // myStack.push(9.2);
        // myStack.push('R');
        // System.out.println(myStack);
        // System.out.println("Popped value: " + myStack.pop());
        // System.out.println("Stack after pop: " + myStack.peek());
        // System.out.println(myStack.search(90));
        // System.out.println("Is stack empty? " + myStack.isEmpty());
        // System.out.println("Clearing stack...");
        // myStack.clear();
        // System.out.println("Is stack empty? " + myStack.isEmpty());
    }
}
