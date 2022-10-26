package fromscratch.linkedlist.clone;

import java.util.Random;

/**
 * Implementation from scratch of a company linked list in Java.
 * Class 1/3: Company
 */
class Company {
    int id;
    String name;
    String ownerName;

    // Company constructor.
    Company(String companyName, String companyOwnerName) {
        this.id = generateRandomId();
        this.name = companyName;
        this.ownerName = companyOwnerName;
    }

    // Method to generate a random value for company ID.
    static int generateRandomId() {
        Random random = new Random();
        return random.nextInt(1000000);
    }

    // Method to display company in a formatted way.
    @Override
    public String toString() {
        return "[" + id + ", " + name + ", " + ownerName + "]";
    }
}

/**
 * Implementation from scratch of a company linked list in Java.
 * Class 2/3: Node
 */
class Node {
    int key;
    Object value;
    Node next;
    Node random;

    /**
     * Node Constructor 1
     * Receives two parameters: key and object.
     * 
     * @param keyParameter
     * @param objectParameter
     */
    Node(int keyParameter, Object objectParameter) {
        this.key = keyParameter;
        this.value = objectParameter;
        random = null;
        next = null;
    }

    /**
     * Node constructor 3
     * No argument constructor
     */
    Node() {
    }

    // Method to create a random value for the node key.
    static int generateRandomKey() {
        Random random = new Random();
        return random.nextInt(5);
    }
}

/**
 * Implementation from scratch of a company linked list in Java.
 * Class 3/3: TheLinkedList
 */
class TheLinkedList {
    // Create the head node
    Node head;

    // Constructor
    TheLinkedList() {
        head = null;
    }

    /**
     * Adding (and removing) to (or from) the front the linked list
     * will act as a stack that adds to and removes from the top.
     * The advantage is that there will be no need to to traverse
     * the list to add new nodes.
     * 
     * @param node
     */

    public void addToFront(Node node) {
        if (head == null) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
    }

    /**
     * Adding (and removing) to (or from) the tail the
     * linked list need to be traversed before addition
     * or (removal).
     * 
     * @param node
     */
    public void addToTail(Node node) {
        if (head == null) {
            head = node;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = node;
        }
    }

    /**
     * Clone the linked List receiving a node head as parameter
     * 
     * @param head
     * @return newHead node
     */
    public Node cloneLinkedList(Node head) {
        Node current = head; // current iterates over the original list
        Node newHead = null; // head of the new clone list
        Node tail = null; // points to each last node added to the new clone list

        while (current != null) {
            // handles the first new added node (head is also tail)
            if (newHead == null) {
                newHead = new Node(current.key, current.value);
                tail = newHead; // for the first added node head is also tail
            } else { // each new node added will be tail for a while
                tail.next = new Node();
                tail = tail.next;
                tail.key = current.key;
                tail.value = current.value;
                tail.random = current.random;
                tail.next = null;
            }
            current = current.next;
        }
        return newHead;
    }

    // public void printLinkedList(TheLinkedList theLinkedList) {
    // printFromHead(theLinkedList.head);
    // }

    public static void printFromHead(Node head) {
        while (head != null) {
            System.out.println();
            System.out.println("Node key   : " + head.key + " ");
            System.out.println("Node value : " + head.value + " ");
            System.out.println("Node next  : " + head.next + " ");
            System.out.println("Node random: " + head.random + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {

        // Create the original linked list
        TheLinkedList originalCompanyList = new TheLinkedList();

        // Create companies
        Company c1 = new Company("Facebook", "Mark Zucker");
        Company c2 = new Company("Apple", "Steve Jobs");
        Company c3 = new Company("Google", "Larry Sergey");
        Company c4 = new Company("Tesla", "Elon Musk");
        Company c5 = new Company("Oracle", "Larry Ellison");
        Company c6 = new Company("Microsoft", "Bill Gates");

        // Create nodes passing sequential keys and
        // objects as parameters to constructor 1.
        // For study purpose only
        Node n1 = new Node(1, c1);
        Node n2 = new Node(2, c2);
        Node n3 = new Node(3, c3);
        Node n4 = new Node(4, c4);
        Node n5 = new Node(3, c5);
        Node n6 = new Node(4, c6);

        // Adding (and removing) to (or from) the front the
        // linked list will act as a stack that adds to and
        // removes from the top. The advantage is that there
        // will be no need to to traverse the list to add.
        originalCompanyList.addToFront(n1);
        originalCompanyList.addToFront(n2);
        originalCompanyList.addToFront(n3);

        // Adding (and removing) to (or from) the tail the
        // linked list need to be traversed before addition.
        originalCompanyList.addToTail(n4);
        originalCompanyList.addToTail(n5);
        originalCompanyList.addToTail(n6);

        // Print the linked list receving head as parameter.
        System.out.print("\nPrint original Linked List from head:");
        printFromHead(originalCompanyList.head);

        System.out.print("\nPrint cloned Linked List from new head:");
        Node copyHead = originalCompanyList.cloneLinkedList(originalCompanyList.head);
        printFromHead(copyHead);

    }
}