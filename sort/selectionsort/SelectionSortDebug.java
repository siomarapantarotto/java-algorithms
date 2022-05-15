package sort.selectionsort;

import java.util.Arrays;

public class SelectionSortDebug {

    public static void sort(int[] array) {

        int minimum, temp;

        for (int x = 0; x < array.length; x++) {
            System.out.println("x: array[" + x + "] = " + array[x]);
            minimum = x;
            System.out.println("minimum = x; " + minimum);

            for (int y = x; y < array.length; y++) {
                System.out.println("y: array[" + y + "] = " + array[y]);
                if (array[minimum] > array[y]) {
                    System.out.println("=======> array[" + minimum + "] > array[" + y + "]");
                    minimum = y;
                    System.out.println("minimum = y; " + minimum);
                }
            }

            System.out.println("Before swap: " + Arrays.toString(array));
            temp = array[x];
            array[x] = array[minimum];
            array[minimum] = temp;
            System.out.println("After swap: " + Arrays.toString(array));
        }
    }

    public static void main(String[] args) {
        int[] data = new int[] { 10, 40, 20, 5, 30, 1, 25 };
        System.out.println("Before Selection Sort: " + Arrays.toString(data));
        sort(data);
        System.out.println("After Selection Sort: " + Arrays.toString(data));
    }

}
