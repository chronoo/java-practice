package t;

/**
 * https://leetcode.com/problems/excel-sheet-column-title
 */
public class ExcelSheetColumnTitle {
    public String convertToTitle(int columnNumber) {
        if (columnNumber <= 26) return Character.toString('A' + columnNumber - 1);
        else return convertToTitle((columnNumber - 1) / 26) + Character.toString('A' + (columnNumber - 1) % 26);
    }
}
