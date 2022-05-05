package sort.bubblesort;

import java.util.Random;
import java.util.Arrays;

public class MyBubbleSortPractice {

    public static void bubbleSort(int[] array) {

        int arrayLength = array.length;
        int tempSwap, i;
        boolean swappedSomething = true;

        while (swappedSomething) {
            swappedSomething = false;
            for (i = 0; i < arrayLength - 1; i++) {
                if (array[i] > array[i + 1]) {
                    tempSwap = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tempSwap;
                    swappedSomething = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = random.nextInt(100);
        }

        System.out.println("Before Bubble Sort:" + Arrays.toString(array));
        bubbleSort(array);
        System.out.println("Before Bubble Sort:" + Arrays.toString(array));
    }
}
