package func;

import java.util.Arrays;

public class SingleNumber {
    public int singleNumber(int[] n) {
        int res = n[0];
        for (int i = 1; i < n.length; i++) {
            res = res ^ n[i];
        }
        return res;
    }
}
