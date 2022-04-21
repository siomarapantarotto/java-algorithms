package Array;

import java.util.Arrays;

/**
 * By siomara.com.br on May, 2022.
 */
public class ArrayLinearSearchAttempts {

    public static void main(String[] args) {

        int[] array = { 5, 10, 15, 20, 25, 30, 35, 40 };
        System.out.println("\nArray to be searched: " + Arrays.toString(array));

        int elementToBeFound = 33;
        System.out.println("Searching for: " + elementToBeFound);

        int index = findElement(array, elementToBeFound);

        System.out.println(index == -1
                ? elementToBeFound + " was not found"
                : elementToBeFound + " found at index: " + index);

    }

    public static int findElement(int[] array, int elementToBeFound) {

        int arrLength = array.length;
        int leftIndex = 0;
        int rightIndex = arrLength - 1;

        for (leftIndex = 0; leftIndex <= rightIndex;) {

            // Searching from LEFT to RIGHT.
            if (array[leftIndex] == elementToBeFound) {
                System.out.println("\nSearching LEFT-TO-RIGHT: element found with "
                        + (leftIndex + 1) + " attempt(s)");
                return leftIndex;
            }

            // Searching from RIGHT to LEFT.
            if (array[rightIndex] == elementToBeFound) {
                System.out.println("\nSearching RIGHT-TO-LEFT: element found with "
                        + (arrLength - rightIndex) + " attempt(s)");
                return rightIndex;
            }

            // Increment left/decrement right indexes.
            leftIndex++;
            rightIndex--;

        }

        // If code reaches here means that element was NOT FOUND.
        System.out.println("\nSearching BOTH DIRECTIONS with "
                + leftIndex + " attempt(s) only");
        return -1;

    }

}
