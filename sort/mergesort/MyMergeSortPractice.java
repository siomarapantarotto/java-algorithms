package sort.mergesort;

import java.util.Arrays;

public class MyMergeSortPractice {

    public static void mergeSort(int[] data, int start, int end) {

        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(data, start, mid);
            mergeSort(data, mid + 1, end);
            merge(data, start, mid, end);
        }

    }

    public static void merge(int[] data, int start, int mid, int end) {

        int[] temp = new int[end - start + 1];

        int i = start, j = mid + 1, k = 0;

        while (i <= mid && j <= end) {

            if (data[i] < data[j]) {
                temp[k] = data[i];
                i++;
                k++;
            } else {
                temp[k] = data[j];
                j++;
                k++;
            }
        }

        while (i <= mid) {
            temp[k] = data[i];
            i++;
            k++;
        }

        while (j <= end) {
            temp[k] = data[j];
            j++;
            k++;
        }

        for (i = start; i <= end; i++) {
            data[i] = temp[i - start];
        }

    }

    public static void main(String[] args) {

        int[] data = new int[] { 40, 30, 60, 79, 32, 50, 100 };

        System.out.println(Arrays.toString(data));
        mergeSort(data, 0, data.length - 1);
        System.out.println(Arrays.toString(data));

    }

}
