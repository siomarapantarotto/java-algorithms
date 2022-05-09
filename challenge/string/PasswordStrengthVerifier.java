package challenge.string;

import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class PasswordStrengthVerifier {

    private static int countMissingRules(String password) {

        int missingRules = 0;
        
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

        if (password.length() < 6)      // Missing rule #1
            missingRules++;
        if (hasLower == false)          // Missing rule #2
            missingRules++;
        if (hasUpper == false)          // Missing rule #3
            missingRules++;
        if (hasDigit == false)          // Missing rule #4
            missingRules++;
        if (hasSpecialChar == false)    // Missing rule #5
            missingRules++;

        return missingRules;
    }

    public static void main(String[] args) {
        String password = "";
        int missingRules = countMissingRules(password);
        System.out.println(missingRules);
    }
}
