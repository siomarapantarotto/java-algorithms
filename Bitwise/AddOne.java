package Bitwise;

public class AddOne {
    static int addOne(int x) {
        return (-(~x));
    }

    // Driver program
    public static void main(String[] args) {
        // Format specifier %d - convertion applied: Decimal integer
        System.out.printf("%d", addOne(13));
    }
}

// This code is contributed by Smitha Dinesh Semwal

