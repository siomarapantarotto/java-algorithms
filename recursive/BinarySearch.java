package recursive;

public class BinarySearch {

    public static int searchFor(int[] array, int left, int right, int elementToBeFound) {
        if (left > right) {
            return -1;
        }

        int mid = (left + right) / 2;
        if (elementToBeFound == array[mid]) {
            return mid;
        }

        if (elementToBeFound < array[mid]) {
            return searchFor(array, left, mid - 1, elementToBeFound);
        }
        return searchFor(array, mid + 1, right, elementToBeFound);
    }

    public static void main(String[] args) {
        int[] array = { 1, 3, 5, 7, 9, 100 };
        int elementToBeFound = 7;
        int index = searchFor(array, 0, array.length, elementToBeFound);
        System.out.println(index == -1
                ? elementToBeFound + " not found"
                : elementToBeFound + " is at index: " + index);
    }

}
