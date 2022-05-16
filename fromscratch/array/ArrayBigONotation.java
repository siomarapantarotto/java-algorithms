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
    }

    public void generateRandomArray() {
        for (int i = 0; i < arraySize; i++) {
            array[i] = (int) (Math.random() * 1000) + 10;
        }
        // itemsInArray = arraySize - 1;
        itemsInArray = arraySize;
    }

    // O(1) - excellent scenario
    public void addItemToArray(int newItem) {
        array[itemsInArray++] = newItem;
    }

    // O(log N)
    public void binarySearchForValue(int value) {
        int start = 0;
        int end = arraySize - 1;
        int timesThrough = 0;
        int mid;

        startTime = System.currentTimeMillis();
        while (start < end) {
            timesThrough++;
            mid = (end + start) / 2;

            if (value < array[mid])
                end = mid - 1;
            else if (value > array[mid])
                start = mid + 1;
            else { // not greater, not lower, then it is middle
                System.out.println("Found a match for " + value + " at index " + mid);
                break;
            }
        }
        endTime = System.currentTimeMillis();
        System.out.println("Binary Search took : " + (endTime - startTime) + " ms");
        System.out.println("Total Times Through: " + timesThrough);
    }

    // O(N) - fair scenario
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
        // System.out.println(valueInArray
        // ? value + " was found at indexes: " + indexesWithValue
        // : value + " was NOT found");
        System.out.println("Linear Search took: " + (endTime - startTime) + " ms");
    }

    // O(N^2) - horrible scenario - should be avoided
    public void bubbleSort() {
        startTime = System.currentTimeMillis();
        int i, j, temp;
        for (i = arraySize - 1; i > 0; i--) {
            for (j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        endTime = System.currentTimeMillis();
        System.out.println("Bubble Sort took: " + (endTime - startTime) + " ms");
    }

    public static void main(String[] args) {

        ArrayBigONotation testAlgo2 = new ArrayBigONotation(10000);
        testAlgo2.generateRandomArray();
        System.out.println("itemsInArray: " + testAlgo2.itemsInArray);

        ArrayBigONotation testAlgo3 = new ArrayBigONotation(30000);
        testAlgo3.generateRandomArray();
        System.out.println("itemsInArray: " + testAlgo3.itemsInArray);

        ArrayBigONotation testAlgo4 = new ArrayBigONotation(80000);
        testAlgo4.generateRandomArray();
        System.out.println("itemsInArray: " + testAlgo4.itemsInArray);

        System.out.println();

        testAlgo2.linearSearchForValue(20);
        testAlgo3.linearSearchForValue(20);
        testAlgo4.linearSearchForValue(20);

        System.out.println();

        testAlgo2.bubbleSort();
        testAlgo3.bubbleSort();
        testAlgo4.bubbleSort();

        System.out.println();

        testAlgo2.binarySearchForValue(20);
        testAlgo3.binarySearchForValue(20);
        testAlgo4.binarySearchForValue(20);

    }

}
