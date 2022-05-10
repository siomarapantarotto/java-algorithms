package hashtable;

import java.util.Arrays;
import java.util.Hashtable;

public class SumTwoWithHashtable2 {

    public static void sumTwoViaComplement(int[] array, int target) {

        // Initialize components.
        Hashtable<Integer, Integer> hashtable = new Hashtable<>();
        int complement = 0;

        // Loop over array for pairs of values that sum equals target.
        for (int i = 0; i <= array.length - 1; i++) {

            // Calculate complement of current array value.
            complement = target - array[i];

            if (hashtable.containsKey(complement)) {

                // Complement found in hash table, return indexes.
                System.out.println("[" + hashtable.get(complement) + ", " + i + "]");

            } else {

                // Complement not found, put current element/index into hashtable.
                hashtable.put(array[i], i);

            }
        }
        // System.out.println("No values that are added can sum target");
    }

    public static void main(String[] args) {

        int[] array = { 2, 7, 11, 15, 6, 8, 3 };
        int target = 18;

        System.out.println("Given the array: " + Arrays.toString(array));
        System.out.println("and target: " + target);

        sumTwoViaComplement(array, target);

        // System.out.println(indexes.equals("-1")
        // ? "No values added reach target"
        // : "First elements that added reach target are at indexes: " + indexes);
    }

}
