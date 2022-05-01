package mathematics;

public class FibonacciCache {

    // memorization
    private static long[] fibonacciCache;

    public static void main(String[] args) {
        // for n > 92 negative numbers will come as results
        // the limit to work with long in fibonacci is 92
        int n = 92;

        fibonacciCache = new long[n + 1];

        long start = System.currentTimeMillis();
        for (int i = 0; i <= n; i++) {
            System.out.println("fibonacci(" + i + ") = " + fibonacci(i) + " ");

        }
        long finish = System.currentTimeMillis();
        System.out.println("\nFibonacci took: " + (finish - start) + " msecs");

    }

    // find the n fibonacci number
    private static long fibonacci(int n) {
        // base case - the condition to stop the recursive call
        // the first 3 numbers are always going to be 0 and 1
        if (n <= 1) {
            return n;
        }

        // primitives cannot be null so check for 0
        if (fibonacciCache[n] != 0) {
            return fibonacciCache[n];
        }

        long nthFibonacciNumber = (fibonacci(n - 1) + fibonacci(n - 2));
        fibonacciCache[n] = nthFibonacciNumber;

        return nthFibonacciNumber;
    }

}
