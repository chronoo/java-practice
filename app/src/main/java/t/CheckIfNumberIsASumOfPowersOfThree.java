package t;

/**
 * https://leetcode.com/problems/check-if-number-is-a-sum-of-powers-of-three
 */
public class CheckIfNumberIsASumOfPowersOfThree {
    public boolean checkPowersOfThree(int n) {
        return !Integer.toString(n, 3).contains("2");
    }
}
