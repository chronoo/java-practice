package ya;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class NotOddIterator implements Iterator<Integer> {
    private final int[] nums;
    private int current = 0;

    public NotOddIterator(int[] nums) {
        if (nums == null) throw new IllegalArgumentException("argument is null");
        this.nums = nums;
    }

    @Override
    public boolean hasNext() {
        for (int i = current; i < nums.length; i++) {
            if (nums[i] % 2 == 0) return true;
        }
        return false;
    }

    @Override
    public Integer next() {
        for (int i = current; i < nums.length; i++) {
            int currentNum = nums[i];
            if (currentNum % 2 == 0) {
                current = i + 1;
                return currentNum;
            }
        }
        throw new NoSuchElementException();
    }
}
