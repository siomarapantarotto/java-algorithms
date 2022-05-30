package fromscratch.linkedlist.companylinkedlist;

import java.util.Random;;

/**
 * Implementation from scratch of a company linked list in Java.
 * Class Node
 * 
 * @author siomara.com.br
 * @since May, 2022
 */
public class Node {
    int key;
    Object value;
    Node next;

    /**
     * This constructor receives a key and an object as parameters.
     * 
     * @param keyParameter
     * @param objectParameter
     */
    Node(int keyParameter, Object objectParameter) {
        this.key = keyParameter;
        this.value = objectParameter;
        next = null;
    }

    Node() {
    }

    /**
     * This constructor receives just an object as parameter.
     * The node key will be randomly generated.
     * 
     * @param objectParameter
     */
    Node(Object objectParameter) {
        this.key = generateRandomKey();
        this.value = objectParameter;
        next = null;
    }

    // Method to create random value for company ID.
    static int generateRandomKey() {
        Random random = new Random();
        return random.nextInt(1000000);
    }
}
