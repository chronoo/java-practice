package ya;

public class Sequence {
    public static long min(int[] nums) {
        if (nums == null || nums.length < 2)
            throw new IllegalArgumentException("incorrect input");

        int min = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int current = nums[i];
            if (current < min) min = current;
            if (current > max) max = current;
        }

        if (min >= 0) {
            int delta = Integer.MAX_VALUE;
            for (int num : nums) {
                int currentDelta = num - min;
                if (currentDelta < delta && currentDelta > 0) {
                    delta = currentDelta;
                    max = num;
                }
            }
        }
        else {
            if (max < 0) {
                int delta = Integer.MIN_VALUE;
                for (int num : nums) {
                    int currentDelta = num - max;
                    if (currentDelta > delta && currentDelta < 0) {
                        delta = currentDelta;
                        min = num;
                    }
                }
            }
        }

        return (long) min * max;
    }
}
