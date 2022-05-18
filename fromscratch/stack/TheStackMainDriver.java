package fromscratch.stack;

import java.util.Arrays;

public class TheStackMainDriver {

    public static void main(String[] args) {

        TheStack theStack = new TheStack(10);

        String strValue = "";

        //////////////////////////////////////////////////////////////////
        // PUSH - Insert a value to the top of the stack.
        //
        strValue = "Hello";
        System.out.println(theStack.push(strValue) // returns a boolean
                ? "PUSH succeded: '" + strValue + "' was added to the stack."
                : "PUSH failed: Stack is full.");
        print(theStack);

        strValue = "World";
        System.out.println(theStack.push(strValue) // returns a boolean
                ? "PUSH succeded: '" + strValue + "' was added to the stack."
                : "PUSH failed: Stack is full.");
        print(theStack);

        //////////////////////////////////////////////////////////////////
        // POP - Remove the value that is at the top of the stack.
        //
        strValue = theStack.pop();
        System.out.println(strValue != null // returns popped string value
                ? "POP succeded: '" + strValue + "' was removed from the stack."
                : "POP failed: Sorry! Stack is empty, nothing to remove.");
        print(theStack);

        strValue = theStack.pop();
        System.out.println(strValue != null // returns popped string value
                ? "POP succeded: '" + strValue + "' was removed from the stack."
                : "POP failed: Sorry! Stack is empty, nothing to remove.");
        print(theStack);

        //////////////////////////////////////////////////////////////////
        // PUSH - Insert a value to the top of the stack.
        //
        strValue = "Hey";
        System.out.println(theStack.push(strValue) // returns a boolean
                ? "PUSH succeded: '" + strValue + "' was added to the stack."
                : "PUSH failed: Stack is full.");
        print(theStack);

        //////////////////////////////////////////////////////////////////
        // PEEK - Just display the value that is at the top of the stack.
        //
        System.out.println(theStack.peek() != null // returns peek string value
                ? "PEEK succeded: '" + strValue + "' is at the top of the stack."
                : "PEEK failed: Stack is empty.");
        print(theStack);

        //////////////////////////////////////////////////////////////////
        // PUSH MULTIPLE - Insert many values to the stack
        //
        boolean succededPushingAll = theStack
                .pushMany("good morning everybody I am here to tell you a little bit of myself");
        System.out.println(succededPushingAll // returns a boolean
                ? "PUSH succeded with all multiples values."
                : "PUSH failed with some of the multiples values.");
        print(theStack);

        //////////////////////////////////////////////////////////////////
        // POP ALL - Remove all the values of the stack
        //
        System.out.println("POP all values from stack.");
        theStack.popAll();
        print(theStack);

    }

    // Print the stack and jump line
    private static void print(TheStack theStack) {
        System.out.println(Arrays.toString(theStack.getStackArray()));
        System.out.println();
    }

}
