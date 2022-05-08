package questions;

import java.util.Stack;

public class PalindromeWithStack {

    public static boolean isPalindrome(String input) {

        Stack<Character> stack = new Stack<>();
        String reverseInput = "";

        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        while (!stack.empty()) {
            reverseInput += stack.pop();
        }

        if (reverseInput.equals(input))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        String input = "kayak";
        System.out.println(isPalindrome(input)
                ? input + " is a palindrome"
                : input + " is NOT a palindrome");
    }

}
