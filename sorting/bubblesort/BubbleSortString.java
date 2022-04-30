package sorting.bubblesort;

public class BubbleSortString {

    static void bubbleSort(String[] arr) {
        int arrLength = arr.length;
        String tempSwapBuffer;
        Boolean swappedSomething = true;

        while (swappedSomething) {
            swappedSomething = false;
            for (int i = 0; i < (arrLength - 1); i++) {
                // comparing adjacent strings
                if (arr[i].compareTo(arr[i + 1]) > 0) { // ascending
                    // if (arr[i].compareTo(arr[i + 1]) < 0) { // descending
                    tempSwapBuffer = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tempSwapBuffer;
                    swappedSomething = true;
                }
            }
        }
    }

    private static void printArray(String[] arr) {
        int arrLength = arr.length;
        for (int i = 0; i < arrLength; i++) {
            System.out.print("\t" + arr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String[] names = { "Paul", "Ringo", "John", "Zorn", "Ana", "George", "Bob" };

        System.out.println("Unsorted array:");
        printArray(names);

        bubbleSort(names); // Apply bubble sort

        System.out.println("Bubble sorted array in ascending order:");
        // System.out.println("Bubble sorted array in descending order:");
        printArray(names);
    }
}