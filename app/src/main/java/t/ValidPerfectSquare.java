package t;

/**
 * https://leetcode.com/problems/valid-perfect-square
 */
public class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        var left = 1;
        var right = num;
        while (right > left) {
            var med = left + (right - left) / 2;
            var square = (long) med * med;
            if (square > num) right = med -1;
            else if (square < num) left = med + 1;
            else return true;
        }
        return right * right == num;
    }
}
