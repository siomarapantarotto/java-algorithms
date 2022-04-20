public class PyramidAscending {
    public static void main(String[] args) {
        int term = 10;
        for (int i = 1; i <= term; i++) {
            for (int j = 1; j <= i; j++) {                
                System.out.print("* ");
            }
            System.out.println(); // new line
        }
    }

}
