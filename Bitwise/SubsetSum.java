package Bitwise;

import java.util.Arrays;

public class SubsetSum {

    static int countStrings(int n) {
        // Create two arrays with n size.
        int a[] = new int[n];
        int b[] = new int[n];
        // System.out.println("a = " + Arrays.toString(a)); // a = [0, 0, 0]
        // System.out.println("b = " + Arrays.toString(b)); // b = [0, 0, 0]

        // Set index 0 for both arrays equal to 1.
        a[0] = b[0] = 1;
        System.out.println("a = " + Arrays.toString(a)); // a = [1, 0, 0]
        System.out.println("b = " + Arrays.toString(b)); // b = [1, 0, 0]

        // Loop
        System.out.println("Loop / n = " + n + " / (int i = 1; i < n; i++)");
        for (int i = 1; i < n; i++) {
            a[i] = a[i - 1] + b[i - 1];
            b[i] = a[i - 1];

            System.out.println();
            System.out.println("a[i] = a[" + i + "] = " + a[i] + " and  "
                    + "b[i] = b[" + i + "] = " + b[i]);
            System.out.println();
            System.out.println("a[" + i + "] binary = " + Integer.toBinaryString(a[i]));
            System.out.println("b[" + i + "] binary = " + Integer.toBinaryString(b[i]));
            System.out.println("a = " + Arrays.toString(a));
            System.out.println("b = " + Arrays.toString(b));
            System.out.println("------------------------------------------");

        }
        System.out.println("a[n - 1] + b[n - 1]");
        System.out.println("n = " + n);
        return a[n - 1] + b[n - 1];
    }

    /* Driver program to test above function */
    public static void main(String args[]) {
        System.out.println(countStrings(3));
    }
}/* This code is contributed by Rajat Mishra */
