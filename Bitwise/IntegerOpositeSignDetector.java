package Bitwise;

/**
 * By siomara.com.br on May, 23 of 2022.
 * 
 * This class detects if two integers have opposite signs.
 * It performs a logical operation with XOR (^), a bitwise
 * operator that stands for "EXCLUSIVE OR".
 * 
 * If input bits are the SAME ==> output will be FALSE (0)
 * If input bits are DIFFERENT ==> output will be TRUE (1)
 */
public class IntegerOpositeSignDetector {

	public static void main(String[] args) {

		int x = -50, y = -50;
		System.out.println("\nGiven x = " + x + " and y = " + y + " then...");

		boolean isOpposite = oppositeSigns(x, y);

		// Ternary operator is a programming statement.
		// “If - Then - Else” is a programming block.
		// The statement is, of course, faster than block.
		System.out.println(isOpposite
				? "Integers signs are opposite."
				: "Integers signs are not opposite."
		);
	}

	// Returns true (opposite) or false (not opposite) 
	static boolean oppositeSigns(int x, int y) {
		return ((x ^ y) < 0);
	}
}
