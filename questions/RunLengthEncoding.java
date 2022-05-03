package questions;

public class RunLengthEncoding {

    public static String encode(String input) {

        // check for null or empty input
        if (input == null || input.length() == 0) {
            return "";
        }

        // initialize variables
        StringBuilder result = new StringBuilder();
        char[] inputChars = input.toCharArray();
        char prevChar = 0;
        int counter = 0;

        // iterate over input
        for (char currChar : inputChars) {
            if (currChar == prevChar) {
                counter = counter + 1;
            } else {
                if (prevChar != 0) {
                    result.append(counter).append(prevChar);
                }
                prevChar = currChar;
                counter = 1;
            }
        }

        // append last char and counter to result
        result.append(counter).append(prevChar);

        // return encoded input
        return result.toString();

    }

    public static void main(String[] args) {
        System.out.println(encode("aaaabbccc"));
        System.out.println(encode("aaaabbccca"));
        System.out.println(encode("abcd"));
    }
    // input: aaaabbccc output: 4a2b3c
    // input: aaaabbccca output: 4a2b3c1a
    // input: abcd output: 1a1b1c1d
}
