package challenge.string;

import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class PasswordStrengthVerifier {

    private static int countMissingRules(String password) {

        int missingRules = 5;

        boolean hasLower = false, hasUpper = false,
                hasDigit = false, hasSpecialChar = false;

        Set<Character> set = new HashSet<Character>(
                Arrays.asList('!', '@', '#', '$', '%', '^', '&',
                        '*', '(', ')', '-', '+'));

        // Loop over input password identifying rules
        for (char currentChar : password.toCharArray()) {
            if (Character.isLowerCase(currentChar))
                hasLower = true;
            if (Character.isUpperCase(currentChar))
                hasUpper = true;
            if (Character.isDigit(currentChar))
                hasDigit = true;
            if (set.contains(currentChar))
                hasSpecialChar = true;
        }

        if (password.length() >= 6) // Checked rule #1
            missingRules--;
        if (hasLower == true) // Checked rule #2
            missingRules--;
        if (hasUpper == true) // Checked rule #3
            missingRules--;
        if (hasDigit == true) // Checked rule #4
            missingRules--;
        if (hasSpecialChar == true) // Checked rule #5
            missingRules--;

        return missingRules;
    }

    public static void main(String[] args) {
        String password = "Ab1";
        int missingRules = countMissingRules(password);
        System.out.println(missingRules);
    }
}

// https://www.hackerrank.com/challenges/strong-password