package homework;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int length = 0;
        boolean hasWord = false;
        char[] chars = s.toCharArray();
        for (char currentChar : chars) {
            if (currentChar == ' ') {

                hasWord = false;
            } else {
                if (!hasWord) {
                    length = 0;
                }
                hasWord = true;
                length++;
            }
        }
        return length;
    }
}
