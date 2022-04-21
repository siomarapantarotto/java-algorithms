package BubbleSort;

import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {

        Random rand = new Random();
        int[] numbers = new int[10];
        int i, temp;

        for (i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(1000000);
        }

        System.out.println("Before:");
        printArray(numbers);

        // Sorting algorithm here
        boolean swappedSomething = true;

        while (swappedSomething) {
            swappedSomething = false;

            for (i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    swappedSomething = true;
                    temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                }
            }
        }

        System.out.println("\nAfter:");
        printArray(numbers);
    }

    private static void printArray(int[] numbers) {
        int i;
        for (i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
