package t;

/**
 * https://leetcode.com/problems/the-two-sneaky-numbers-of-digitville
 */
public class TheTwoSneakyNumbersOfDigitville {
    public int[] getSneakyNumbers(int[] nums) {
        var freq = new int[nums.length];
        var res = new int[2];
        for (int num : nums) {
            freq[num]++;
            if (freq[num] == 2) {
                if (res[0] == 0) res[0] = num; else res[1] = num;
            }
        }
        return res;
    }
}
