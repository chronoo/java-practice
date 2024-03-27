package func;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        var result = new ArrayList<List<Integer>>();
        if (numRows == 0) return result;
        result.add(List.of(1));
        for (int i = 1; i < numRows; i++) {
            var prev = result.get(i - 1);
            var curList = new ArrayList<Integer>(i+1);
            curList.add(1);
            for (int j = 1; j < i; j++) {
                curList.add(prev.get(j - 1) + (prev.size() > j ? prev.get(j) : 0));
            }
            curList.add(1);
            result.add(curList);
        }
        return result;
    }
}
