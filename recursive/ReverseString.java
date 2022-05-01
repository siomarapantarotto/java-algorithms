package recursive;

public class ReverseString {

    public static String reverseString(String input) {

        // base case
        if (input.equals("")) {
            return "";
        }

        // reverse input string recursively
        return reverseString(input.substring(1)) + input.charAt(0);
    }

    public static void main(String[] args) {

        // System.out.println(reverseString("siomara"));
        String strToBeReversed = "Hello Charlie Brown!";
        System.out.println("\nThe reverse of '" + strToBeReversed + "' is: "
                + reverseString(strToBeReversed));

    }

}
