package sort.selectionsort;

import java.util.Arrays;

public class SelectionSort {

    public static void sort(int[] array) {

        int minimum, temp;

        for (int x = 0; x < array.length; x++) {
            minimum = x;
            for (int y = x; y < array.length; y++) {
                if (array[minimum] > array[y]) {
                    minimum = y;
                }
            }
            temp = array[x];
            array[x] = array[minimum];
            array[minimum] = temp;
        }
    }

    public static void main(String[] args) {
        int[] data = new int[] { 10, 40, 20, 5, 30, 1, 25 };
        System.out.println("Before Selection Sort: " + Arrays.toString(data));
        sort(data);
        System.out.println("After Selection Sort: " + Arrays.toString(data));
    }

}
