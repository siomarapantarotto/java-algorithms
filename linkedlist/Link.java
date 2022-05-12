package linkedlist;

public class Link {

    public String bookName;
    public int millionSold;
    public Link next;

    public Link(String bookName, int millionSold) {
        this.bookName = bookName;
        this.millionSold = millionSold;
    }

    public void display() {
        System.out.println(bookName + ": " + millionSold + ",000,000");
    }

    public String toString() {
        return bookName;
    }

    public static void main(String[] args) {

        LinkList theLinkedList = new LinkList();
        theLinkedList.insertFirstLink("1 Don Quixote", 500);
        theLinkedList.insertFirstLink("2 A Tale of Two Cities", 200);
        theLinkedList.insertFirstLink("3 The Lord of the Rings", 150);
        theLinkedList.insertFirstLink("4 Harry Potter and the Sorcere's Stone", 107);

        theLinkedList.traverse();

        theLinkedList.removeFirstLink();

        theLinkedList.traverse();

        System.out.println(theLinkedList.find("3 The Lord of the Rings").bookName + " was found");

        theLinkedList.removeLink("2 A Tale of Two Cities");

        theLinkedList.traverse();
    }
}

class LinkList {

    public Link firstLink;

    public LinkList() {
        firstLink = null;
    }

    public boolean isEmpty() {
        return (firstLink == null);
    }

    public void insertFirstLink(String bookName, int millionSold) {

        Link newLink = new Link(bookName, millionSold);

        newLink.next = firstLink;
        firstLink = newLink;
    }

    public Link removeFirstLink() {

        Link linkReference = firstLink;

        if (!isEmpty()) {
            firstLink = firstLink.next;
        } else {
            System.out.println("Empty LinkedList");
        }

        return linkReference;
    }

    public Link removeLink(String bookName) {
        Link currentLink = firstLink;
        Link previousLink = firstLink;
        while (currentLink.bookName != bookName) {
            if (currentLink.next == null) {
                return null;
            } else {
                previousLink = currentLink;
                currentLink = currentLink.next;
            }
        }
        if (currentLink == firstLink) {
            firstLink = firstLink.next;
        } else {
            previousLink.next = currentLink.next;
        }
        return currentLink;

    }

    public void traverse() {
        Link theLink = firstLink;
        while (theLink != null) {
            theLink.display();
            System.out.println("Next Link: " + theLink.next);
            theLink = theLink.next;
            System.out.println();
        }
    }

    public Link find(String bookName) {
        Link theLink = firstLink;
        if (!isEmpty()) {
            while (theLink.bookName != bookName) {
                if (theLink.next == null) {
                    return null;
                } else {
                    theLink = theLink.next;
                }
            }
        } else {
            System.out.println("Empty Linked List");
        }
        return theLink;
    }

}
