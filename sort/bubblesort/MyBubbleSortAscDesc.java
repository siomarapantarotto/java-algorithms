package sort.bubblesort;

import java.util.Random;

class MyBubbleSortAscDesc {

    // method for ascending array sort
    static void bubbleSortAscending(int[] numbers) {
        int i, temp;
        Boolean swappedSomething = true;

        while (swappedSomething) {
            swappedSomething = false;
            for (i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                    swappedSomething = true;
                }
            }
        }
    }

    // method for descending array sort
    static void bubbleSortDescending(int[] numbers) {
        int i, temp;
        Boolean swappedSomething = true;

        while (swappedSomething) {
            swappedSomething = false;
            for (i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] < numbers[i + 1]) {
                    temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                    swappedSomething = true;
                }
            }
        }
    }

    // method for printing an array
    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("\t" + array[i]);
        }
        System.out.println();
    }

    // Main method - Entrance point for Bubble Sort
    public static void main(String[] args) {

        Random random = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

        System.out.println("\nUnsorted array:");
        printArray(numbers);

        long start = System.currentTimeMillis();
        bubbleSortAscending(numbers);
        // bubbleSortDescending(numbers);
        long finish = System.currentTimeMillis();

        System.out.println("\nSorted array in ascending order:");
        printArray(numbers);

        System.out.println("\nBubble Sort took: " + (finish - start) + " msecs");
    }
}
