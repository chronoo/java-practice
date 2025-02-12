package t;

/**
 * https://leetcode.com/problems/max-sum-of-a-pair-with-equal-sum-of-digits
 */
public class MaxSumOfAPairWithEqualSumOfDigits {
    public int maximumSum(int[] nums) {
        var sums = new int[100][2];
        for (var num : nums) {
            var curSum = calcSum(num);
            if (num >= sums[curSum][0]) {
                sums[curSum][1] = sums[curSum][0];
                sums[curSum][0] = num;
            } else if (num > sums[curSum][1]) {
                sums[curSum][1] = num;
            }
        }
        var res = -1;
        for (var sum : sums) {
            if (sum[1] > 0) {
                if (sum[1] + sum[0] > res) res = sum[1] + sum[0];
            }
        }
        return res;
    }

    private static int calcSum(int num) {
        var curSum = 0;
        while (num >= 10) {
            curSum += num % 10;
            num /= 10;
        }
        return curSum + num;
    }
}
