package t;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/final-value-of-variable-after-performing-operations
 */
public class FinalValueOfVariableAfterPerformingOperations {
    public int finalValueAfterOperations(String[] operations) {
        return Arrays.stream(operations).mapToInt(x -> 44 - x.charAt(1)).sum();
    }
}
