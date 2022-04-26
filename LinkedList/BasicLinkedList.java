package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * The LinkedList class implements the List interface
 * as well as the Deque interface.
 * Sintax: LinkedList<?> linkedListName = new LinkedList<?>();
 */
public class BasicLinkedList {

    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();

        // Print empty LinkedList.
        System.out.println(linkedList);

        // Add elements
        linkedList.add(5);
        linkedList.add(10);
        linkedList.add(15);
        linkedList.add(20);
        System.out.println(linkedList);

        // Add in the first position
        linkedList.addFirst(1);
        System.out.println(linkedList);

        // Add in the last position
        linkedList.addLast(50);
        System.out.println(linkedList);

        linkedList.remove();
        System.out.println("Just an empty 'remove()' " + linkedList);

        System.out.println("Lisked List size is " + linkedList.size());

        // Add in the midle
        linkedList.add(3, 33);
        System.out.println(linkedList);

        System.out.println(linkedList.contains(33)
                ? "Linked List contains 33"
                : "Linked List does not contain 33");

        System.out.println(linkedList.contains(44)
                ? "Linked List contains 44"
                : "Linked List does not contain 44");

        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println(linkedList);

        Iterator<?> iterator = linkedList.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            //if ((int) iterator.next() == 20) {
            //    System.out.println("Found node with value 20");
            //}
            System.out.println("The element is: " + linkedList.get(i));
            System.out.println(((int) iterator.next() == 20)
                ? "This node has value 20"
                : "This node has not value 20");
                i++;
        }

    }

}
