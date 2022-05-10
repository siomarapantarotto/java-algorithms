package challenge.string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class BalancedParenthesesChecker {

    public static boolean checkForBalancedParenthesis(String input) {

        Stack<Character> stack = new Stack<>();
        Set<Character> set = new HashSet<Character>(
                Arrays.asList('(', ')', '[', ']', '{', '}'));

        for (char currentChar : input.toCharArray()) {

            if (!set.contains(currentChar))
                continue;

            if (currentChar == '(' || currentChar == '[' || currentChar == '{') {
                stack.push(currentChar);
                continue;
            }

            if (stack.isEmpty())
                return false;

            if (currentChar == ')' && stack.peek() == '(')
                stack.pop();
            else if (currentChar == ')' && stack.peek() != '(')
                return false;

            if (currentChar == ']' && stack.peek() == '[')
                stack.pop();
            else if (currentChar == ']' && stack.peek() != '[')
                return false;

            if (currentChar == '}' && stack.peek() == '{')
                stack.pop();
            else if (currentChar == '}' && stack.peek() != '{')
                return false;
                
        }

        // here is balanced for sure
        return (stack.isEmpty());

    }

    public static void main(String[] args) {
        String input = "{ [ ()(1 + 1) * 2 / 2 []] - 3 } {}";
        boolean balancedParenthesis = checkForBalancedParenthesis(input);
        System.out.println((balancedParenthesis == false)
                ? "Not balanced"
                : "balanced");
        ;
    }

}
