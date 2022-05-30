package fromscratch.linkedlist.booklinkedlist;

public class BookLinkedList {

    // Set head node
    public Book head;

    // Constructor enforcing an empty linked list
    public BookLinkedList() {
        head = null; // not really necessary but it's not gonna hurt
    }

    // Check if linked list is empty or not
    public boolean isEmpty() {
        return (head == null);
    }

    // Clear linked list
    public void clear() {
        while (!isEmpty()) {
            removeFirst();
        }
    }

    // Add new node at the beginning of the Linked List
    public void addFirst(String bookName, int totalSold) {
        Book newBook = new Book(bookName, totalSold);
        newBook.next = head;
        head = newBook;
    }

    // Add new node at the end of the Linked List
    public void addLast(String bookName, int totalSold) {
        if (isEmpty()) {
            addFirst(bookName, totalSold);
        } else {
            Book newBook = new Book(bookName, totalSold);
            Book currBook = head;
            while (currBook != null) {
                if (currBook.next == null) {
                    currBook.next = newBook;
                    break;
                } else {
                    currBook = currBook.next;
                }
            }
        }
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
        Book currBook = head;
        Book prevBook = head;
        while (currBook.name != bookName) {
            if (currBook.next == null) {
                return null;
            } else {
                prevBook = currBook;
                currBook = currBook.next;
            }
        }
        if (currBook == head) {
            head = head.next;
        } else {
            prevBook.next = currBook.next;
        }
        return currBook;
    }

    // Traverse printing each node and its next one.
    public void traversePrinting() {
        Book currBook = head;
        while (currBook != null) {
            currBook.print();
            System.out.println("Next Book: " + currBook.next);
            currBook = currBook.next;
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
            System.out.println("The book linked List is empty");
        }
        return currBook;
    }

}
