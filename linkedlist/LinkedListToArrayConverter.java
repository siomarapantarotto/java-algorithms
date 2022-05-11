package linkedlist;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Convert Linked List to Array
 */
public class LinkedListToArrayConverter {

    public static String[] convertToArray(LinkedList<String> linkedList) {
        String[] array = new String[linkedList.size()];
        int i = 0;
        for (String nodeValue : linkedList) {
            array[i++] = nodeValue;
        }
        return array;
    }

    // Main driver
    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("first");
        linkedList.add("second");
        linkedList.add("third");
        linkedList.add("last");

        String[] array = convertToArray(linkedList);
        System.out.println(Arrays.toString(array));

    }

}