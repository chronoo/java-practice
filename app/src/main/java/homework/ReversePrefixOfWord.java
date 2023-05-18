package homework;

public class ReversePrefixOfWord {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder();
        boolean finded = false;
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            sb.append(currentChar);
            if (!finded && currentChar == ch) {
                sb.reverse();
                finded = true;
            }
        }
        return sb.toString();
    }
}
