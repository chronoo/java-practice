package homework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringToInteger {
    public int myAtoi(String s) {
        String resultString = "0";
        Pattern pattern = Pattern.compile("^ *([-+]?)0*([0-9]+)");
        Matcher matcher = pattern.matcher(s);
        if (matcher.find()) {
            resultString = matcher.group(1);

            if (matcher.groupCount() > 1)
                resultString += matcher.group(2);
        }

        if (resultString.length() > 11) {
            if (resultString.charAt(0) == '-') return Integer.MIN_VALUE;
            return Integer.MAX_VALUE;
        }
        try {
            long l = Long.parseLong(resultString);
            if (l > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (l < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            return Integer.parseInt(resultString);
        } catch (Exception e) {
            return 0;
        }
    }
}
