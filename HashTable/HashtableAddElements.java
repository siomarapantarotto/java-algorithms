package Hashtable;

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

		ht2.put(4, "four");
		ht2.put(5, "five");
		ht2.put(6, "six");

		// Print mappings to the console
		System.out.println("Mappings of ht1 single Generics : " + ht1);
		System.out.println("Mappings of ht2 using Generics  : " + ht2);

		System.out.println(ht1.containsKey(1)
				? "HT1 contains key : " + 1
				: "HT1 Does noy contain key : " + 1);
		System.out.println(ht1.containsKey(7)
				? "HT1 contains key : " + 7
				: "HT1 does not contain key : " + 7);

		System.out.println(ht1.contains("one")
				? "HT1 contains value : one"
				: "HT1 Does not contain value : one");
		System.out.println(ht1.contains("seven")
				? "HT1 contains value : seven"
				: "HT1 does not contain value : seven");

		System.out.println("HT2 get key 1 : " + ht2.get(1));

		System.out.println("HT2 hashCode() : " + ht2.hashCode());

		

	}
}
