package sort.mergesort;

import java.util.Arrays;

public class MyMergeSortPractice2 {

    public static void mergeSort(int[] data) {
        mergeSort(data, 0, data.length - 1);
    }

    private static void mergeSort(int[] data, int start, int end) {
        if (start < end) { // start with IF(), nothing before
            int mid = (start + end) / 2; // find middle
            mergeSort(data, start, mid);
            mergeSort(data, mid + 1, end);
            merge(data, start, mid, end);
        }
    }

    private static void merge(int[] data, int start, int mid, int end) {

        int[] temp = new int[end - start + 1]; // size correctly
        int i = start, j = mid + 1, k = 0; // i and j point to the subarrays starts

        while (i <= mid && j <= end) // double condition
            if (data[i] < data[j])
                temp[k++] = data[i++];
            else
                temp[k++] = data[j++];

        while (i <= mid)
            temp[k++] = data[i++];

        while (j <= end)
            temp[k++] = data[j++];

        for (i = start; i <= end; i++) { // attention here i starts with start not 0
            data[i] = temp[i - start]; // attention to temp index
        }

    }

    public static void main(String[] args) {
        int[] data = new int[] { 30, 50, 20, 90, 100, 10, 40, 60 };

        System.out.println("Before Merge Sort: " + Arrays.toString(data));
        mergeSort(data);
        System.out.println("After Merge Sort: " + Arrays.toString(data));
    }

}
