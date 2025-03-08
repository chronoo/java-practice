package t;

/**
 * https://leetcode.com/problems/minimum-recolors-to-get-k-consecutive-black-blocks
 */
public class MinimumRecolorsToGetKConsecutiveBlackBlocks {
    public int minimumRecolors(String blocks, int k) {
        var charArray = blocks.toCharArray();
        var whites = 0;
        for (var i = 0; i < k; i++) {
            if (charArray[i] == 'W') whites++;
        }
        var min = whites;
        for (var i = k; i < blocks.length(); i++) {
            if (charArray[i] == 'W') whites++;
            if (charArray[i - k] == 'W') whites--;
            min = Math.min(min, whites);
        }
        return min;
    }
}
