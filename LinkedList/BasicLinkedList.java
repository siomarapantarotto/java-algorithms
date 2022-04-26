package LinkedList;

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

        linkedList.add(5);
        linkedList.add(10);
        linkedList.add(15);
        linkedList.add(20);
        System.out.println(linkedList);

        linkedList.addFirst(1);
        System.out.println(linkedList);

        linkedList.addLast(50);
        System.out.println(linkedList);

        linkedList.remove();
        System.out.println("Just an empty 'remove()' " + linkedList);

        System.out.println("Lisked List size is " + linkedList.size());

        linkedList.add(3, 33);
        System.out.println(linkedList);

        System.out.println(linkedList.contains(33)
                ? "Linked List contains 33"
                : "Linked List does not contain 33");

        System.out.println(linkedList.contains(44)
                ? "Linked List contains 44"
                : "Linked List does not contain 44");

    }

}
