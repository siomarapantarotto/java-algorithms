package stack;

import java.util.Stack;

public class SimpleStack {
    public static void main(String[] args) {
        // Creating a Stack
        Stack<Integer> even = new Stack<>();
        // pushing values in stack
        even.push(0);
        even.push(2);
        even.push(4);
        even.push(6);
        even.push(8);
        even.push(10);
        even.push(12);
        even.push(14);
        even.push(16);

        // printing the stack
        System.out.println("Print Stack before pop:");
        System.out.println(even);
        // returning the number at the top of the stack and removing it
        System.out.println("pop => " + even.pop());
        System.out.println("pop => " + even.pop());
        System.out.println("pop => " + even.pop());
        // printing the stack
        System.out.println("Print Stack after pop:");
        System.out.println(even);
        // accessing the number at the top of the stack but not removing it
        System.out.println("Number on top of the stack is => " + even.peek());
        // checking if the stack is empty or not
        System.out.println("Is stack empty? Ans:" + even.empty());
        // checking the position of 8 in the stack
        System.out.println("Position of 8 from the top is " + even.search(8));
        // check if 20 exists in the stack
        System.out.println("Position of 20 from the top is " + even.search(20));
    }

}
