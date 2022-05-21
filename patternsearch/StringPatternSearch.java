package patternsearch;

public class StringPatternSearch {

    public static void searchForPattern(String pattern, String text) {

        int textSize = text.length();
        int patternSize = pattern.length();
        String textPart = "";

        for (int i = 0; i < textSize - patternSize + 1; i++) {
            textPart = text.substring(i, (i + patternSize));
            if (textPart.equals(pattern)) {
                System.out.println("\nFound a match for "
                        + textPart + " starting at index " + i);
            }
        }

    }

    public static void main(String[] args) {
        // String text = "AABABBAABABBAABAAABAAABA";
        String text = "AAAAAAAA";
        // String pattern = "AABA";
        String pattern = "A";
        searchForPattern(pattern, text);
    }

}
