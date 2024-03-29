package sort.bubblesort;

public class BubbleSortAscending {

    static void bubbleAscending(int[] arr) {
        int arrLength = arr.length;
        int i, j, temp;
        for (i = 0; i < arrLength; i++) {
            for (j = 1; j < (arrLength - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    // Swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    // Method for printing an array
    static void printArray(int arr[]) {
        int arrLength = arr.length;
        int i;
        for (i = 0; i < arrLength; i++) {
            System.out.print("\t" + arr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 4, 15, 12, 21, 2, 25, 10, 18, 0, 7, 9, 111 };

        System.out.println("Array before applying ASCENDING Bubble Sort: ");
        printArray(arr);

        bubbleAscending(arr); // Applying Bubble sort

        System.out.println("Array after applying ASCENDING Bubble Sort: ");
        printArray(arr);
    }
}
