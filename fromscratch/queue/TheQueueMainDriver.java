package fromscratch.queue;

public class TheQueueMainDriver {

    public static void main(String[] args) {

        // Create and print the new created queue
        TheQueue theQueue = new TheQueue(10);
        theQueue.print();

        // Set a String value to be passed as parameter
        String strValue = "";

        //////////////////////////////////////////////////////////////////
        // INSERT REGULAR - Insert value in regular order.
        // Use INSERT REGULAR or INSERT PRIORITY (not both)
        // theQueue.insert("40");
        // theQueue.print();
        // theQueue.insert("20");
        // theQueue.print();
        // theQueue.insert("30");
        // theQueue.print();

        //////////////////////////////////////////////////////////////////
        // INSERT PRIORITY - Insert value in priority order.
        // Use INSERT PRIORITY or INSERT REGULAR (not both)
        theQueue.insertPriority("10");
        theQueue.print();
        theQueue.insertPriority("50");
        theQueue.print();

        //////////////////////////////////////////////////////////////////
        // PEEK - Just display the value that is at the top of the queue.
        System.out.println(theQueue.peek() != null // returns peek string value
                ? "PEEK succeded: '" + theQueue.peek() + "' is at the front of the queue."
                : "PEEK failed: Queue is empty.");
        theQueue.print();

        //////////////////////////////////////////////////////////////////
        // INSERT PRIORITY - Insert value in priority order.
        // Use INSERT PRIORITY or INSERT REGULAR (not both)
        theQueue.insertPriority("15");
        theQueue.print();
        theQueue.insertPriority("5");
        theQueue.print();

        //////////////////////////////////////////////////////////////////
        // Remove the value that is at the front of the queue.
        strValue = theQueue.remove();
        System.out.println(strValue != null // returns removed string value
                ? "REMOVE succeded: '" + strValue + "' was removed from the queue."
                : "REMOVE failed: Sorry! Queue is empty, nothing to remove.");
        theQueue.print();

        //////////////////////////////////////////////////////////////////
        // PEEK - Just display the value that is at the top of the queue.
        System.out.println(theQueue.peek() != null // returns peek string value
                ? "PEEK succeded: '" + theQueue.peek() + "' is at the front of the queue."
                : "PEEK failed: Queue is empty.");
        theQueue.print();

        //////////////////////////////////////////////////////////////////
        // Remove the value that is at the front of the queue.
        strValue = theQueue.remove();
        System.out.println(strValue != null // returns REMOVEped string value
                ? "REMOVE succeded: '" + strValue + "' was removed from the queue."
                : "REMOVE failed: Sorry! Queue is empty, nothing to remove.");
        theQueue.print();

        //////////////////////////////////////////////////////////////////
        // INSERT PRIORITY - Insert value in priority order.
        // This insert here messes up everything - fix later
        // theQueue.insertPriority("70");
        // theQueue.print();

        //////////////////////////////////////////////////////////////////
        // PEEK - Just display the value that is at the top of the queue.
        System.out.println(theQueue.peek() != null // returns peek string value
                ? "PEEK succeded: '" + theQueue.peek() + "' is at the front of the queue."
                : "PEEK failed: Queue is empty.");
        theQueue.print();

        //////////////////////////////////////////////////////////////////
        // REMOVE ALL - Remove all the values of the Queue
        System.out.println("REMOVE all values from Queue.");
        theQueue.removeAll();
        theQueue.print();

        //////////////////////////////////////////////////////////////////
        // PEEK - Just display the value that is at the top of the queue.
        System.out.println(theQueue.peek() != null // returns peek string value
                ? "PEEK succeded: '" + theQueue.peek() + "' is at the front of the queue."
                : "PEEK failed: Queue is empty.");
        theQueue.print();

        //////////////////////////////////////////////////////////////////
        // INSERT PRIORITY - Insert value in priority order.
        theQueue.insertPriority("60");
        theQueue.print();

        //////////////////////////////////////////////////////////////////
        // PEEK - Just display the value that is at the top of the queue.
        System.out.println(theQueue.peek() != null // returns peek string value
                ? "PEEK succeded: '" + theQueue.peek() + "' is at the front of the queue."
                : "PEEK failed: Queue is empty.");
        theQueue.print();

    }

}
