package patternsearch;

public class StringPatternSearch {

    public static void searchForPattern(String pattern, String text) {

        int textSize = text.length();
        int patternSize = pattern.length();
        String part = "";

        for (int i = 0; i < textSize - patternSize + 1; i++) {
            part = text.substring(i, i + patternSize);
            if (part.equals(pattern)) {
                System.out.println("\nFound " + part + " starting at index" + i);
            }
        }
    }

    public static void main(String[] args) {
        String text = "AABABBAABABBAABA";
        String pattern = "AABA";
        searchForPattern(pattern, text);
    }

}
