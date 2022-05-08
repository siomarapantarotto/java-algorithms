package search.binarytree;

public class BSTSearchFor {

    public static int searchFor(int[] data, int start, int end, int elementToBeFound) {

        if (start > end) // base case 1
            return -1;

        int middle = start + (end - start) / 2; // find middle index

        if (elementToBeFound == data[middle]) // base case 2
            return middle;

        if (elementToBeFound < data[middle])
            return searchFor(data, start, middle - 1, elementToBeFound); // search left
        else
            return searchFor(data, middle + 1, end, elementToBeFound); // search right
    }

    public static void main(String[] args) {
        // define array and element to be found
        int[] data = { 5, 15, 25, 35, 45, 55, 100 };
        int elementToBeFound = 45;

        // call recursive method searchFor
        // array.length - 1 is a must when searching for values > last array value
        int index = searchFor(data, 0, data.length - 1, elementToBeFound);

        // display result
        System.out.println(index == -1
                ? elementToBeFound + " not found"
                : elementToBeFound + " is at index " + index);
    }
}
