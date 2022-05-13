package fromscratch.booklinkedlist;

public class BookLinkedListMainDriver {

    public static void main(String[] args) {

        System.out.println("\nCreate new linked list of books");
        BookLinkedList bookLkList = new BookLinkedList();
        System.out.println("Create is complete");
        System.out.println();

        System.out.println("Traverse and print linked list:");
        bookLkList.traversePrinting();
        System.out.println();

        System.out.println("addFirst() - Adding nodes AT THE BEGINNING of the linked list");
        bookLkList.addFirst("1 The Godfather", 100);
        bookLkList.addFirst("2 The Wizard of Oz", 200);
        bookLkList.addFirst("3 The Devil Wears Prada", 300);
        bookLkList.addFirst("4 Doctor Zhivago ", 400);
        bookLkList.addFirst("5 Harry Potter", 500);

        System.out.println("AddFirst() is complete");
        System.out.println();

        System.out.println("Traverse and print linked list:");
        bookLkList.traversePrinting();
        System.out.println();

        System.out.println("removeFirst() - Remove node FROM THE BEGINNING of the linked list");
        bookLkList.removeFirst();
        System.out.println("removeFirst() is complete");
        System.out.println();

        System.out.println("Traverse and print linked list:");
        bookLkList.traversePrinting();
        System.out.println();

        System.out.println("find(bookName) - Find node with book name '3 The Devil Wears Prada'");
        Book book = bookLkList.find("3 The Devil Wears Prada");
        System.out.println(book == null
                ? "No such book in the linked list"
                : book.name + " was found and total sold is " + book.totalSold);
        System.out.println();

        System.out.println("find(bookName) - Find node with book name 'The Lord of the Rings' that does not exist");
        Book book2 = bookLkList.find("The Lord of the Rings");
        System.out.println(book2 == null
                ? "No such book in the linked list"
                : book.name + " was found and total sold is " + book.totalSold);
        System.out.println();

        System.out.println("removeBook(bookName) - Remove node with book name '2 The Wizard of Oz'");
        bookLkList.removeBook("2 The Wizard of Oz");
        System.out.println("removeBook(bookName) is complete.");
        System.out.println();

        System.out.println("Traverse and print linked list:");
        bookLkList.traversePrinting();
        System.out.println();

        System.out.println("removeBook(bookName) - Remove node with book name 'Two Cities' that does not exist");
        bookLkList.removeBook("Two Cities");
        System.out.println("removeBook(bookName) is complete.");
        System.out.println();

        System.out.println("Traverse and print linked list:");
        bookLkList.traversePrinting();
        System.out.println();

        System.out.println("clear() linked list");
        bookLkList.clear();
        System.out.println("clear() is complete");
        System.out.println();

        System.out.println("Traverse and print linked list:");
        bookLkList.traversePrinting();
        System.out.println();

    }

}
