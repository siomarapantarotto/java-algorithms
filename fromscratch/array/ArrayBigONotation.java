package fromscratch.array;

import java.util.Arrays;

public class ArrayBigONotation {

    private int[] array;
    private int arraySize;
    private int itemsInArray = 0;
    static long startTime;
    static long endTime;

    // constructor
    ArrayBigONotation(int size) {
        arraySize = size;
        array = new int[size];
    }

    // fill up the array only to the penultimate position
    // the last position will be added later to show O(1)
    public void generateRandomArray() {
        for (int i = 0; i < arraySize - 1; i++) {
            array[i] = (int) (Math.random() * 1000) + 10;
        }
        itemsInArray = arraySize - 1; // penultimate position
    }

    // O(1) - excellent scenario
    public void addItemToArray(int newItem) {
        startTime = System.currentTimeMillis();
        array[itemsInArray++] = newItem;
        endTime = System.currentTimeMillis();
        System.out.println("Add new item to array took : " + (endTime - startTime) + " ms");
    }

    /**
     * Binary Search Algorithm
     * 
     * Time complexity:
     * ==> Average : O(log N)
     * ==> Best-case : O(1) if mid index matches desired value 1st time
     * ==> Worst-case: values at either extremity of the list or not found
     * 
     * Space complexity:
     * ==> iterative method: O(1)
     * ==> recursive method: O(log N) (stack)
     * 
     */
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
                // start = end + 1;
                break;
            }
        }
        endTime = System.currentTimeMillis();
        System.out.println("Binary Search took : " + (endTime - startTime) + " ms");
        System.out.println("Total Times Through: " + timesThrough);
    }

    /**
     * O(N log N)
     * 
     * comparisons = log n!
     * comparisons = log n + log (n - 1) + .... log(1)
     * comparisons = n log n
     * 
     */
    public void quickSort(int start, int end) {
        if (end - start <= 0) { // all sorted
            return;
        } else {
            int pivot = array[end];
            int pivotLocation = partitionArray(start, end, pivot);
            quickSort(start, pivotLocation - 1);
            quickSort(pivotLocation + 1, end);
        }
    }

    public int partitionArray(int left, int right, int pivot) {
        int leftPointer = left - 1;
        int rightPointer = right;

        while (true) {
            while (array[++leftPointer] < pivot)
                ;
            while (rightPointer > 0 && array[--rightPointer] > pivot)
                ;
            if (leftPointer >= rightPointer) {
                break;
            } else {
                // int temp = array[startPointer];
                // array[startPointer] = array[endPointer];
                // array[endPointer] = temp;
                swapValues(leftPointer, rightPointer);
            }
        }
        swapValues(leftPointer, right);
        return leftPointer;
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

    public void swapValues(int indexOne, int indexTwo) {
        int temp = array[indexOne];
        array[indexOne] = array[indexTwo];
        array[indexTwo] = temp;
    }

    public static void main(String[] args) {

        ArrayBigONotation testAlgoArray1 = new ArrayBigONotation(10000);
        testAlgoArray1.generateRandomArray();
        System.out.println("itemsInArray: " + testAlgoArray1.itemsInArray);

        ArrayBigONotation testAlgoArray2 = new ArrayBigONotation(30000);
        testAlgoArray2.generateRandomArray();
        System.out.println("itemsInArray: " + testAlgoArray2.itemsInArray);

        ArrayBigONotation testAlgoArray3 = new ArrayBigONotation(80000);
        testAlgoArray3.generateRandomArray();
        System.out.println("itemsInArray: " + testAlgoArray3.itemsInArray);

        System.out.println();

        // O(1) - excellent scenario
        testAlgoArray1.addItemToArray(123);
        testAlgoArray2.addItemToArray(123);
        testAlgoArray3.addItemToArray(123);

        System.out.println();

        // O(N) - fair scenario
        testAlgoArray1.linearSearchForValue(20);
        testAlgoArray2.linearSearchForValue(20);
        testAlgoArray3.linearSearchForValue(20);

        System.out.println();

        // // O(N^2) - horrible scenario
        // testAlgoArray1.bubbleSort();
        // testAlgoArray2.bubbleSort();
        // testAlgoArray3.bubbleSort();

        // O(N log N) - bad scenario
        startTime = System.currentTimeMillis();
        testAlgoArray1.quickSort(0, testAlgoArray1.itemsInArray - 1);
        endTime = System.currentTimeMillis();
        System.out.println("Quick Sort took: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        testAlgoArray2.quickSort(0, testAlgoArray2.itemsInArray - 1);
        endTime = System.currentTimeMillis();
        System.out.println("Quick Sort took: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        testAlgoArray3.quickSort(0, testAlgoArray3.itemsInArray - 1);
        endTime = System.currentTimeMillis();
        System.out.println("Quick Sort took: " + (endTime - startTime) + " ms");

        System.out.println();

        // O(log N) - good scenario
        testAlgoArray1.binarySearchForValue(20);
        testAlgoArray2.binarySearchForValue(20);
        testAlgoArray3.binarySearchForValue(20);

    }

}
