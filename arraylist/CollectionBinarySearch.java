package arraylist;

// Java Program to Demonstrate Working of binarySearch()
// method of Collections class

// Importing required classes
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Main class
public class CollectionBinarySearch {
	// Main driver method
	public static void main(String[] args) {

		// Creating an empty ArrayList of integer type
		List<Integer> arrayList = new ArrayList<Integer>();

		// Populating the ArrayList
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(10);
		arrayList.add(20);

		// 10 is present at index 3
		int key = 10;
		int index = Collections.binarySearch(arrayList, key);

		if (index >= 0)
			System.out.println(key + " found at index = " + index);
		else
			System.out.println(key + " Not found");

		key = 15;
		index = Collections.binarySearch(arrayList, key);

		if (index >= 0)
			System.out.println(key + " found at index = " + index);
		else
			System.out.println(key + " Not found");
	}
}
