package fromscratch.array;

import java.util.Arrays;

public class ArrayBigONotation {

    private int[] array;
    private int arraySize;
    private int itemsInArray = 0;
    static long startTime;
    static long endTime;

    ArrayBigONotation(int size) {
        arraySize = size;
        array = new int[size];
        generateRandomArray();
    }

    public void generateRandomArray() {
        for (int i = 0; i < arraySize; i++) {
            array[i] = (int) (Math.random() * 20) + 10;
        }
    }

    // O(1)
    public void addItemToArray(int newItem) {
        array[itemsInArray++] = newItem;
    }

    // O(N)
    public void linearSearchForValue(int value) {
        boolean valueInArray = false;
        String indexesWithValue = "";
        startTime = System.currentTimeMillis();
        for (int i = 0; i < arraySize; i++) {
            if (array[i] == value) {
                valueInArray = true;
                indexesWithValue += i + " ";
            }
        }
        endTime = System.currentTimeMillis();
        System.out.println(valueInArray
                ? value + " was found at indexes: " + indexesWithValue
                : value + " was NOT found");
        System.out.println("Linear Search took: " + (endTime - startTime) + " ms");
        System.out.println();
    }

    public static void main(String[] args) {

        ArrayBigONotation arrBigO = new ArrayBigONotation(15);

        System.out.println(Arrays.toString(arrBigO.array));
        arrBigO.addItemToArray(40);
        arrBigO.linearSearchForValue(11);

    }

}
