package linkedlist;

import java.util.LinkedList;
import org.junit.Test;

/**
 * Convert Linked List to Array
 */
public class LinkedListToArrayConverter2 {

    // TDD - Test Driven Development
    @Test
    public void test() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("first");
        linkedList.add("second");
        linkedList.add("third");
        linkedList.add("last");

        String[] array = convertToArray(linkedList);
        assert 4 == array.length;
        assert "first" == array[0];
        assert "second" == array[1];
        assert "third" == array[2];
        assert "last" == array[3];
    }

    String[] convertToArray(LinkedList<String> linkedList) {

        String[] array = new String[linkedList.size()];

        int i = 0;
        for (String nodeValue : linkedList) {
            array[i++] = nodeValue;
        }

        return array;
    }

}