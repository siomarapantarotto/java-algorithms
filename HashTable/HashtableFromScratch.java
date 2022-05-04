package hashtable;

import java.util.Arrays;
/**
 * by siomara.com.br on May, 21 of 2022
 */
public class HashtableFromScratch {
    
    String[] array;
    //int arraySize;
    
    public static void main(String[] args) {
        HashtableFromScratch simpleHashtable = new HashtableFromScratch(20);
        
        // Create and print empty array hash table before hashing
        System.out.println("\nEmpty array hash table:");
        System.out.println(Arrays.toString(simpleHashtable.array));
        
        // Do not pass duplicate values as elements to be added
        String[] elementsToAdd = { "1", "3", "5", "6", "9", "12", "15", "17", "19" };

        // Call hash function that will place each element in its index position
        simpleHashtable.hashFunction(elementsToAdd, simpleHashtable.array);
        
        // Print filled array hash table after hashing
        System.out.println("\nFilled array hash table:");
        System.out.println(Arrays.toString(simpleHashtable.array));
    }

    // Constructor
    // Simulate an empty array hash table with [] in all positions 
    HashtableFromScratch(int arraySize) {
        this.array = new String[arraySize];
        Arrays.fill(this.array, "[]");
    }

    // Hash Function that puts values in the same index that matches their value
    public void hashFunction(String[] elementsToAdd, String[] array) {
        for (int n = 0; n < elementsToAdd.length; n++) {
            int hash = n + 1 - 1;
            String newElementVal = elementsToAdd[hash];
            array[Integer.parseInt(newElementVal)] = "[" + newElementVal + "]";
        }
    }
}

