package challenge;

class CeaserCipher {

    public static StringBuffer caesarCipher(String s, int k) {

        StringBuffer result = new StringBuffer();
        char ch = 0;

        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                ch = (char) (((int) s.charAt(i) + k - 65) % 26 + 65);
                result.append(ch);
            } else {
                ch = (char) (((int) s.charAt(i) + k - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // Original alphabet : abcdefghijklmnopqrstuvwxyz
        // Alphabet rotated +3 : defghijklmnopqrstuvwxyzabc

        // String originalMessage = "There's-a-starman-waiting-in-the-sky";
        String originalMessage = "abcdefghijklmnopqrstuvwxyz";
        int rotation = 3;
        StringBuffer ciphedMessage = caesarCipher(originalMessage, rotation);

        System.out.println("Original Message  : " + originalMessage);
        System.out.println("Alphabet Rotation : " + rotation);
        System.out.println("Ciphed Message    : " + ciphedMessage);

    }

}
