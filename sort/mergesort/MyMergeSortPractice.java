package sort.mergesort;

import java.util.Arrays;

public class MyMergeSortPractice {

    // Overload - This method receives just the array to be
    // sorted avoiding that wrong parameters are passed.
    public static void mergeSort(int[] data) {
        // Call method mergeSort passing 'array, start and end' that
        // can be figured out instead of being passed as parameters.
        mergeSort(data, 0, data.length - 1);
    }

    // The core merge sort starts here.
    private static void mergeSort(int[] data, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2; // find middle
            mergeSort(data, start, mid);
            mergeSort(data, mid + 1, end);
            merge(data, start, mid, end);
        }
    }

    private static void merge(int[] data, int start, int mid, int end) {

        int[] temp = new int[end - start + 1]; // set correct size for temp array
        int i = start, j = mid + 1, k = 0; // set i and j to the subarrays starts

        while (i <= mid && j <= end) // double condition
            if (data[i] < data[j])
                temp[k++] = data[i++];
            else
                temp[k++] = data[j++];

        while (i <= mid)
            temp[k++] = data[i++];

        while (j <= end)
            temp[k++] = data[j++];

        for (i = start; i <= end; i++) // attention here, i = start
            data[i] = temp[i - start]; // attention to temp index

    }

    public static void main(String[] args) {
        int[] data = new int[] { 40, 30, 60, 455, 79, 32, 50, 100 };

        System.out.println("Before Merge Sort: " + Arrays.toString(data));
        mergeSort(data);
        System.out.println("After Merge Sort : " + Arrays.toString(data));
    }
}
