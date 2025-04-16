package t;

/**
 * https://leetcode.com/problems/minimum-bit-flips-to-convert-number
 */
public class MinimumBitFlipsToConvertNumber {
    public int minBitFlips(int start, int goal) {
        return Integer.bitCount(start ^ goal);
    }
}
