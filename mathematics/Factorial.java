package mathematics;

public class Factorial {

    static int factorial(int n) {
        if (n != 0) // termination condition
            return n * factorial(n - 1); // recursive call
        else
            return 1;
    }

    //////////////////////////////////////////////////////
    // Optmization in some languages but not JAVA :-(
    // static int factorial(int n) {
    // return tailFactorial(n, 1); // recursive call
    // }
    //
    // static int tailFactorial(int n, int multiplier) {
    // if (n > 0) { // termination condition
    // return tailFactorial(n - 1, n * multiplier); // recursive call
    // }
    // return multiplier;
    // }
    //////////////////////////////////////////////////////

    public static void main(String[] args) {
        int number = 10, result;
        result = factorial(number);
        System.out.println(number + " factorial = " + result);
    }
}
