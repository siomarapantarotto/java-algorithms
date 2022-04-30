package recursive;

public class SumNaturalNumber {

    public static int sum(int inputNumber) {
        if (inputNumber <= 1) {
            return inputNumber;
        }
        return inputNumber + sum(inputNumber - 1);
    }

    public static void main (String[] args) {
        System.out.println(sum(10));
    }
    
}
