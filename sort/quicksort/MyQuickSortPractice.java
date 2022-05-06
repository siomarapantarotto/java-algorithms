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

    private static int partition(int data[], int start, int end) {
        System.out.println(Arrays.toString(data));
        int pivot = data[end];
        int grtIndex = (start - 1);
        System.out.println("\npivot: " + pivot + "\tgrtIndex : " + grtIndex);

        for (int j = start; j < end; j++) {
            System.out.println("J : " + j + "\tgrtIndex : " + grtIndex + " call if()");
            if (data[j] <= pivot) {
                grtIndex++;
                System.out.println("grtIndex++ : " + grtIndex + " call swap");
                swap(data, grtIndex, j);
            }
        }
        swap(data, grtIndex + 1, end);
        return (grtIndex + 1);
    }

    private static void swap(int[] data, int index1, int index2) {
        System.out.println("swap data[" + index1 + "]    data: " + data[index1]
                + "   with    data[" + index2 + "]    data: " + data[index2]);
        int temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;
    }

    public static void main(String[] args) {
        int[] data = new int[] { 9, 5, 2, 8, 6, 1, 4 };
        System.out.println(Arrays.toString(data));
        quickSort(data, 0, data.length - 1);
        System.out.println(Arrays.toString(data));
    }

}
