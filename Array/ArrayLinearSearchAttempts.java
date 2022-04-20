import java.util.Arrays;

public class ArrayLinearSearchAttempts {

    public static void main(String[] args) {

        int[] array = { 5, 10, 15, 20, 25, 30, 40 };
        int elementToBeFound = 18;

        int index = search(elementToBeFound, array);

        System.out.println("Array to be searched: " + Arrays.toString(array));
        System.out.println("Searching for: " + elementToBeFound);
        System.out.println(index == -1
                ? elementToBeFound + " not found"
                : elementToBeFound + " is at index: " + index);
    }

    public static int search(int element, int[] array) {
        int arrLength = array.length;
        int leftIndex = 0;
        int rightIndex = arrLength - 1;

        for (leftIndex = 0; leftIndex <= rightIndex;) {

            // Searching from LEFT to RIGHT
            if (array[leftIndex] == element) {
                System.out.println( "\nLEFT to RIGHT: element found with " + (leftIndex + 1) + " Attempt(s)");
                return leftIndex;
            }

            // Searching from RIGHT to LEFT
            if (array[rightIndex] == element) {
                System.out.println( "\nRIGHT to LEFT: element found with " + (arrLength - rightIndex) + " Attempt(s)");
                return rightIndex;
            }
            leftIndex++;
            rightIndex--;
        }
        // The code bellow will be executed only for NOT FOUND element
        System.out.println("\nSearching BOTH DIRECTIONS with " + leftIndex + " attempt(s) only");            
        return -1;            
    }
}
