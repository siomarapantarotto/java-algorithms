package sort.quicksort;

import java.util.Arrays;

public class MyQuickSortPractice {

    public static void quickSort(int[] data) {
        int start = 0;
        int end = data.length - 1;
        quickSort(data, start, end);
    }

    private static void quickSort(int[] data, int start, int end) {
        if (start < end) {
            int pivot = partition(data, start, end);
            quickSort(data, start, pivot - 1);
            quickSort(data, pivot + 1, end);
        }
    }

    private static int partition(int[] data, int start, int end) {

        int pivot = data[end];
        int grtIndex = start - 1; // Set according to start, not just -1

        for (int i = start; i < end; i++) {
            if (data[i] <= pivot) { // check for <=
                grtIndex++; // increment before swapp here but not bellow
                swap(data, i, grtIndex); // order of indexes does not matter
            }
        }
        swap(data, end, grtIndex + 1); // remember to increment (grtIndex + 1)
        return grtIndex + 1; // return grtIndex incremented
    }

    private static void swap(int[] data, int index1, int index2) {
        int temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;
    }

    public static void main(String[] args) {
        int[] data = new int[] { 40, 30, 60, 455, 79, 32, 50, 200 };

        System.out.println("Before Quick Sort: " + Arrays.toString(data));
        quickSort(data);
        System.out.println("After Quick Sort : " + Arrays.toString(data));
    }

}
