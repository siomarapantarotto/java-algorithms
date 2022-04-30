package recursive;

public class SumNaturalNumber {

    // Recursion
    public static int sum1(int inputNumber) {
        if (inputNumber <= 1) {
            return inputNumber;
        }
        return inputNumber + sum1(inputNumber - 1);
    }

    // Formula
    public static int sum2(int inputNumber) {
        return (inputNumber * (inputNumber + 1)) / 2;
    }

    public static void main(String[] args) {
        System.out.println("Recursive calculation: ");
        System.out.println(sum1(10));

        System.out.println("Formula calculation: ");
        System.out.println(sum2(10));
    }
}
