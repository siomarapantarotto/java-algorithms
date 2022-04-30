package bitwise;
public class AddWithoutMath {

    public static void main(String[] args) {   
        int sum = add(1, 9000);
        System.out.println( "\nValues added without math operation: " + sum );
    }

    static int add(int x, int y) {
        if (x > y) {
            for (int i = 1; i <= y; i++) {
                x++;
            }
            return x;
        } else {
            for (int i = 1; i <= x; i++) {
                y++;
            }
            return y;
        }
    }
}