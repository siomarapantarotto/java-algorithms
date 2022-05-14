package sort.bubblesort;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {

    public void sort(int[] data) {
        int dataLengthMinusOne = data.length - 1;
        boolean swappedSomething = true;
        int temp, i;

        while (swappedSomething) {
            swappedSomething = false;
            for (i = 0; i < dataLengthMinusOne; i++) { // Attention to < not <=
                if (data[i] > data[i + 1]) {
                    temp = data[i];
                    data[i] = data[i + 1];
                    data[i + 1] = temp;
                    swappedSomething = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        // create bubble sorter object
        BubbleSort bubbleSorter = new BubbleSort();

        // create an array and generate random values
        int[] data = new int[10];
        Random random = new Random();
        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(100);
        }

        // print array before sort using Arrays.toString
        System.out.println("Before Bubble Sort:" + Arrays.toString(data));

        // call sort method
        bubbleSorter.sort(data);

        // print array after sort using Arrays.stream
        System.out.println("After Bubble Sort :");
        Arrays.stream(data).forEach(System.out::println);
    }

}
