package fromscratch.stack;

import java.util.Arrays;

public class TheStackMainDriver {

    public static void main(String[] args) {

        TheStack theStack = new TheStack(10);

        String strValue = "";

        //////////////////////////////////////////////////////////////////
        // theStack.push(input)
        //
        strValue = "Hello";
        System.out.println(theStack.push(strValue)
                ? "PUSH succeded: '" + strValue + "' was added to the stack."
                : "PUSH failed: Stack is full.");
        System.out.println(Arrays.toString(theStack.getStackArray()));
        System.out.println();

        strValue = "World";
        System.out.println(theStack.push(strValue)
                ? "PUSH succeded: '" + strValue + "' was added to the stack."
                : "PUSH failed: Stack is full.");
        System.out.println(Arrays.toString(theStack.getStackArray()));
        System.out.println();

        //////////////////////////////////////////////////////////////////
        // theStack.pop()
        //
        strValue = theStack.pop();
        System.out.println(strValue != null
                ? "POP succeded: '" + strValue + "' was removed from the stack."
                : "POP failed: Sorry! Stack is empty, nothing to remove.");
        System.out.println(Arrays.toString(theStack.getStackArray()));
        System.out.println();

        strValue = theStack.pop();
        System.out.println(strValue != null
                ? "POP succeded: '" + strValue + "' was removed from the stack."
                : "POP failed: Sorry! Stack is empty, nothing to remove.");
        System.out.println(Arrays.toString(theStack.getStackArray()));
        System.out.println();

        //////////////////////////////////////////////////////////////////
        // theStack.push(input)
        //
        strValue = "Hey";
        System.out.println(theStack.push(strValue)
                ? "PUSH succeded: '" + strValue + "' was added to the stack."
                : "PUSH failed: Stack is full.");
        System.out.println(Arrays.toString(theStack.getStackArray()));
        System.out.println();

        //////////////////////////////////////////////////////////////////
        // theStack.push(input)
        //
        System.out.println(theStack.peek() != null
                ? "PEEK succeded: '" + strValue + "' is at the top of the stack."
                : "PEEK failed: Stack is empty.");
        System.out.println(Arrays.toString(theStack.getStackArray()));
        System.out.println();

        //////////////////////////////////////////////////////////////////
        // theStack.push(input)
        //
        boolean succededPushingAll = theStack
                .pushMany("good morning everybody I am here to tell you a little bit of myself");
        System.out.println(succededPushingAll
                ? "PUSH succeded with all multiples values."
                : "PUSH failed with some of the multiples values.");
        System.out.println(Arrays.toString(theStack.getStackArray()));
        System.out.println();

        System.out.println("POP all values from stack.");
        theStack.popAll();
        System.out.println(Arrays.toString(theStack.getStackArray()));
        System.out.println();

    }

}
