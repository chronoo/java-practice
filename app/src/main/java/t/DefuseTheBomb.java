package t;

/**
 * https://leetcode.com/problems/defuse-the-bomb
 */
public class DefuseTheBomb {
    public int[] decrypt(int[] code, int k) {
        var size = code.length;
        var result = new int[size];
        if (k == 0) return result;
        for (int i = 0; i < size; i++) {
            var sum = 0;
            for (int j = 0; j < k; j++) {
                sum += code[(j + i + 1) % size];
            }
            for (int j = 0; j > k; j--) {
                sum += code[(size + j + i - 1) % size];
            }
            result[i] = sum;
        }
        return result;
    }
}
