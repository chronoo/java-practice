package t;

/**
 * https://leetcode.com/problems/number-of-employees-who-met-the-target
 */
public class NumberOfEmployeesWhoMetTheTarget {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        var count = 0;
        for (var hour : hours) if (hour >= target) count++;
        return count;
    }
}
