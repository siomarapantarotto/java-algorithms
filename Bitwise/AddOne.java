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

/**
// This code is contributed by Smitha Dinesh Semwal

Time Complexity: O(1)
Auxiliary Space: O(1)
We know that the negative number is represented in 2’s complement
form on most of the architectures. We have the following lemma
hold for 2’s complement representation of signed numbers.
Say, x is numerical value of a number, then
~x = -(x+1) [ ~ is for bitwise complement ]
(x + 1) is due to the addition of 1 in 2’s complement conversion
To get (x + 1) apply negation once again.
So, the final expression becomes (-(~x)). 
*/
