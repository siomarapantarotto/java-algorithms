package fromscratch.booklinkedlist;

public class Book {

    public String name;
    public int totalSold;
    public Book next;

    public Book(String bookName, int totalSold) {
        this.name = bookName;
        this.totalSold = totalSold;
    }

    public void print() {
        System.out.println("Book Name: " + name + ", Total Sold: " + totalSold);
    }

    public String toString() {
        return "[" + name + ", " + totalSold + "]";
    }

}
