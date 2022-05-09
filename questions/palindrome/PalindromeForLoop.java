package questions.palindrome;

public class PalindromeForLoop {

    public static boolean isPalindrome(String input) {

        String reversed = "";
        int inputLengthMinusOne = input.length() - 1;

        for (int i = inputLengthMinusOne; i >= 0; i--) // inputLength - 1 is a must
            reversed += input.charAt(i);

        if (reversed.equals(input)) // string uses .equals for comparison
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        String input = "racecar";
        System.out.println(isPalindrome(input));
    }
}
