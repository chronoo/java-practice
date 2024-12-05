package t;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/power-of-three
 */
public class PowerOfThree {
    Set<Integer> threes = makeThrees();

    public boolean isPowerOfThree(int n) {
        return threes.contains(n);
    }

    private Set<Integer> makeThrees() {
        var threess = new HashSet<Integer>();
        int three = 1;
        do {
            threess.add(three);
            three *= 3;
        } while (three > 0);
        return threess;
    }
}
