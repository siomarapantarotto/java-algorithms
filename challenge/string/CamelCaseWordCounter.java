package challenge.string;

public class CamelCaseWordCounter {

    public static int countCamelCaseWords(String input) {

        int count = 0;

        if (!input.isEmpty()) {
            count = 1;
            for (int i = 1; i < input.length() - 1; i++) {
                // if (input.charAt(i) >= 65 && input.charAt(i) <= 90)
                if (Character.isUpperCase(input.charAt(i)))
                    count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String input = "oneTwoThreeFourFiveSixS"; // return 6
        // String input = ""; // return 0
        int count = countCamelCaseWords(input);
        System.out.println(count);
    }

}
