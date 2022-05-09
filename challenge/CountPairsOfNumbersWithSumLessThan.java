package challenge;

// by siomara.com.br on May, 3rd of 2022
public class CountPairsOfNumbersWithSumLessThan {

    public static int sumLessThan(int[] array, int x) {

        int counter = 0;
        int startIndex = 0;
        int endIndex = array.length - 1;

        while (startIndex < endIndex) {

            if (array[startIndex] + array[endIndex] < x) {
                // counter will be the combination of startElement with others
                counter = counter + (endIndex - startIndex);
                startIndex++;
            } else {
                endIndex--;
            }
        }
        return counter;
    }

    public static void main(String[] args) {

        int[] array = new int[] { 2, 4, 6, 8, 9 };
        int x = 14;
        System.out.println(sumLessThan(array, x));
    }

}
// Given an array of numbers in sorted order
// count the pairs of numbers whose
// sum is less than X.
