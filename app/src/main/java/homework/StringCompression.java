package homework;

public class StringCompression {
    public int compress(char[] chars) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = 0; i <= chars.length; i++) {
            if (i == 0 || i < chars.length && chars[i] == chars[i - 1]) {
                count++;
            } else {
                sb.append(chars[i - 1]);
                if (count > 1) {
                    sb.append(count);
                }
                count = 1;
            }
        }
        String out = sb.toString();
        System.arraycopy(out.toCharArray(), 0, chars, 0, out.length());
        return out.length();
    }

    public int compress2(char[] chars) {
        if (chars.length == 1) return 1;
        StringBuilder sb = new StringBuilder();
        int count = 1;
        char current;
        char next = 0;
        for (int i = 0; i < chars.length - 1; i++) {
            current = chars[i];
            next = chars[i + 1];
            if (current == next) {
                count++;
            } else {
                sb.append(current);
                if (count > 1) sb.append(count);
                count = 1;
            }
        }
        sb.append(next);
        if (count > 1) sb.append(count);
        String out = sb.toString();
        System.arraycopy(out.toCharArray(), 0, chars, 0, out.length());
        return out.length();
    }
}
