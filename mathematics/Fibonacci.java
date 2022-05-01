package mathematics;

public class Fibonacci {

    public static long fib(long n) {
        if ((n == 0) || (n == 1)) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }

    }

    public static void main(String[] args) {
        int n = 20;
        /// System.out.println(fib(n));
        for (int i = 0; i <= n; i++) {
            // System.out.println("fibonacci(" + i + ") = " + fib(i) + " ");
            System.out.print(fib(i) + " ");
        }
    }

}
