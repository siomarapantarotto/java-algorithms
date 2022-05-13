package fromscratch.booklinkedlist;

public class BookLinkedList {

    // One attribute for head node.
    public Book head;

    // Constructor enforcing an empty linked list.
    public BookLinkedList() {
        head = null; // head is alredy created as null but.....
    }

    // Check if linked list is empty or not.
    public boolean isEmpty() {
        return (head == null);
    }

    // Add new node at the beginning of the Linked List
    public void addFirst(String bookName, int totalSold) {
        Book newBook = new Book(bookName, totalSold);
        newBook.next = head;
        head = newBook;
    }

    public Book removeFirst() {
        Book bookRef = head;
        if (!isEmpty()) {
            head = head.next;
        } else {
            System.out.println("Book Linked List is empty.");
        }
        return bookRef;
    }

    public Book removeBook(String bookName) {
        Book currentBook = head;
        Book previousBook = head;
        while (currentBook.name != bookName) {
            if (currentBook.next == null) {
                return null;
            } else {
                previousBook = currentBook;
                currentBook = currentBook.next;
            }
        }
        if (currentBook == head) {
            head = head.next;
        } else {
            previousBook.next = currentBook.next;
        }
        return currentBook;
    }

    // Traverse printing each node and its next one.
    public void traversePrinting() {
        Book currBook = head;
        while (currBook != null) {
            currBook.print();
            System.out.println("Next Book: " + currBook.next);
            currBook = currBook.next;
            System.out.println();
        }
    }

    // Traverse finding node by value (book name)
    public Book find(String bookName) {
        Book currBook = head;
        if (!isEmpty()) {
            while (currBook.name != bookName) {
                if (currBook.next == null) {
                    return null;
                } else {
                    currBook = currBook.next;
                }
            }
        } else {
            System.out.println("Empty Booked List");
        }
        return currBook;
    }

}
