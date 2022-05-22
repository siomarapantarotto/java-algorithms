package challenge.string;

public class StringReverseInPlace {

    public static String reverseInPlace(final String input) {

        StringBuilder builder = new StringBuilder(input);
        int length = builder.length();

        for (int i = 0; i < length / 2; i++) {
            final char current = builder.charAt(i);
            final int otherEnd = length - i - 1;
            builder.setCharAt(i, builder.charAt(otherEnd));
            builder.setCharAt(otherEnd, current); // swap
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        String number = "123456789";
        System.out.println("original String: " + number);
        String reversed = reverseInPlace(number);
        System.out.println("reversed String: " + reversed);
    }

}
