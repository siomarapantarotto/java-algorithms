package Bitwise;

/**
 * By siomara.com.br on May, 2022.
 */
public class BitwiseOperators {

    public static void main(String[] args) {
        // Initialize values
        // int a = 3, b = 3;
        int a = 5, b = 2;

        System.out.println("\nGiven a = " + a + " and b = " + b + " then...");
        System.out.println("binary  a = " + Integer.toBinaryString(a));
        System.out.println("binary  b = " + Integer.toBinaryString(b));

        // bitwise AND
        System.out.println("a & b \t==> " + Integer.toBinaryString(a & b)
                + "\t= " + (a & b));

        // bitwise AND combined for shorthand assignment
        System.out.println("a &= b \t==> " + Integer.toBinaryString(a &= b)
                + "\t= " + (a &= b));

        // bitwise OR
        System.out.println("a | b \t==> " + Integer.toBinaryString(a | b)
                + "\t= " + (a | b));

        // bitwise OR combined for shorthand assignment
        System.out.println("a |= b \t==> " + Integer.toBinaryString(a |= b)
                + "\t= " + (a |= b));

        // bitwise XOR
        System.out.println("a ^ b \t==> " + Integer.toBinaryString(a ^ b)
                + "\t= " + (a ^ b));

        // bitwise NOT
        System.out.println("~a = " + ~a);
    }
}
