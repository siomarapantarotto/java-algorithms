package fromscratch.queue;

import java.util.Arrays;

public class TheQueue {

    private String[] queueArray;
    private int queueSize;
    private int front;
    private int rear;
    private int numberOfItems = 0;

    TheQueue(int size) {
        queueSize = size;
        queueArray = new String[size];
        Arrays.fill(queueArray, "()");
    }

    public boolean insert(String input) {

        if (numberOfItems + 1 <= queueSize) {
            queueArray[rear] = input;
            rear++;
            numberOfItems++;
            return true;
        } else {
            return false;
        }

    }

    public String remove() {
        if (numberOfItems > 0) {
            String removedValue = queueArray[front];
            queueArray[front] = "()";
            front++;
            numberOfItems--;
            return removedValue;
        } else {
            return null;
        }
    }

    public String peek() {
        return queueArray[front];
    }

    public static void main(String[] args) {

        TheQueue theQueue = new TheQueue(15);

        String strValue = "";
        boolean succeded;

        //////////////////////////////////////////////////////////////////
        // Insert a value to the queue.
        //
        strValue = "First";
        System.out.println(theQueue.insert(strValue) // returns a boolean
                ? "INSERT succeded: '" + strValue + "' was added to the queue."
                : "INSERT failed: Queue is full.");
        print(theQueue);

        strValue = "Second";
        System.out.println(theQueue.insert(strValue) // returns a boolean
                ? "INSERT succeded: '" + strValue + "' was added to the queue."
                : "INSERTED failed: Queue is full.");
        print(theQueue);

        strValue = "Third";
        System.out.println(theQueue.insert(strValue) // returns a boolean
                ? "INSERT succeded: '" + strValue + "' was added to the queue."
                : "INSERTED failed: Queue is full.");
        print(theQueue);

        //////////////////////////////////////////////////////////////////
        // Remove the value that is at the top of the queue.
        //
        strValue = theQueue.remove();
        System.out.println(strValue != null // returns removed string value
                ? "REMOVE succeded: '" + strValue + "' was removed from the queue."
                : "REMOVE failed: Sorry! Queue is empty, nothing to remove.");
        print(theQueue);

        strValue = theQueue.remove();
        System.out.println(strValue != null // returns REMOVEped string value
                ? "REMOVE succeded: '" + strValue + "' was removed from the queue."
                : "REMOVE failed: Sorry! Queue is empty, nothing to remove.");
        print(theQueue);

        //////////////////////////////////////////////////////////////////
        // INSERT - Insert a value to the top of the queue.
        //
        strValue = "Fourth";
        System.out.println(theQueue.insert(strValue) // returns a boolean
                ? "INSERT succeded: '" + strValue + "' was added to the queue."
                : "INSERT failed: Queue is full.");
        print(theQueue);

        //////////////////////////////////////////////////////////////////
        // PEEK - Just display the value that is at the top of the queue.
        //
        System.out.println(theQueue.peek() != null // returns peek string value
                ? "PEEK succeded: '" + strValue + "' is at the top of the queue."
                : "PEEK failed: Queue is empty.");
        print(theQueue);

        //////////////////////////////////////////////////////////////////
        // INSERT MULTIPLE - Insert many values to the queue
        //
        // boolean succededINSERTingAll = theQueue
        // .insertMany("good morning everybody I am here to tell you a little bit of
        ////////////////////////////////////////////////////////////////// myself");
        // System.out.println(succededINSERTingAll // returns a boolean
        // ? "INSERT succeded with all multiples values."
        // : "INSERT failed with some of the multiples values.");
        // print(theQueue);

        //////////////////////////////////////////////////////////////////
        // REMOVE ALL - Remove all the values of the Queue
        //
        // System.out.println("REMOVE all values from Queue.");
        // theQueue.removeAll();
        // print(theQueue);

    }

    // Print the Queue and jump line
    private static void print(TheQueue theQueue) {
        System.out.println(Arrays.toString(theQueue.queueArray));
        System.out.println();
    }

}
