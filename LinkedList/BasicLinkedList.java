package LinkedList;

import java.util.LinkedList;

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

        linkedList.add(3, 33);
        System.out.println(linkedList);

    }

}
