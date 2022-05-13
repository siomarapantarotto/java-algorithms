package fromscratch.booklinkedlist;

public class BookLinkedListMainDriver {

    public static void main(String[] args) {

        System.out.println("\nCreating a new linked list of books...");
        BookLinkedList bookLkList = new BookLinkedList();
        System.out.println("Creation is complete.");
        System.out.println();

        System.out.println("Traverse and print linked list:");
        bookLkList.traversePrinting();
        System.out.println();

        System.out.println("Addind 4 nodes AT THE BEGINNING of the linked list...");
        bookLkList.addFirst("1 Don Quixote", 500);
        bookLkList.addFirst("2 A Tale of Two Cities", 200);
        bookLkList.addFirst("3 The Lord of the Rings", 150);
        bookLkList.addFirst("4 Harry Potter and the Sorcere's Stone", 107);
        System.out.println("Addition is complete.");
        System.out.println();

        System.out.println("Traverse and print linked list:");
        bookLkList.traversePrinting();
        System.out.println();

        System.out.println("Removing node FROM THE BEGINNING (head)...");
        bookLkList.removeFirst();
        System.out.println("Removal is complete.");
        System.out.println();

        System.out.println("Traverse and print linked list:");
        bookLkList.traversePrinting();
        System.out.println();

        System.out.println("Finding node with book name '3 The Lord of the Rings'");
        Book book = bookLkList.find("3 The Lord of the Rings");
        System.out.println(book == null
                ? "No such book in the linked list"
                : book.name + " was found and total sold is " + book.totalSold);
        System.out.println();

        System.out.println("Finding node with book name 'The Rings' that does not exist...");
        Book book2 = bookLkList.find("The Rings");
        System.out.println(book2 == null
                ? "No such book in the linked list"
                : book.name + " was found and total sold is " + book.totalSold);
        System.out.println();

        System.out.println("Removing node with book name '2 A Tale of Two Cities'");
        bookLkList.removeBook("2 A Tale of Two Cities");
        System.out.println("Removal is complete.");
        System.out.println();

        System.out.println("Traverse and print linked list:");
        bookLkList.traversePrinting();
        System.out.println();

        System.out.println("Removing node with book name 'Two Cities' that does not exist");
        bookLkList.removeBook("Two Cities");
        System.out.println("Removal is complete.");
        System.out.println();

        System.out.println("Traverse and print linked list:");
        bookLkList.traversePrinting();
        System.out.println();

        System.out.println("Clear linked list:");
        bookLkList.clear();
        System.out.println("Clear is complete.");
        System.out.println();

        System.out.println("Traverse and print linked list:");
        bookLkList.traversePrinting();
        System.out.println();

    }

}
