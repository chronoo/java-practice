package t;

/**
 * https://leetcode.com/problems/divisible-and-non-divisible-sums-difference/
 */
public class DivisibleAndNonDivisibleSumsDifference {
    public int differenceOfSums(int n, int m) {
        return (n * (n + 1)) / 2 - (2 * (m * (n / m) * (n / m + 1) / 2));
    }
}
