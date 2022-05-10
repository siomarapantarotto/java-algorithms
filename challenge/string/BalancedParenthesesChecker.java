package challenge.string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * Time Complexity: O(n)
 * Auxiliary Space: O(n) for stack and O(1) for hashSet.
 */
public class BalancedParenthesesChecker {

    public static boolean checkForBalancedParenthesis(String input) {

        Stack<Character> stack = new Stack<>();
        Set<Character> set = new HashSet<Character>(
                Arrays.asList('(', ')', '[', ']', '{', '}'));

        for (char currentChar : input.toCharArray()) {

            // ignore everything that is not in the set
            if (!set.contains(currentChar))
                continue;

            // add to stack only ( [ and {
            if (currentChar == '(' || currentChar == '[' || currentChar == '{') {
                stack.push(currentChar);
                continue;
            }

            // from now on check closing } ] and )
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
