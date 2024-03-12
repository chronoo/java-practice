package func;

public class AddBinary {
    public String addBinary(String a, String b) {
        int max = Math.max(a.length(), b.length());
        char[] res = new char[max];
        int rest = 0;
        for (int i = a.length() - 1, j = b.length() - 1, l = max - 1; i >= 0 || j >= 0; i--, j--, l--) {
            int x = i >= 0 ? a.charAt(i) - '0' : 0;
            int y = j >= 0 ? b.charAt(j) - '0' : 0;
            int sum = x + y + rest;
            if (sum > 1) {
                rest = 1;
            } else {
                rest = 0;
            }
            char currentDigit = (char) ('0' + sum % 2);
            res[l] = currentDigit;
        }
        return rest == 0 ? new String(res) : "1" + new String(res);
    }
}
