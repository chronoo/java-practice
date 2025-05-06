package t;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/cells-in-a-range-on-an-excel-sheet
 */
public class CellsInARangeOnAnExcelSheet {
    public List<String> cellsInRange(String s) {
        var res = new ArrayList<String>();
        for (char i = s.charAt(0); i <= s.charAt(3); i++) {
            for (char j = s.charAt(1); j <= s.charAt(4); j++) {
                res.add(new String(new char[]{i, j}));
            }
        }
        return res;
    }
}
