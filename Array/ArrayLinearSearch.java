package array;

import java.util.Arrays;

/**
 * By siomara.com.br on May, 2022.
 */
public class ArrayLinearSearch {

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

        for (int i = 0; i <= (array.length - 1); i++) {
            if (array[i] == elementToBeFound) {
                System.out.println("Total of attempts: " + (i + 1));
                return i;
            }

        }

        // If code reaches here means that element was NOT FOUND.
        System.out.println("Total of attempts: " + array.length);
        return -1;

    }

}
