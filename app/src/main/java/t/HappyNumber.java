package t;

import java.util.HashSet;

/**
 * https://leetcode.com/problems/happy-number
 */
public class HappyNumber {
    public boolean isHappy(int n) {
        var mem = new HashSet<Integer>();
        do {
            var sum = 0;
            while (n > 0) {
                var div = n % 10;
                sum += div * div;
                n /= 10;
            }
            if (sum == 1) return true;
            if (mem.contains(sum)) return false;
            mem.add(sum);
            n = sum;
        } while (true);
    }
}
