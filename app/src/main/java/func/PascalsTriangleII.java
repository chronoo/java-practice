package func;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> prev = List.of(1);
        if (rowIndex == 0) return prev;
        List<Integer> curr = new ArrayList<>();
        for (int i = 0; i < rowIndex; i++) {
            curr = new ArrayList<>();
            curr.add(1);
            for (int j = 0; j < i; j++) {
                curr.add(prev.get(j) + prev.get(j + 1));
            }
            curr.add(1);
            prev = curr;
        }
        return curr;
    }
}
