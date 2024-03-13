package func;

public class FindThePivotInteger {
    public int pivotInteger(int n) {
        double x = Math.sqrt((n * n + n) / 2.0);
        return x % 1.0 == 0.0 ? (int) x : -1;
    }
}
