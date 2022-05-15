package fromscratch.array;

public class DataStructureArray {

    // create attribute array with 50 boxes
    // private int[] array = new int[] { 100, 99, 98, 97, 96, 95, 94, 93, 92, 91, 90
    // } // array used to fix bubble sort;
    private int[] array = new int[50];

    // store array size to avoid printing the default values
    private int arraySize = 10;

    // generate double random values to array casting to int
    public void generateRandomArray() {
        for (int i = 0; i < arraySize; i++) {
            array[i] = (int) (Math.random() * 10) + 10;
        }
    }

    // print array content
    public void printArray() {
        System.out.println("----------");
        for (int i = 0; i < arraySize; i++) {
            System.out.println("| " + i + " | " + array[i] + " |");
            System.out.println("----------");
        }
    }

    // return value stored in a specific index
    public int getValueAtIndex(int index) {
        if (index < arraySize)
            return array[index];
        else
            return -1;
    }

    // check if array contains a certain value
    public boolean containsValue(int searchValue) {
        boolean valueInArray = false;
        for (int i = 0; i < arraySize; i++) {
            if (array[i] == searchValue)
                valueInArray = true;
        }
        return valueInArray;
    }

    // perfom linear search for a specific value
    // slower but retrieves all indexes with the search value
    // the array does not need to be sorted to run this method
    public String linearSearchForValue(int value) {
        boolean valueInArray = false;
        String indexWithValue = "";
        for (int i = 0; i < arraySize; i++) {
            if (array[i] == value) {
                valueInArray = true;
                indexWithValue += i + "  ";
            }
        }
        if (valueInArray == true)
            return indexWithValue;
        else
            return "none";
    }

    // perfom binary search for a specific value
    // faster but retrieves just first index with the search value
    // the array must be sorted before running this method
    public int binarySearchForValue(int value) {
        int start = 0;
        int end = arraySize - 1;
        while (start <= end) {
            int mid = (end + start) / 2;
            System.out.println(mid);

            if (value == array[mid]) {
                System.out.println(mid + " - " + array[mid]);
                return mid;
            }

            if (value < array[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return -1;
    }

    // add an new index/element into array
    public void insertValue(int value) {
        if (arraySize < 50) {
            array[arraySize] = value;
            arraySize++;
        }
    }

    // delete an exinting index/element from array
    public void deleteIndex(int index) {
        if (index < arraySize) {
            for (int i = index; i < arraySize - 1; i++) {
                array[i] = array[i + 1];
            }
            arraySize--;
        }
    }

    // bubble sort the array
    public void bubbleSort() {
        int i, j; // , temp;
        for (i = arraySize - 1; i > 0; i--) {
            for (j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    swap(j, j + 1);
                }
            }
        }
    }

    // bubble sort the array
    public void selectionSort() {
        for (int x = 0; x < arraySize; x++) {
            int minimum = x;
            for (int j = x + 1; j < arraySize; j++) {
                if (array[minimum] > array[j]) {
                    minimum = j;
                }
            }
            swap(x, minimum);
        }
    }

    public void swap(int indexOne, int indexTwo) {
        int temp = array[indexOne];
        array[indexOne] = array[indexTwo];
        array[indexTwo] = temp;
    }

    // main driver method
    public static void main(String[] args) {

        DataStructureArray arr = new DataStructureArray();

        arr.generateRandomArray();

        arr.printArray();

        int valueAtIndex = arr.getValueAtIndex(9);
        System.out.println(valueAtIndex == -1
                ? "\nIndex out of bounds"
                : "\nThe value at index 9 is: " + valueAtIndex);

        boolean contain = arr.containsValue(14);
        System.out.println(contain
                ? "\n" + contain + " - Array contains value 14"
                : "\ncls" + contain + " - Array DOES NOT contain value 14");

        System.out.println("\n====> deleteIndex(3)");
        arr.deleteIndex(3);
        arr.printArray();

        System.out.println("\n====> insertValue(55)");
        arr.insertValue(55);
        arr.printArray();

        System.out.println("\n====> linearSearchForValue(10)");
        System.out.println("The value was found in the following indexes: " + arr.linearSearchForValue(10));

        System.out.println("\n====> bubbleSort()");
        arr.bubbleSort();
        arr.printArray();

        // System.out.println("\n====> selectionSort()");
        // arr.selectionSort();
        // arr.printArray();

        int bSearchIndex = arr.binarySearchForValue(17);
        System.out.println(bSearchIndex == -1
                ? "17 Not found"
                : "Found a match for 17 at index " + bSearchIndex);

    }

}
