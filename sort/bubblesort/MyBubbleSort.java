package sort.bubblesort;

import java.util.Random;

public class MyBubbleSort {

    static void bubbleSort(int[] arr) {

        int arrLength = arr.length;
        Boolean swappedSomething = true;
        int i, temp;
        
        while(swappedSomething) {
            swappedSomething = false;
            for (i = 0; i < (arrLength - 1); i++) {                
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swappedSomething = true;
                }
            }
        }
    }

    static void printArray (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print( "\t" + arr[i] );
        }
        System.out.println();        
    }

    public static void main(String[] args) {

        Random rand = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }
        
        System.out.println("Before Bubble Sort:");
        printArray(arr);

        bubbleSort(arr);

        System.out.println("After Bubble Sort:");
        printArray(arr);
    }    
}
