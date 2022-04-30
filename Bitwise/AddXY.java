package bitwise;

public class AddXY {
    // Main drive
    public static void main (String[] args) {
        System.out.println("\nAddXY is: ");
        System.out.println(addXY(12, 20));
        System.out.println("\nAddYX is: ");
        System.out.println(addYX(12, 20));
    }

    // Add x + y
    public static int addXY(int x, int y) {        
        return (y == 0 ? x : addXY(x ^ y, (x & y) << 1));
    }

    public static int addYX(int x, int y)
    {
        // Iterate till there is no carry
        while (y != 0)
        {
            // carry now contains common
            // set bits of x and y
            int carry = x & y;
 
            // Sum of bits of x and
            // y where at least one
            // of the bits is not set
            x = x ^ y;
 
            // Carry is shifted by
            // one so that adding it
            // to x gives the required sum
            y = carry << 1;
        }
        return x;
    }
}
