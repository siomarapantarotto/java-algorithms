package recursive;

public class BinarySearch {

    public static int searchFor(int[] array, int left, int right, int elementToBeFound) {

        // base case 1
        if (left > right) {
            return -1;
        }

        // int mid = left + (right - left) / 2;
        int mid = (left + right) / 2;

        // base case 2
        if (elementToBeFound == array[mid]) {
            return mid;
        }

        // call recursive to find element on the left array
        if (elementToBeFound < array[mid]) {
            return searchFor(array, left, mid - 1, elementToBeFound);
        }

        // call recursive to find element on the left array
        return searchFor(array, mid + 1, right, elementToBeFound);
    }

    // driver method
    public static void main(String[] args) {

        // define array and element to be found
        int[] array = { 10, 20, 30, 40, 50, 100 };
        int elementToBeFound = 101;

        // call recursive method searchFor
        // array.length - 1 is a must when searching for values > 100
        int index = searchFor(array, 0, array.length - 1, elementToBeFound);

        // display result
        System.out.println(index == -1
                ? elementToBeFound + " not found"
                : elementToBeFound + " is at index: " + index);
    }

}
