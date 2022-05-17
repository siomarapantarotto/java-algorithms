package sort.insertsort;

import java.util.Arrays;

public class InsertSort {

    public static void insertSort(int[] data) {
        for (int i = 1; i < data.length; i++) {
            int j = i;
            int toInsert = data[i];
            while ((j > 0) && (data[j - 1] > toInsert)) {
                data[j] = data[j - 1];
                j--;
            }
            data[j] = toInsert;
        }
    }

    public static void insertSort2(int[] data) {
        int temp;
        for (int i = 1; i < data.length; i++) {
            int j = i;
            int toInsert = data[i];
            while ((j > 0) && (data[j - 1] > toInsert)) {
                temp = data[j];
                data[j] = data[j - 1];
                data[j - 1] = temp;
                j--;
            }

        }
    }

    public static void main(String[] args) {

        int[] data = new int[] { 7, 18, 66, 12, 10, 5, 45, 9, 6, 100 };
        System.out.println("Before Insert Sort: \n" + Arrays.toString(data));
        insertSort(data);
        System.out.println("After  Insert Sort: \n" + Arrays.toString(data));

        System.out.println();

        int[] data2 = new int[] { 7, 18, 66, 12, 10, 5, 45, 9, 6, 100 };
        System.out.println("Before Insert Sort: \n" + Arrays.toString(data2));
        insertSort2(data2);
        System.out.println("After  Insert Sort: \n" + Arrays.toString(data2));
    }

}
