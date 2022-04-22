package Bitwise;

/**
 * By siomara.com.br on May, 2022.
 */
public class BitwiseOperator {

    public static void main(String[] args) {
        // Initialize values
        int a = 5;
        int b = 7;

        System.out.println("\nGiven a = " + a + " and b = " + b + " then...");
        System.out.println("binary  a = " + Integer.toBinaryString(a));
        System.out.println("binary  b = " + Integer.toBinaryString(b));

        // bitwise AND
        System.out.println("a & b \t==> " + Integer.toBinaryString(a & b)
                + "\t= " + (a & b));

        // bitwise OR
        System.out.println("a | b \t==> " + Integer.toBinaryString(a | b)
                + "\t= " + (a | b));

        // bitwise XOR
        System.out.println("a ^ b \t==> " + Integer.toBinaryString(a ^ b)
                + "\t= " + (a ^ b));

        // combined in assignment operator providing shorthand assignment
        // a &= b is same as a = a & b
        System.out.println("a &= b \t==> " + Integer.toBinaryString(a &= b)
                + "\t= " + (a &= b));

        // bitwise NOT
        // ~0101 = 1010
        // will give 2's complement of 1010 = -6
        //System.out.println("~a = " + Integer.toBinaryString(~a));
        System.out.println("~a = " + ~a);
    }
}
