package fromscratch.linkedlist.companylinkedlist;

/**
 * Main driver class for Company Linked List.
 */
public class MainDriver {

    public static void main(String[] args) {

        // Create the original linked list that will be cloned later on.
        TheLinkedList originalCompanyList = new TheLinkedList();

        // Create company objects.
        Company c1 = new Company("Facebook", "Mark Zuckerberg");
        Company c2 = new Company("Apple", "Steve Jobs");
        Company c3 = new Company("Microsoft", "Bil Gates");
        Company c4 = new Company("Tesla", "Elon Musk");

        // Create nodes passing sequential keys and company
        // objects as parameters to Node constructor 1.
        // Use this just to understand how adding to the front and to
        // the tail of the linked list will operate. After understanding,
        // comment this block of code and uncomment the block bellow.
        Node n1 = new Node(1, c1);
        Node n2 = new Node(2, c2);
        Node n3 = new Node(3, c3);
        Node n4 = new Node(4, c4);

        // Create nodes passing just objects as parameters
        // Random keys will be generate by Node constructor 2.
        // Node n1 = new Node(c1);
        // Node n2 = new Node(c2);
        // Node n3 = new Node(c3);
        // Node n4 = new Node(c4);

        // Adding (and removing) to (or from) the front of the linked list will
        // make it operate like a stack (that adds to and removes from the top).
        // The advantage is that there is no need to to traverse the list to add.
        originalCompanyList.addToFront(n1);
        originalCompanyList.addToFront(n2);
        originalCompanyList.addToFront(n3);

        // Adding (and removing) to (or from) the tail of the linked list has
        // aditional cost since the list needs to be traversed before addition.
        originalCompanyList.addToTail(n4);

        // Print the linked list receving a head node as parameter.
        System.out.print("\nPrint original Linked List from head:");
        originalCompanyList.printFromHead(originalCompanyList.head);

        // Print the cloned linked list receving the new head as parameter.
        // There is no need to create a new Linked List. The method to print
        // the new cloned list can be the same from original linked list because
        // it is a method that receives a head node and prints the next ones by
        // traversing the linked list.
        System.out.print("\nPrint cloned Linked List from new head:");
        // The clone happens here, in the bellow line.
        Node newHead = originalCompanyList.cloneLinkedList(originalCompanyList.head);
        originalCompanyList.printFromHead(newHead);
    }

}
