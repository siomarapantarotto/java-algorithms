package sort.mergesort;

import java.util.Arrays;

public class MyMergeSortPractice2 {

    public static void mergeSort(int[] data) {
        mergeSort(data, 0, data.length - 1);
    }

    private static void mergeSort(int[] data, int start, int end) {

        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(data, start, mid);
            mergeSort(data, mid + 1, end);
            merge(data, start, mid, end);
        }
    }

    private static void merge(int[] data, int start, int mid, int end) {

    }

    public static void main(String[] args) {
        int[] data = new int[] { 30, 50, 20, 90, 100, 10, 40, 60 };

        System.out.println(Arrays.toString(data));
        mergeSort(data);
        System.out.println(Arrays.toString(data));
    }

}
