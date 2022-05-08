package sort.bubblesort;

import java.util.Arrays;
import java.util.Random;

public class MyBubbleSortPractice2 {

    public static void bubbleSort(int[] data)

    public static void main(String[] args) {
        Random random = new Random();
        int[] data = new int[10];
        for (int i = 0; i < data.length - 1; i++) {
            data[i] = random.nextInt(100);
        }

        System.out.println("Before Bubble Sort:" + Arrays.toString(data));
        bubbleSort(data);
        System.out.println("After Bubble Sort :" + Arrays.toString(data));

        // Arrays.stream(array).forEach(System.out::println);
    }

}
