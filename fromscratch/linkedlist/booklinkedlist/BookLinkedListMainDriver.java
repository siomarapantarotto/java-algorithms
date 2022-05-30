package fromscratch.linkedlist.booklinkedlist;

public class BookLinkedListMainDriver {

    public static void main(String[] args) {

        System.out.println("\n1) Create a new linked list of books.");
        BookLinkedList bookLkList = new BookLinkedList();
        bookLkList.traversePrinting();

        System.out.println("\n2) Add nodes AT THE BEGINNING of the linked list:");
        bookLkList.addFirst("1 The Godfather", 100);
        bookLkList.addFirst("2 The Wizard of Oz", 200);
        bookLkList.addFirst("3 The Devil Wears Prada", 300);
        bookLkList.addFirst("4 Doctor Zhivago ", 400);
        bookLkList.addFirst("5 Harry Potter", 500);
        bookLkList.traversePrinting();

        System.out.println("\n3) Remove node FROM THE BEGINNING of the linked list:");
        bookLkList.removeFirst();
        bookLkList.traversePrinting();

        System.out.println("\n4) Find node with book name '3 The Devil Wears Prada':");
        Book book = bookLkList.find("3 The Devil Wears Prada");
        System.out.println(book == null
                ? "No such book in the linked list"
                : book.name + " was found and total sold is " + book.totalSold);

        System.out.println("\n5) Find node with book name 'The Lord of the Rings' that does not exist:");
        Book book2 = bookLkList.find("The Lord of the Rings");
        System.out.println(book2 == null
                ? "No such book in the linked list"
                : book.name + " was found and total sold is " + book.totalSold);

        System.out.println("\n6) Remove node with book name '2 The Wizard of Oz':");
        bookLkList.removeBook("2 The Wizard of Oz");
        bookLkList.traversePrinting();

        System.out.println("\n7) Remove node with book name 'Two Cities' that does not exist:");
        bookLkList.removeBook("Two Cities");
        bookLkList.traversePrinting();

        System.out.println("\n8) Add node AT THE END of the linked list:");
        bookLkList.addLast("6 The Lord of the Rings", 600);
        bookLkList.traversePrinting();

        System.out.println("\n9) Clear linked list:");
        bookLkList.clear();
        bookLkList.traversePrinting();

        System.out.println("\n10) Add node AT THE END of the linked list:");
        bookLkList.addLast("7 The Last One After Clear", 700);
        bookLkList.traversePrinting();

        System.out.println("\n11) Add nodes AT THE END of the linked list:");
        bookLkList.addLast("8 The Book number 8", 800);
        bookLkList.addLast("9 The Book number 9", 900);
        bookLkList.addLast("10 The Book number 10", 1000);
        bookLkList.traversePrinting();

    }

}
