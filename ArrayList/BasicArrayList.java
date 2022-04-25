package ArrayList;

// All classes and interfaces of Java collection
// framework are bundled into the java.util package.
import java.util.*;

// The ArrayList class implements the List interface.
// Syntax:  ArrayList<?> arrayListName = new ArrayList<?>();
//          ArrayList<?> arrayListName = new ArrayList<>();
public class BasicArrayList {

    // main method
    public static void main(String[] args) {

        // Instantiate an ArrayList of Integer.
        // Integer is a wrapper class for the basic datatype int.
        ArrayList<Integer> intArrayList = new ArrayList<>();

        // Add elements using add() method.
        intArrayList.add(10);
        intArrayList.add(15);
        intArrayList.add(20);
        intArrayList.add(25);
        intArrayList.add(30);
        intArrayList.add(33);

        // Print the ArrayList on the console.
        System.out.println(intArrayList);

        // Print the ArrayList size on the console.
        System.out.println("The ArrayList size is " + intArrayList.size());

        // Remove elements at index 1 and 4
        System.out.println("Removing element at index 1: " + intArrayList.get(1));
        intArrayList.remove(1);
        System.out.println(intArrayList);
        System.out.println("Removing element at index 4: " + intArrayList.get(4));
        intArrayList.remove(4);

        // Print the ArrayList on the console
        System.out.println(intArrayList);

        // Check if intArr contains the element 15
        System.out.println(intArrayList.contains(15)
                ? "The ArrayList contains 25"
                : "The ArrayList does not contain 15");

        // Check if intArr contains the element 30
        System.out.println(intArrayList.contains(30)
                ? "The ArrayList contains 30"
                : "The ArrayList does not contain 30");

        // Use get method to get the element at index 1
        int elementAt1 = intArrayList.get(1);
        System.out.println("The Element at index 1 now is " + elementAt1);

        // Print the ArrayList size on the console.
        System.out.println("The ArrayList size now is " + intArrayList.size());

    }

}
