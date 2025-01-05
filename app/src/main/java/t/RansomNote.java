package t;


import java.util.Arrays;

/**
 * https://leetcode.com/problems/ransom-note
 */
public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        var ransomNoteArray = ransomNote.toCharArray();
        Arrays.sort(ransomNoteArray);
        var magazineArray = magazine.toCharArray();
        Arrays.sort(magazineArray);
        var magazineArrayA = 0;
        for (char c : ransomNoteArray) {
            if (magazineArrayA > magazineArray.length - 1) return false;
            while (magazineArray[magazineArrayA] < c) {
                magazineArrayA++;
                if (magazineArrayA > magazineArray.length - 1) return false;
            }
            if (magazineArray[magazineArrayA] > c) return false;
            magazineArrayA++;
        }
        return true;
    }
}
