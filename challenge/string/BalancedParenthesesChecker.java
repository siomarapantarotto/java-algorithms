package challenge.string;

import java.util.Stack;

public class BalancedParenthesesChecker {

    public static int checkForBalancedParenthesis(String input) {

        Stack<Character> stack = new Stack<>();

        for (char currentChar : input.toCharArray()) {

            if (currentChar == '(' || currentChar == '[' || currentChar == '{')
                stack.push(currentChar);

            if (currentChar == ')' && stack.peek() == '(')
                stack.pop();

            if (currentChar == ']' && stack.peek() == '[')
                stack.pop();

            if (currentChar == '}' && stack.peek() == '{')
                stack.pop();
        }

        if (stack.isEmpty())
            return 0;
        else
            return -1;
    }

    public static void main(String[] args) {
        String input = "{ [ (1 + 1) * 2 / 2] -3 }";
        int balancedParenthesis = checkForBalancedParenthesis(input);
        System.out.println((balancedParenthesis == -1)
                ? "Not balanced"
                : "balanced");
        ;
    }

}
