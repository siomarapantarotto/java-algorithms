package sorting.mergesort;

import java.util.Arrays;
import java.util.Random;

public class MergeSort {

    // main driver
    public static void main(String[] args) {

        Random random = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1000000);
        }

        System.out.println("\nUnsorted array:");
        System.out.println(Arrays.toString(numbers));

        long start = System.currentTimeMillis();
        mergeSort(numbers);
        long finish = System.currentTimeMillis();

        System.out.println("\nMerge sorted array in ascending order:");
        System.out.println(Arrays.toString(numbers));

        System.out.println("\nMerge Sort took: " + (finish - start) + " msecs");
    }

    private static void mergeSort(int[] arr) {
        int arrLength = arr.length;

        // base case to stop recursion
        if (arrLength < 2) {
            return;
        }

        // find the middle and create left and right arrays
        int midIndex = arrLength / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[arrLength - midIndex]; // for odd length arrays

        // populate left array from 0 to midIndex - 1
        for (int i = 0; i < midIndex; i++) {
            leftHalf[i] = arr[i];
        }

        // populate right array from midIndex to arrLength -1
        for (int i = midIndex; i < arrLength; i++) {
            rightHalf[i - midIndex] = arr[i];
        }

        // call this method recursively
        mergeSort(leftHalf);
        mergeSort(rightHalf);

        merge(arr, leftHalf, rightHalf);
    }

    private static void merge(int[] arr, int[] leftHalf, int[] rightHalf) {
        int leftLength = leftHalf.length;
        int rightLength = rightHalf.length;

        int i = 0, j = 0, k = 0;

        while (i < leftLength && j < rightLength) {
            if (leftHalf[i] <= rightHalf[j]) {
                arr[k] = leftHalf[i];
                i++;
            } else {
                arr[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        while (i < leftLength) {
            arr[k] = leftHalf[i];
            i++;
            k++;
        }
        while (j < rightLength) {
            arr[k] = rightHalf[j];
            j++;
            k++;
        }
    }
}
