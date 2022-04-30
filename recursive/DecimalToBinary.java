package recursive;

public class DecimalToBinary {

    public static String findBinary(int decimal, String remainder) {
        if (decimal == 0) {
            return remainder;
        }

        // % returns the remainder of the division
        remainder = decimal % 2 + remainder;
        return findBinary(decimal / 2, remainder);
    }

    public static void main (String[] args) {
        System.out.println(findBinary(10, ""));
    }

}
