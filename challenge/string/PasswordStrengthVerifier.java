package challenge.string;

import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class PasswordStrengthVerifier {

    private static int countMissingRules(String password) {

        // First check for minimum required size
        if (password.length() < 6)
            return (6 - password.length());

        // Now set controls for checking the 4 remaining rules
        int missingRules = 4; // lower, upper, digit and special char

        boolean hasLower = false, hasUpper = false,
                hasDigit = false, hasSpecialChar = false;

        Set<Character> set = new HashSet<Character>(
                Arrays.asList('!', '@', '#', '$', '%', '^', '&',
                        '*', '(', ')', '-', '+'));

        // Loop over input password confirming that required rules are present
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

        // Now decrement from missig rules the required rules that were present
        if (hasLower == true) // Checking for rule #1
            missingRules--;
        if (hasUpper == true) // Checking for rule #2
            missingRules--;
        if (hasDigit == true) // Checking for rule #3
            missingRules--;
        if (hasSpecialChar == true) // Checking for rule #4
            missingRules--;

        // Return the minimum broken rules for a strong password
        return missingRules;

    }

    public static void main(String[] args) {
        String password = "abcdefABC123$";
        int missingRules = countMissingRules(password);
        System.out.println(missingRules);
    }
}

// https://www.hackerrank.com/challenges/strong-password