package hashtable;

import java.util.Arrays;
import java.util.Hashtable;

public class SumTwoWithHashtable {

    public static String sumTwoViaComplement(int[] array, int target) {

        // Initialize components.
        Hashtable<Integer, Integer> hashtable = new Hashtable<>();
        int complement = 0;

        // Loop array for the first two values whose sum equals target.
        for (int i = 0; i <= array.length - 1; i++) {

            // Calculate complement of current array value.
            complement = target - array[i];

            if (hashtable.containsKey(complement)) {

                // Complement found in hash table, return indexes.
                return "[" + hashtable.get(complement) + ", " + i + "]";

            } else {

                // Complement not found, put current element/index into hashtable.
                hashtable.put(array[i], i);

            }
        }
        return "-1";
    }

    public static void main(String[] args) {

        int[] array = { 2, 7, 11, 15, 6, 8, 3 };
        int target = 18;

        System.out.println("Given the array: " + Arrays.toString(array));
        System.out.println("and target: " + target);

        String indexes = sumTwoViaComplement(array, target);

        System.out.println(indexes.equals("-1")
                ? "No values added reach target"
                : "First elements that added reach target are at indexes: " + indexes);
    }
}
// Given an array of integers nums and an integer target,
// return indices of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution,
// and you may not use the same element twice.
// You can return the answer in any order.
// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9,
// we return [0, 1].
