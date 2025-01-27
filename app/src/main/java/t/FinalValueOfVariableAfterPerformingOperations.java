package t;

/**
 * https://leetcode.com/problems/final-value-of-variable-after-performing-operations
 */
public class FinalValueOfVariableAfterPerformingOperations {
    public int finalValueAfterOperations(String[] operations) {
        var res = 0;
        for (String operation : operations) {
            switch (operation) {
                case "--X" -> --res;
                case "X--" -> res--;
                case "++X" -> ++res;
                case "X++" -> res++;
            }
        }
        return res;
    }
}
