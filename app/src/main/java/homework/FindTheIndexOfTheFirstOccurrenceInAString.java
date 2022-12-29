package homework;

public class FindTheIndexOfTheFirstOccurrenceInAString {
    public int strStr(String haystack, String needle) {
        for (int left = 0; left < haystack.length(); left++) {
            int needleLeft = 0;
            int haystackPosition = left;
            while (haystackPosition < haystack.length() && needleLeft < needle.length() && haystack.charAt(haystackPosition) == needle.charAt(needleLeft)){
                haystackPosition++;
                needleLeft++;
            }
            if (needleLeft == needle.length()) return left;
        }
        return -1;
    }

    public int strStr1(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
