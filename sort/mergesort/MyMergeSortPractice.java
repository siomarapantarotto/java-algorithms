package sort.mergesort;

import java.util.Arrays;

public class MyMergeSortPractice {

    public static void mergeSort(int[] data) {
        int start = 0;
        int end = data.length - 1;
        mergeSort(data, start, end);
    }

    public static void mergeSort(int[] data, int start, int end) {

        if (start < end) {
            int mid = (start + end) / 2; // find middle
            mergeSort(data, start, mid);
            mergeSort(data, mid + 1, end);
            merge(data, start, mid, end);
        }
    }

    public static void merge(int[] data, int start, int mid, int end) {

        int[] temp = new int[end - start + 1]; // set correct size
        int i = start, j = mid + 1, k = 0;

        while (i <= mid && j <= end) // double condition
            if (data[i] < data[j])
                temp[k++] = data[i++];
            else
                temp[k++] = data[j++];

        while (i <= mid)
            temp[k++] = data[i++];

        while (j <= end)
            temp[k++] = data[j++];

        for (i = start; i <= end; i++)
            data[i] = temp[i - start]; // attention to temp index

    }

    public static void main(String[] args) {
        int[] data = new int[] { 40, 30, 60, 458, 79, 32, 50, 100 };

        System.out.println("Before Merge Sort: " + Arrays.toString(data));
        mergeSort(data);
        System.out.println("After Merge Sort : " + Arrays.toString(data));
    }
}
