package Array;

import java.util.Arrays;

public class ArrayLinearSearch {

    public static void main(String[] args) {

        int[] array = { 5, 10, 15, 20, 25, 30, 40 };
        int elementToBeFound = 40;

        int index = find(array, elementToBeFound);

        System.out.println("\nArray to be searched: " + Arrays.toString(array));
        System.out.println("Searching for: " + elementToBeFound);
        System.out.println(index == -1
                ? elementToBeFound + " not found."
                : elementToBeFound + " is at index: " + index);
        System.out.println("Total of attempts: " + (index + 1));

    }

    public static int find(int[] array, int elementToBeFound) {
        for (int i = 0; i <= (array.length - 1); i++) {
            if (array[i] == elementToBeFound) {
                return i;
            }
        }
        return -1;
    }
}
