package homework;

public class NumberOfSubstringsContainingAllThreeCharacters {
    public int numberOfSubstrings(String s) {
        int count = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            boolean isA = false;
            boolean isB = false;
            boolean isC = false;
            for (int j = i; j < s.length(); j++) {
                switch (s.charAt(j)) {
                    case 'a' -> isA = true;
                    case 'b' -> isB = true;
                    case 'c' -> isC = true;
                }
                if (isA && isB && isC) {
                    count += s.length() - j;
                    break;
                }
            }
        }
        return count;
    }
}
