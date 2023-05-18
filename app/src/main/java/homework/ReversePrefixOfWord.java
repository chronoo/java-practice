package homework;

public class ReversePrefixOfWord {
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch) + 1;
        if (index == 0)
            return word;
        return new StringBuilder(word.substring(0, index))
            .reverse()
            .append(word.substring(index))
            .toString();
    }
}
