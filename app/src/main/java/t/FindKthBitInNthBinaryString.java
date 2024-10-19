package t;

/**
 * https://leetcode.com/problems/find-kth-bit-in-nth-binary-string
 */
public class FindKthBitInNthBinaryString {
    public char findKthBit(int n, int k) {
        if (n == 1) return '0';
        var length = (int) Math.pow(2, n) - 1;
        var mid = length / 2 + 1;
        if (k == mid) return '1';
        if (k < mid) return findKthBit(n - 1, k);
        return findKthBit(n - 1, length - k + 1) == '0' ? '1' : '0';
    }
}
