package homework;

public class FindTheIndexOfTheFirstOccurrenceInAString {
    public int strStr(String haystack, String needle) {
        for(int i =0; i < haystack.length(); i++){
            if(haystack.charAt(i) == needle.charAt(0)){
                int k = 0;
                int j = i;
                while(k < needle.length() && j < haystack.length() && haystack.charAt(j) == needle.charAt(k)){
                    j++; k++;
                }
                if(k == needle.length()) return i;
            }
        }

        return -1;
    }

    public int strStr1(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
