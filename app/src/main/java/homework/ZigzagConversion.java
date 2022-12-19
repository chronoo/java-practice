package homework;

public class ZigzagConversion {
    public String convert(String s, int numRows) {
        StringBuilder sb = new StringBuilder();
        int circle = numRows + numRows - 2;
        int interval = circle == 0 ? 1 : circle;

        for (int rowIndex = 0; rowIndex < numRows; rowIndex++) {
            for (int current = rowIndex; current < s.length(); current += interval) {
                sb.append(s.charAt(current));

                boolean isFirst = rowIndex == 0;
                boolean isLast = rowIndex == numRows - 1;
                int twoHalfStepBack = rowIndex * 2;
                int tailIndex = current + interval - twoHalfStepBack;
                if (!isFirst && !isLast && tailIndex < s.length()) {
                    sb.append(s.charAt(tailIndex));
                }
            }
        }

        return sb.toString();
    }

    public String convert1(String s, int numRows) {
        if (numRows == 1) return s;
        int hMin = numRows - 2;
        int circle = numRows + hMin;

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i <= s.length() / circle; i++) {
            int index = i * circle;
            if (index < s.length()) builder.append(s.charAt(index));
        }

        for (int j = 1; j < circle / 2; j++) {
            for (int i = 0; i <= s.length() / circle; i++) {
                int index1 = i * circle + j;
                int index2 = (i+1) * circle - j;
                if (index1 < s.length() && index1 > 0) builder.append(s.charAt(index1));
                if (index2 < s.length()) builder.append(s.charAt(index2));
            }
        }

        for (int i = 0; i <= s.length() / circle; i++) {
            int index = i * circle + circle / 2;
            if (index < s.length()) builder.append(s.charAt(index));
        }

        return builder.toString();
    }
}
