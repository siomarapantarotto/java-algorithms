package Bitwise;

// This code needs to be fixed
// started with flag
// ended up being another thing
// it happens :-)
public class BitwiseFeatureFlag {

    public static void main(String[] args) {

        // integer 4 bytes (32 bits)
        int mask = 0b00001000;
        
        for (int i = 1; i <= 10; i++) {
            System.out.println("\n\nbinary mask: " + Integer.toBinaryString(mask));
            System.out.println("i: " + i + " (binary: " + Integer.toBinaryString(i) + ")");
            System.out.print("mask & i << 2: " + Integer.toBinaryString((mask & i) << 2));
            System.out.print(((mask & i) << 2 == i) ? " enabled" : " disabled");
        }
    }
}
