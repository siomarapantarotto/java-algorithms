package fromscratch.stack;

import java.util.Arrays;

public class TheStack {

    private String[] stackArray;
    private int stackSize;
    private int topIndexOfStack = -1; // set index for empty stack

    /**
     * Constructor
     */
    TheStack(int size) {
        stackSize = size;
        setStackArray(new String[size]);
        // assign '[]' to every array value simulating empty buckets
        Arrays.fill(getStackArray(), "[]");
    }

    public String[] getStackArray() {
        return stackArray;
    }

    public void setStackArray(String[] stackArray) {
        this.stackArray = stackArray;
    }

    /**
     * PUSH a value to the top of the stack
     */
    public boolean push(String input) {
        if (topIndexOfStack + 1 < stackSize) {
            topIndexOfStack++;
            getStackArray()[topIndexOfStack] = input;
            return true;
        } else {
            return false;
        }
    }

    /**
     * PUSH multiple values to the stack
     */
    public boolean pushMany(String multipleInputs) {
        String[] tempString = multipleInputs.split(" ");
        boolean pushSucceded;

        for (int i = 0; i < tempString.length; i++) {
            pushSucceded = push(tempString[i]);
            if (pushSucceded == false) {
                return false;
            }
        }
        return true;
    }

    /**
     * POP value that is on the top of the stack
     */
    public String pop() {
        if (topIndexOfStack >= 0) {
            String popValue = getStackArray()[topIndexOfStack];
            // Just like in memory an item isn't deleted,
            // but instead is just not available anymore
            getStackArray()[topIndexOfStack] = "[]";
            topIndexOfStack--;
            return popValue;
        } else {
            return null;
        }
    }

    /**
     * POP all values clearing the stack
     */
    public void popAll() {
        for (int i = stackSize; i >= 0; i--)
            this.pop();
    }

    /**
     * PEEK just displays the value at the top of the stack
     */
    public String peek() {
        if (topIndexOfStack >= 0) {
            return getStackArray()[topIndexOfStack];
        } else {
            return null;
        }
    }

}
