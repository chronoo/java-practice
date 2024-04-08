package func;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        long c = 1;

        for (int j = 0; j <= rowIndex; j++) {
            list.add((int) c);
            c = c * (rowIndex - j) / (j + 1);
        }
        return list;
    }
}
