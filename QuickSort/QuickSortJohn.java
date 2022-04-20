import java.util.Random;
//import java.util.Arrays;

public class QuickSortJohn {

    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[1000000000];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1000000);
        }

        //System.out.println("\nUnsorted array:");
        //System.out.println(Arrays.toString(numbers));

        long start = System.currentTimeMillis();
        quickSort(numbers); // overload method
        //quickSort(numbers, 0, numbers.length - 1);
        long finish = System.currentTimeMillis();

        //System.out.println("\nQuick sorted array in ascending order:");
        //System.out.println(Arrays.toString(numbers));

        System.out.println("\nQuick Sort took: " + (finish - start) + " msecs");
    }

    // method that applies quick sort
    private static void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    // method that applies quick sort
    private static void quickSort(int[] array, int lowIndex, int highIndex) {

        // dealing with an array with just one element
        if (lowIndex >= highIndex) {
            return;
        }

        // choose the rightmost element as pivot
        //int pivot = array[highIndex];

        // choose randomly an element as pivot
        int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
        int pivot = array[pivotIndex];
        swap(array, pivotIndex, highIndex);

        int leftPointer = partition(array, lowIndex, highIndex, pivot);

        // Partition ends with leftPointer hiting rightPointer
        // indicating the pivot position, now call recursivily
        // the left and right arrays based on pivot
        quickSort(array, lowIndex, (leftPointer - 1));
        quickSort(array, (leftPointer + 1), highIndex);
    }

    private static int partition(int[] array, int lowIndex, int highIndex, int pivot) {
        // create pointers
        int leftPointer = lowIndex; // left most part of the array
        int rightPointer = highIndex; // right most part of the array

        // Loop to move pointers toward each other until they hit each other
        while (leftPointer < rightPointer) {
            // walk left pointer from left to right until find a number higher than the
            // pivot
            // or the left pointer hits the right pointer (pointers hit each other)
            while (array[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++; // increment for moving the left pointer
            }
            // walk right pointer from right to left until find a number less than the pivot
            // or the right pointer hits the left pointer (pointers hit each other)
            while (array[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--; // decrement for moving the right pointer
            }
            swap(array, leftPointer, rightPointer);
        }
        // swap pivot with element that pointers hit each other
        swap(array, leftPointer, highIndex); // pivot is always in the the right most spot
        return leftPointer; // pivot position
    }

    // method for swapping elements
    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
