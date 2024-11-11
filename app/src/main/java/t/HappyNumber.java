package t;

import java.util.HashSet;

/**
 * https://leetcode.com/problems/happy-number
 */
public class HappyNumber {
    public boolean isHappy(int n) {
        var mem = new HashSet<Integer>();
        int remain = n;
        do {
            var sum = 0;
            while (remain >= 10) {
                var div = remain % 10;
                sum += div * div;
                remain /= 10;
            }
            sum += remain * remain;
            if (sum == 1) return true;
            if (mem.contains(sum)) return false;
            mem.add(sum);
            remain = sum;
        } while (true);
    }
}
