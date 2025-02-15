package t;

/**
 * https://leetcode.com/problems/find-the-punishment-number-of-an-integer
 */
public class FindThePunishmentNumberOfAnInteger {
    public int punishmentNumber(int n) {
        var res = 0;
        var nums = new int[]{1, 9, 10, 36, 45, 55, 82, 91, 99, 100, 235, 297, 369, 370, 379, 414, 657, 675, 703, 756, 792, 909, 918, 945, 964, 990, 991, 999, 1000};
        for (var num : nums) {
            if (num > n) break;
            res += num * num;
        }
        return res;
    }
}
