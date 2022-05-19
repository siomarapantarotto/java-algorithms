package fromscratch.queue;

import java.util.Arrays;

public class TheQueue {

    private String[] queueArray;
    private int queueSize;
    private int front;
    private int rear;
    private int numberOfItems = 0;

    /**
     * Cosntructor
     */
    TheQueue(int size) {
        queueSize = size;
        queueArray = new String[size];
        Arrays.fill(queueArray, "-1");
    }

    /**
     * Insert values in regular order as they appear to be added
     */
    public void insert(String input) {

        if ((numberOfItems + 1 <= queueSize - 1)) {
            queueArray[rear] = input;
            rear++;
            numberOfItems++;
            System.out.println("INSERT succeded: '" + input + "' was added to the queue.");
            // return true;
        } else {
            System.out.println("INSERT failed: Queue is full.");
            // return false;
        }
    }

    /**
     * Insert values in priority order (high to low)
     */
    public void insertPriority(String input) {

        int i;
        if (numberOfItems == 0) {
            insert(input);
        } else {
            for (i = numberOfItems - 1; i >= 0; i--) {
                if (Integer.parseInt(input) > Integer.parseInt(queueArray[i])) {
                    queueArray[i + 1] = queueArray[i];
                } else {
                    break;
                }
            }
            System.out.println("INSERT PRIORITY succeded: '" + input + "' was added to the queue.");
            queueArray[i + 1] = input;
            rear++;
            numberOfItems++;
        }
    }

    /**
     * Remove a value from the front of the queue
     */
    public String remove() {
        if (numberOfItems > 0) {
            String removedValue = queueArray[front];
            queueArray[front] = "-1";
            front++;
            numberOfItems--;
            return removedValue;
        } else {
            return null;
        }
    }

    public void removeAll() {
        if (numberOfItems > 0) {
            for (int i = 0; i < queueSize; i++) {
                queueArray[i] = "-1";
            }
            front = 0;
            rear = 0;
            numberOfItems = 0;
        }
    }

    /**
     * Peek the value that is in the front of the queue
     */
    public String peek() {
        if (numberOfItems > 0) {
            return queueArray[front];
        } else {
            return null;
        }
    }

    /**
     * Print the queue and other attributes
     */
    public void print() {
        System.out.println(Arrays.toString(queueArray));
        System.out.println("queueSize = " + queueSize
                + "\tfront = " + front
                + "\trear = " + rear
                + "\tnumberOfItems = " + numberOfItems);
        System.out.println();
    }

}
