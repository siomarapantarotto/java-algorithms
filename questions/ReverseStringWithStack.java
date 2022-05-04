package questions;

import java.util.Stack;

// by siomara.com.br on May,4th of 2022.
public class ReverseStringWithStack {

    public static String reverseString(String input) {

        if (input == "") {
            return "";
        }

        Stack<String> stack = new Stack<>();
        String temp = "";

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ' ') {
                temp = temp + input.charAt(i);
            } else {
                stack.push(temp);
                temp = "";
            }
        }

        stack.push(temp);
        temp = "";

        while (stack.size() > 0) {
            temp = temp + (stack.pop() + " ");
        }

        return temp.trim();
    }

    public static void main(String[] args) {
        String input = "My name is Siomara Cintia Pantarotto";
        System.out.println(reverseString(input));
    }

}
