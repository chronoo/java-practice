package t;

/**
 * https://leetcode.com/problems/xor-operation-in-an-array
 */
public class XOROperationInAnArray {
    public int xorOperation(int n, int start) {
        var res = 0;
        for (var i = start; i < start + 2 * n; i += 2) res ^= i;
        return res;
    }
}
