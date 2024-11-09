package t;

/**
 * https://leetcode.com/problems/excel-sheet-column-number
 */
public class ExcelSheetColumnNumber {
    public int titleToNumber(String columnTitle) {
        int length = columnTitle.length();
        if (length == 1) return columnTitle.charAt(0) + 1 - 'A';
        return titleToNumber(Character.toString(columnTitle.charAt(length - 1))) + titleToNumber(columnTitle.substring(0, length - 1)) * 26;
    }
}
