package Bitwise;

/**
 * By siomara.com.br on May, 2022.
 */
public class BitwiseAndOrXor {

    public static void main(String[] args) {

        int a = 5, b = 2;

        System.out.println("\nGiven a = " + a
                + ", binary = " + Integer.toBinaryString(a));

        System.out.println("Given b = " + b
                + ", binary = " + Integer.toBinaryString(b));

        System.out.println("then....");

        System.out.println("a & b (AND) = " + (a & b)
                + ", binary = " + Integer.toBinaryString(a & b));

        System.out.println("a | b (OR)  = " + (a | b)
                + ", binary = " + Integer.toBinaryString(a | b));

        System.out.println("a ^ b (XOR) = " + (a ^ b)
                + ", binary = " + Integer.toBinaryString(a ^ b));
    }
}
