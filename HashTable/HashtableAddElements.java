package hashtable;

// Java program to demonstrate
// adding elements to Hashtable

import java.io.*;
import java.util.*;

class HashtableAddElements {
	public static void main(String args[]) {
		// No need to mention the Generic type twice
		Hashtable<Integer, String> ht1 = new Hashtable<>();

		// Initialization of a Hashtable using Generics
		Hashtable<Integer, String> ht2 = new Hashtable<Integer, String>();

		// Inserting the Elements using put() method
		ht1.put(1, "one");
		ht1.put(2, "two");
		ht1.put(3, "three");
		ht1.put(4, "four");

		ht2.put(4, "four");
		ht2.put(5, "five");
		ht2.put(6, "six");
		ht2.put(7, "seven");


		// Print mappings to the console
		System.out.println("Mappings of ht1 single Generics : " + ht1);
		System.out.println("Mappings of ht2 using Generics  : " + ht2);

		// Check if hashtable contains key
		System.out.println(ht1.containsKey(1)
				? "HT1 contains key : " + 1
				: "HT1 Does noy contain key : " + 1);
		System.out.println(ht1.containsKey(7)
				? "HT1 contains key : " + 7
				: "HT1 does not contain key : " + 7);

		// Check if hashtable contains key/values
		System.out.println(ht1.contains("one")
				? "HT1 contains value : one"
				: "HT1 Does not contain value : one");
		System.out.println(ht1.contains("seven")
				? "HT1 contains value : seven"
				: "HT1 does not contain value : seven");

		// Get key of an element
		System.out.println("HT2 get key 1 : " + ht2.get(1));
		System.out.println("HT2 get key 6 : " + ht2.get(6));

		// Get hash code 
		System.out.println("HT1 hashCode() : " + ht1.hashCode());
		System.out.println("HT2 hashCode() : " + ht2.hashCode());

		// Check hastables equality
		boolean isequal = ht1.equals(ht2);
		System.out.println("Are two tables equal : "+isequal); 

		

	}
}
