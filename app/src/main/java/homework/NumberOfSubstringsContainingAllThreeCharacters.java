package homework;

public class NumberOfSubstringsContainingAllThreeCharacters {
    public int numberOfSubstrings(String s) {
        int count = 0;
        int[] positions = {-1, -1, -1};
        for (int i = 0; i < s.length(); i++) {
            positions[s.charAt(i) - 'a'] = i;
            count += Math.min(positions[0], Math.min(positions[1], positions[2])) + 1;
        }
        return count;
    }
}
