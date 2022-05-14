package array;

public class DataStructureArray {

    // create attribute array with 50 boxes
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
            // System.out.println("| " + i + " | " + array[i] + " |");
            System.out.print("| " + i + " | ");
            System.out.println(array[i] + " |");
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

    // main driver method
    public static void main(String[] args) {

        DataStructureArray arr = new DataStructureArray();

        arr.generateRandomArray();

        arr.printArray();

        int valueAtIndex = arr.getValueAtIndex(9);
        System.out.println(valueAtIndex == -1
                ? "Index out of bounds"
                : "The value at index 9 is: " + valueAtIndex);

        boolean contain = arr.containsValue(14);
        System.out.println(contain
                ? contain + " - Array contains value 14"
                : contain + " - Array DOES NOT contain value 14");

        System.out.println("\n====> deleteIndex(3)");
        arr.deleteIndex(3);
        arr.printArray();

        System.out.println("\n====> insertValue(55)");
        arr.insertValue(55);
        arr.printArray();

        System.out.println("\n====> linearSearchForValue(10)");
        System.out.println("The value was found in the following indexes: " + arr.linearSearchForValue(10));

    }

}
