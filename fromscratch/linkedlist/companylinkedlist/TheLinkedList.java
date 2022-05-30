package fromscratch.linkedlist.companylinkedlist;

/**
 * Implementation from scratch of a company linked list in Java.
 * Class TheLinkedList
 */
public class TheLinkedList {

    // Creating a node
    Node head;

    // Constructor
    TheLinkedList() {
        head = null;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
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

    public void printFromHead(Node head) {
        while (head != null) {
            System.out.println();
            System.out.println("Node key   : " + head.key + " ");
            System.out.println("Node value : " + head.value + " ");
            System.out.println("Node next  : " + head.next + " ");
            head = head.next;
        }
    }

    // Traverse printing each node and its next one.
    public void print() {
        Node currCompany = head;
        while (currCompany != null) {
            System.out.println(currCompany);
            System.out.println("Next Company: " + currCompany.next);
            currCompany = currCompany.next;
            System.out.println();
        }
    }

}

// Traverse printing each node and its next one.
// public void traversePrinting() {
// Book currBook = head;
// while (currBook != null) {
// currBook.print();
// System.out.println("Next Book: " + currBook.next);
// currBook = currBook.next;
// System.out.println();
// }
// }