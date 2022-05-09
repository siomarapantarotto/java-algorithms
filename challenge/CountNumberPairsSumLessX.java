package challenge;

// by siomara.com.br on May, 3rd of 2022
public class CountNumberPairsSumLessX {

    public static int sum(int[] array, int x) {

        int counter = 0;
        int leftIndex = 0;
        int rightIndex = array.length - 1;

        while (leftIndex < rightIndex) {

            if (array[leftIndex] + array[rightIndex] < x) {
                counter = counter + (rightIndex - leftIndex);
                leftIndex++;
            } else {
                rightIndex--;
            }

        }
        return counter;
    }

    public static void main(String[] args) {

        int[] array = new int[] { 2, 4, 6, 8, 9 };
        int x = 14;
        System.out.println(sum(array, x));
    }

}
// Given an array of numbers in sorted order
// count the pairs of numbers whose
// sum is less than X.
