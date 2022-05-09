package challenge.string;

import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class CheckForStrongPassword {

    private static int checkPassword(String password) {

        int missing = 0;

        boolean hasLower = false, hasUpper = false,
                hasDigit = false, hasSpecialChar = false;

        Set<Character> set = new HashSet<Character>(
                Arrays.asList('!', '@', '#', '$', '%', '^', '&',
                        '*', '(', ')', '-', '+'));

        for (char i : password.toCharArray()) {
            if (Character.isLowerCase(i))
                hasLower = true;
            if (Character.isUpperCase(i))
                hasUpper = true;
            if (Character.isDigit(i))
                hasDigit = true;
            if (set.contains(i))
                hasSpecialChar = true;
        }

        if (hasLower == false)
            missing++;
        if (hasUpper == false)
            missing++;
        if (hasDigit == false)
            missing++;
        if (hasSpecialChar == false)
            missing++;
        if (password.length() < 6)
            missing++;

        return missing;
    }

    public static void main(String[] args) {
        String password = "Abcd&ef1";
        int missingConstraints = checkPassword(password);
        System.out.println(missingConstraints);
    }
}
