package fromscratch.linkedlist.companylinkedlist;

public class MainDriver {

    // Create the original linked list
    TheLinkedList originalCompanyList = new TheLinkedList();

    public static void main(String[] args) {

        // Create the original linked list
        TheLinkedList originalCompanyList = new TheLinkedList();

        // Create companies
        Company c1 = new Company("Facebook", "Zuckerberg");
        Company c2 = new Company("Apple", "Jobs");
        Company c3 = new Company("Google", "Sergey");
        Company c4 = new Company("Tesla", "Musk");

        // Create nodes passing sequential keys and
        // objects as parameters to constructor 1.
        // For study purpose only
        Node n1 = new Node(1, c1);
        Node n2 = new Node(2, c2);
        Node n3 = new Node(3, c3);
        Node n4 = new Node(4, c4);

        // Create nodes passing just objects as parameters
        // Random keys will be generate by constructor 2.
        // Node n1 = new Node(c1);
        // Node n2 = new Node(c2);
        // Node n3 = new Node(c3);
        // Node n4 = new Node(c4);

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

        // Print the linked list receving head as parameter.
        System.out.print("\nPrint original Linked List from head:");
        originalCompanyList.printFromHead(originalCompanyList.head);

        // Print the cloned linked list receving the new head as parameter.
        // There is no need to create a new Linked List.
        // The method to print the new cloned list can be the same from original
        // linked list because it is a method that receives a node and prints
        // by traversing the nodes that follows the new head.
        System.out.print("\nPrint cloned Linked List from new head:");
        Node copyHead = originalCompanyList.cloneLinkedList(originalCompanyList.head);
        originalCompanyList.printFromHead(copyHead);
    }

}
