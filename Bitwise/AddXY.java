package bitwise;

public class AddXY {
    // Main drive
    public static void main(String[] args) {
        System.out.println("\nAddXY is: ");
        System.out.println(addXY(0, 20));
        System.out.println("\nAddYX is: ");
        System.out.println(addYX(12, 20));
    }

    // Add x + y method 1
    public static int addXY(int x, int y) {
        return (y == 0 ? x : addXY(x ^ y, (x & y) << 1));
    }

    // Add x + y method 2
    public static int addYX(int x, int y) {
        // Iterate till there is no carry
        while (y != 0) {
            int carry = x & y;
            x = x ^ y;
            y = carry << 1;
        }
        return x;
    }
}
