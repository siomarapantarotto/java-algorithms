package challenge;

public class CloneLinkListWithRandomNode {

    // Structure of linked list Node
    static class Node {
        int data;
        Node next;
        Node random;

        Node(int x) {
            data = x;
            next = null;
            random = null;
        }
    }

    // Utility function to print the list.
    static void print(Node head) {
        Node current = head;
        while (current != null) {
            System.out.println("Data = " + current.data
                    + ", Random = "
                    + current.random.data);
            current = current.next;
        }
    }

    // This function clones a given linked list in O(1) space
    static Node clone(Node head) {
        Node current = head;
        Node temp = null;

        // insert additional node after
        // every node of original list
        while (current != null) {
            temp = current.next;

            // Inserting node
            current.next = new Node(current.data);
            current.next.next = temp;
            current = temp;
        }
        current = head;

        // adjust the random pointers of the newly added nodes
        while (current != null) {
            if (current.next != null)
                current.next.random = (current.random != null)
                        ? current.random.next
                        : current.random;

            // move to the next newly added node by skipping an original node
            current = current.next.next;
        }

        Node original = head;
        Node copy = head.next;

        // save the start of copied linked list
        temp = copy;

        // now separate the original list and copied list
        while (original != null) {
            original.next = original.next.next;

            copy.next = (copy.next != null) ? copy.next.next
                    : copy.next;
            original = original.next;
            copy = copy.next;
        }
        return temp;
    }

    // Driver code
    public static void main(String[] args) {
        Node start = new Node(1);
        start.next = new Node(2);
        start.next.next = new Node(3);
        start.next.next.next = new Node(4);
        start.next.next.next.next = new Node(5);

        // 1's random points to 3
        start.random = start.next.next;

        // 2's random points to 1
        start.next.random = start;

        // 3's and 4's random points to 5
        start.next.next.random = start.next.next.next.next;
        start.next.next.next.random = start.next.next.next.next;

        // 5's random points to 2
        start.next.next.next.next.random = start.next;

        System.out.println("Original list : ");
        print(start);

        System.out.println("Cloned list : ");
        Node cloned_list = clone(start);
        print(cloned_list);
    }
}

/**
 * Difficulty Level : Hard
 * 
 * Given a linked list having two pointers in each node.
 * The first one points to the next node of the list,
 * however, the other pointer is random and can point
 * to any node of the list. Write a program that clones
 * the given list in O(1) space, without any extra space.
 * 
 * by Ashutosh Kumar 😀
 */
