package t;

/**
 * https://leetcode.com/problems/find-the-prefix-common-array-of-two-arrays
 */
public class FindThePrefixCommonArrayOfTwoArrays {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        var n = A.length;
        var res = new int[n];
        var freq = new int[n + 1];
        var count = 0;
        for (var i = 0; i < n; i++) {
            if (++freq[A[i]] == 2) count++;
            if (++freq[B[i]] == 2) count++;
            res[i] = count;
        }
        return res;
    }
}
