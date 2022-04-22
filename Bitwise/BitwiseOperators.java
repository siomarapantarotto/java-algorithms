package Bitwise;

/**
 * By siomara.com.br on May, 2022.
 * This class shows how bitwise operators work.
 * ATTENTION: Short assignments '&=' or '|=' change original variables values.
 */
public class BitwiseOperators {

    public static void main(String[] args) {
        // Initialize values.
        // int a = 3, b = 3;
        int a = 5, b = 2;

        System.out.println("\nGiven a = " + a + " and b = " + b + " then...");
        System.out.println("binary  a = " + Integer.toBinaryString(a));
        System.out.println("binary  b = " + Integer.toBinaryString(b));

        // Bitwise 'AND'.
        System.out.println("a & b \t==> " + Integer.toBinaryString(a & b)
                + "\t= " + (a & b));

        // Bitwise 'OR'.
        System.out.println("a | b \t==> " + Integer.toBinaryString(a | b)
                + "\t= " + (a | b));

        // Bitwise 'XOR'.
        System.out.println("a ^ b \t==> " + Integer.toBinaryString(a ^ b)
                + "\t= " + (a ^ b));

        // Bitwise 'NOT'.
        System.out.println("~a = " + ~a);

        // Bitwise 'AND' combined with '=' for shorthand assignment.
        // ATTENTION: "a" will be set to a diferent value with this assignment.
        System.out.println("\nGiven a = " + a + " and b = " + b + " then...");
        System.out.println("a &= b \t==> " + Integer.toBinaryString(a &= b)
                + "\t= " + (a &= b));

        // Bitwise 'OR' combined with '=' for shorthand assignment.
        // ATTENTION: "a" will be set to a diferent value with this assignment.
        // Setting "a" value back to original '5' since it changed previously.
        a = 5; 
        System.out.println("\nGiven a = " + a + " and b = " + b + " then...");
        System.out.println("a |= b \t==> " + Integer.toBinaryString(a |= b)
        + "\t= " + (a |= b));
    }
}
