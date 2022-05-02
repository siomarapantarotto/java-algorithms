package questions;

import java.util.HashMap;

// Time complexity O(n)
public class FirstNonRepeatingCharacter {

    public static char findFirstNonRepeatingCharacter(String input) {

        // create a hash map to store chars and its counts
        HashMap<Character, Integer> charCounts = new HashMap<>();

        // loop input string adding chars to hashmap and incrementing their counts
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (charCounts.containsKey(c)) {
                charCounts.put(c, charCounts.get(c) + 1);
            } else {
                charCounts.put(c, 1);
            }
        }

        // loop hasmap finding char with counts equals to 1
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (charCounts.get(c) == 1)
                return c;
        }
        return '_';
    }

    public static void main(String[] args) {
        char char1 = findFirstNonRepeatingCharacter("aaadddggeege");
        System.out.println(char1);
        char char2 = findFirstNonRepeatingCharacter("aaazggeege");
        System.out.println(char2);
    }

}
