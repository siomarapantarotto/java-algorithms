package bitwise;

public class MathSubtractOne {

    // Main driver.
    public static void main(String[] args) {
        System.out.printf("%d", subtractOneFrom(34));
    }

    // Method to subtract 1 from an integer.
    static int subtractOneFrom(int x) {
        return ((x << 1) + (~x));
    }
}
/**
 * Write a program to subtract one from a given number.
 * The use of operators +, -, *, /, ++, -– etc are not allowed.
 * 
 * We know that the negative number is represented in 2’s complement
 * form on most of the architectures. We have the following lemma
 * hold for 2’s complement representation of signed numbers.
 * Say, x is numerical value of a number, then
 * ~x = -(x+1) [ ~ is for bitwise complement ]
 * Adding 2x on both the sides, 2x + ~x = x – 1 
 * To obtain 2x, left shift x once. 
 */
