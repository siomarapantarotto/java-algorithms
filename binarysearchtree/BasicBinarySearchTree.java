package binarysearchtree;

public class BasicBinarySearchTree {

    public static int binarySearchRecursive(int[] array, int left, int right, int elementToBeFound) {

        // base case 1
        if (left > right) {
            return -1;
        }

        // find array middle index
        int mid = left + (right - left) / 2;

        // base case 2
        // int mid = left + (right - left) / 2;
        if (array[mid] == elementToBeFound) {
            return mid;
        }

        // call recursive defining if element is to be searched
        if (elementToBeFound < array[mid]) {
            return binarySearchRecursive(array, left, mid - 1, elementToBeFound);
        } else {
            return binarySearchRecursive(array, mid + 1, right, elementToBeFound);
        }
    }

    public static void main(String args[]) {

        // define array and element to be searched
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int elementToBeFound = 20;

        // call recursive search
        // array.length - 1 is a must when searching for values > last array value
        int index = binarySearchRecursive(array, 0, array.length - 1, elementToBeFound);

        // display result
        System.out.println(index == -1
                ? elementToBeFound + " was not found"
                : elementToBeFound + " was found at index " + index);
    }
}
