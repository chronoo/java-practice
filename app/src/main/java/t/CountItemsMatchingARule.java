package t;

import java.util.List;

/**
 * https://leetcode.com/problems/count-items-matching-a-rule
 */
public class CountItemsMatchingARule {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        var index = getIndex(ruleKey);
        return (int) items.stream().filter(x -> ruleValue.equals(x.get(index))).count();
    }

    private static int getIndex(String ruleKey) {
        return switch (ruleKey) {
            case "type" -> 0;
            case "color" -> 1;
            case "name" -> 2;
            default -> throw new IllegalArgumentException();
        };
    }
}
