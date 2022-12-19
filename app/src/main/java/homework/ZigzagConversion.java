package homework;

public class ZigzagConversion {
    public String convert(String s, int numRows) {
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
