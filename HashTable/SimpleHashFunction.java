package HashTable;

import java.util.Arrays;

public class SimpleHashFunction {
    
    String[] hashTable;
    int arraySize;
    
    public static void main(String[] args) {
        SimpleHashFunction simpleHashFunction = new SimpleHashFunction(20);
        
        System.out.println("\nEmpty Hash Table:");
        System.out.println(Arrays.toString(simpleHashFunction.hashTable));
        
        String[] elementsToAdd = { "1", "3", "5", "6", "9", "12", "15", "17", "19" };
        simpleHashFunction.hashFunction(elementsToAdd, simpleHashFunction.hashTable);
        
        System.out.println("\nFilled Hash Table:");
        System.out.println(Arrays.toString(simpleHashFunction.hashTable));
    }

    // Constructor
    // Create this.array with [] in all positions 
    SimpleHashFunction(int arrSize) {
        this.arraySize = arrSize;
        this.hashTable = new String[arrSize];
        Arrays.fill(this.hashTable, "[]");
    }

    // Hash Function that puts values in the same index that matches their value
    public void hashFunction(String[] elementsToAdd, String[] theArray) {
        for (int n = 0; n < elementsToAdd.length; n++) {
            String newElementVal = elementsToAdd[n];
            theArray[Integer.parseInt(newElementVal)] = "[" + newElementVal + "]";
        }
    }
}

