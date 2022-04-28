package BinarySearchTree;

import java.util.*;

public class BasicBinarySearchTree {

    public static void main (String args[]) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 20 };
        searchFor(array, 6);
    }

    public static int searchFor(int[] array, int number) {
        int arrayLength = array.length;
        int leftIndex = 0;
        int rightIndex = arrayLength - 1;
        int midIndex = arrayLength/2;

        if (leftIndex >= rightIndex) {
            return -1;
        }

        if (array[midIndex] == number) {
            return midIndex;
        } else  if {
            return searchFor(array, number);
        } else {
            return searchFor(array, number);
        }

    }
    
}
