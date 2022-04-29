package BinarySearchTree;

public class BasicBinarySearchTree {

    public static int binarySearchRecursive(int[] array, int elementToBeFound, int left, int right) {

        if (left > right) {
            return -1;
        }

        int mid = left + (right - left) / 2;
        if (array[mid] == elementToBeFound) {
            return mid;
        }

        if (elementToBeFound < array[mid]) {
            return binarySearchRecursive(array, elementToBeFound, left, mid - 1);
        } else {
            return binarySearchRecursive(array, elementToBeFound, mid + 1, right);
        }
    }

    public static void main(String args[]) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 20 };
        int elementToBeFound = 20;
        int index = binarySearchRecursive(array, elementToBeFound, 0, 9);
        System.out.println(index == -1
                ? elementToBeFound + " was not found"
                : elementToBeFound + " was found at index " + index);
    }
}
