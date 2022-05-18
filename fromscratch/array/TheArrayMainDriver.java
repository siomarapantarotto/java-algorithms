package fromscratch.array;

public class TheArrayMainDriver {

    
    // main driver method
    public static void main(String[] args) {

        TheArray arr = new TheArray();

        System.out.println("\n==========> generateRandomArray()");
        arr.generateRandomArray();
        arr.printArray();
        // System.out.println(Arrays.toString(arr.array));

        System.out.println("\n==========> getValueAtIndex(9)");
        int valueAtIndex = arr.getValueAtIndex(9);
        System.out.println(valueAtIndex == -1
                ? "\nIndex out of bounds"
                : "\nThe value at index 9 is: " + valueAtIndex);

        System.out.println("\n==========> containsValue(14)");
        boolean contain = arr.containsValue(14);
        System.out.println(contain
                ? "\n" + contain + " - Array contains value 14"
                : "\n" + contain + " - Array DOES NOT contain value 14");

        System.out.println("\n==========> deleteIndex(3)");
        arr.deleteIndex(3);
        arr.printArray();
        // System.out.println(Arrays.toString(arr.array));

        System.out.println("\n==========> insertValue(55)");
        arr.insertValue(55);
        arr.printArray();
        // System.out.println(Arrays.toString(arr.array));

        System.out.println("\n==========> linearSearchForValue(10)");
        System.out.println("The value was found in the following indexes: "
                + arr.linearSearchForValue(10));

        System.out.println("\n==========> insertionSort()");
        arr.printArray();
        arr.insertionSort();
        arr.printArray();
        // System.out.println(Arrays.toString(arr.array));

        // System.out.println("\n==========> bubbleSort()");
        // arr.printArray();
        // arr.bubbleSort();
        // arr.printArray();
        // System.out.println(Arrays.toString(arr.array));

        // System.out.println("\n==========> selectionSort()");
        // arr.printArray();
        // arr.selectionSort();
        // arr.printArray();
        // System.out.println(Arrays.toString(arr.array));

        System.out.println("\n==========> binarySearchForValue(17)");
        int bSearchIndex = arr.binarySearchForValue(17);
        System.out.println(bSearchIndex == -1
                ? "17 Not found"
                : "Found a match for 17 at index " + bSearchIndex);

    }
    
}
