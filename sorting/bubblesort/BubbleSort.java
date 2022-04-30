package sorting.bubblesort;

import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {

        Random random = new Random();
        int[] array = new int[10];
        int temp;

        // Create array randomly.
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);
        }

        // Printing array before sorting.
        System.out.println("\nUnsorted array:");
        printArray(array);

        // Sorting algorithm comes here.
        boolean swappedSomething = true;

        while (swappedSomething) {
            swappedSomething = false;

            for (int i = 0; i < (array.length - 1); i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swappedSomething = true;
                }
            }
        }

        // Printing array after sorting.
        System.out.println("\nSorted array:");
        printArray(array);
    }

    // Method for printing array.
    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
