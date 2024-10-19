package t;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/find-kth-bit-in-nth-binary-string
 */
public class FindKthBitInNthBinaryString {
    public char findKthBit(int n, int k) {
        List<Boolean> list = new ArrayList<>();
        list.add(false);
        for (int i = 0; i < n; i++) {
            list = make(list);
        }
        return list.get(k - 1) ? '1' : '0';
    }

    private List<Boolean> make(List<Boolean> list) {
        List<Boolean> result = new ArrayList<>(list);
        result.add(true);
        result.addAll(list.reversed().stream().map(x -> !x).toList());
        return result;
    }
}
