package t;

/**
 * https://leetcode.com/problems/sort-the-people
 */
public class SortThePeople {
    public String[] sortPeople(String[] names, int[] heights) {
        for (var i = 0; i < names.length; i++) {
            for (var j = 0; j < names.length - i - 1; j++) {
                if (heights[j] < heights[j + 1]) {
                    var temp = heights[j + 1];
                    heights[j + 1] = heights[j];
                    heights[j] = temp;
                    String t = names[j + 1];
                    names[j + 1] = names[j];
                    names[j] = t;
                }
            }
        }
        return names;
    }
}
