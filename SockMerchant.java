import java.util.HashSet;

public class SockMerchant {

    // static int sockMerchant(int n, int[] ar) {
    public static void main(String args[]) {

        int[] ar = new int[] { 10, 20, 30, 10, 20, 40, 50, 40, 80, 80, 30 };

        HashSet<Integer> set = new HashSet<Integer>();
        int count = 0;
        for (int i = 0; i < ar.length; i++) {
            int element = ar[i];
            if (set.contains(element)) {
                set.remove(element);
                count++;
            } else {
                set.add(element);
            }
        }
        System.out.println(count);
    }
}
