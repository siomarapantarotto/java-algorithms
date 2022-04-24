package Bitwise;

public class BitwiseAddOne {

    public static void main(String[] args) {
        System.out.printf("%d", addOne(30));
    }

    static int addOne(int x) {
        return -(~x);
    }
    
}
