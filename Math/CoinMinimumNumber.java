package math;

// Java program to find minimum number of denominations
import java.util.Vector;

public class CoinMinimumNumber {

    // Driver code
    public static void main(String[] args) {
        int totalCents = 179;
        System.out.print("Minimal coins for change of " + totalCents + ": ");
        findMin(totalCents);
    }

    // All denominations of Brazilian coins
    static int coins[] = { 1, 5, 10, 25, 50, 100 };
    static int coinsLength = coins.length;

    static void findMin(int totalCents) {
        // Initialize result
        Vector<Integer> vec = new Vector<>();

        // Traverse through all coin denominations
        for (int i = coinsLength - 1; i >= 0; i--) {
            // Find denominations
            while (totalCents >= coins[i]) {
                totalCents -= coins[i];
                vec.add(coins[i]);
            }
        }

        // Print result
        for (int i = 0; i < vec.size(); i++) {
            System.out.print(" " + vec.elementAt(i));
        }
    }
}
