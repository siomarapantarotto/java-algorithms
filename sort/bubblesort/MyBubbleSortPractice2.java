package sort.bubblesort;

import java.util.Arrays;
import java.util.Random;

public class MyBubbleSortPractice2 {

    public static void bubbleSort(int[] data) {
        int dataLength = data.length;
        boolean swappedSomething = true;
        int tempSwap, i;

        while (swappedSomething) {
            swappedSomething = false;
            for (i = 0; i < dataLength - 1; i++) { // Attention here is just < not <=
                if (data[i] > data[i + 1]) {
                    tempSwap = data[i];
                    data[i] = data[i + 1];
                    data[i + 1] = tempSwap;
                    swappedSomething = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] data = new int[10];
        for (int i = 0; i < data.length - 1; i++) {
            data[i] = random.nextInt(100);
        }

        System.out.println("Before Bubble Sort:" + Arrays.toString(data));
        bubbleSort(data);
        // System.out.println("After Bubble Sort :" + Arrays.toString(data));
        System.out.println("After Bubble Sort :");
        Arrays.stream(data).forEach(System.out::println);
    }

}
