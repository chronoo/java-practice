package t;

/**
 * https://leetcode.com/problems/reverse-bits
 */
public class ReverseBits {
    public int reverseBits(int n) {
        var sb = new StringBuilder(Integer.toBinaryString(n)).reverse();
        var zeros = 32 - sb.length();
        return Integer.parseUnsignedInt(sb.repeat("0", zeros).toString(), 2);
    }
}
