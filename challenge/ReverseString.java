package challenge;

// by siomara.com.br on May, 3 of 2022.
public class ReverseString {

    public static String reverseString(String input) {
        if (input == "") {
            return ""; // base case
        }
        return reverseString(input.substring(1)) + input.charAt(0);
    }

    public static void main(String[] args) {
        String input = "siomara.com.br";
        System.out.println(reverseString(input));
    }

}
