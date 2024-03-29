package challenge;

import java.util.HashMap;

// Time complexity O(n)
public class FirstNonRepeatingCharacter {

    public static char findFirstNonRepeatingCharacter(String input) {

        // create a hashmap to store chars and its counts
        HashMap<Character, Integer> hmCharCounts = new HashMap<>();

        // loop input string adding chars to hashmap and incrementing their counts
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (hmCharCounts.containsKey(c)) {
                hmCharCounts.put(c, hmCharCounts.get(c) + 1);
            } else {
                hmCharCounts.put(c, 1);
            }
        }

        // loop hasmap finding char with counts equals to 1
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (hmCharCounts.get(c) == 1)
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
