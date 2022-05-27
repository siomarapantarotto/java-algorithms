package fromscratch.linkedlist;

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

    // Method to create a random value for company ID.
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

/**
 * Implementation from scratch of a company linked list in Java.
 * Class 3/3: TheLinkedList
 */
class TheLinkedList {
    // Creating a node
    Node head;

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

    public Node cloneLinkedList(Node head) {
        Node current = head; // used to iterate over the original list
        Node newHead = null; // head of the new clone list
        Node tail = null; // points to each last node added to the new clone list

        while (current != null) {
            // special case for the first new node
            if (newHead == null) {
                newHead = new Node(current.key, current.value);
                tail = newHead;
            } else {
                tail.next = new Node();
                tail = tail.next;
                tail.key = current.key;
                tail.value = current.value;
                tail.next = null;
            }
            current = current.next;
        }

        return newHead;
    }

    public void printLinkedList(TheLinkedList theLinkedList) {
        printFromHead(theLinkedList.head);
    }

    public static void printFromHead(Node head) {
        while (head != null) {
            System.out.println();
            System.out.println("Node key   : " + head.key + " ");
            System.out.println("Node value : " + head.value + " ");
            System.out.println("Node next  : " + head.next + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {

        // Create the original linked list
        TheLinkedList originalCompanyList = new TheLinkedList();

        // Create companies
        Company c1 = new Company("Facebook", "Mark");
        Company c2 = new Company("Apple", "Steve & Others");
        Company c3 = new Company("Google", "Larry & Sergey");
        Company c4 = new Company("Microsoft", "Bill");
        Company c5 = new Company("Tesla", "Elon");

        // Create nodes passing sequential keys and
        // objects as parameters to constructor 1.
        // For study purpose only
        // Node n1 = new Node(1, c1);
        // Node n2 = new Node(2, c2);
        // Node n3 = new Node(3, c3);
        // Node n4 = new Node(4, c4);
        // Node n5 = new Node(5, c5);

        // Create nodes passing just objects as parameters
        // Random keys will be generate by constructor 2.
        Node n1 = new Node(c1);
        Node n2 = new Node(c2);
        Node n3 = new Node(c3);
        Node n4 = new Node(c4);
        Node n5 = new Node(c5);

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

        // Print the linked list receving head as parameter.
        System.out.print("\nPrint Linked List from head:");
        printFromHead(originalCompanyList.head);

        System.out.print("\nPrint Linked List Copy:");
        Node copyHead = originalCompanyList.cloneLinkedList(originalCompanyList.head);
        printFromHead(copyHead);

    }
}