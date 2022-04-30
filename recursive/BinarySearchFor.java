package recursive;

public class BinarySearchFor {

    public static int searchFor(int[] array, int left, int right, int elementToBeFound) {
        // base case 1
        if (left > right) {
            return -1;
        }

        // find array middle index
        int mid = (left + right) / 2;

        // base case 2
        if (elementToBeFound == array[mid]) {
            return mid;
        }

        // element is on the left array
        if (elementToBeFound < array[mid]) {
            return searchFor(array, left, mid - 1, elementToBeFound);
        }

        // element is on the right array
        return searchFor(array, mid + 1, right, elementToBeFound);
    }

    public static void main(String[] args) {
        // define array and element to be found
        int[] array = { 5, 15, 25, 35, 45, 55, 100 };
        int elementToBeFound = 105;

        // call recursive method searchFor
        // array.length - 1 is a must when searching for values > 100
        int index = searchFor(array, 0, array.length - 1, elementToBeFound);

        // display result
        System.out.println(index == -1
                ? elementToBeFound + " not found"
                : elementToBeFound + " is at index " + index);
    }
}
