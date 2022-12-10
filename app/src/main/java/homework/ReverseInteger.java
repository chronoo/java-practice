package homework;

public class ReverseInteger {
    public int reverse_old(int x) {
        String num = new StringBuilder()
                .append(Math.abs(x))
                .reverse().toString();
        try {
            int res = Integer.parseInt(num);
            return x < 0 ? -res : res;
        } catch (Exception e) {
            return 0;
        }
    }

    public int reverse(int x) {
        int mult = x >= 0 ? 1 : -1;
        int res = 0;
        x *= mult;
        while (x > 0) {
            int top = x % 10;
            x /= 10;
            res = res * 10 + top;
        }
        res *= mult;
        return res;
    }
}
