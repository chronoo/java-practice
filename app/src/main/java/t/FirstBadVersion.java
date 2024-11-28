package t;

/**
 * https://leetcode.com/problems/first-bad-version
 */
public class FirstBadVersion {
    private final int bad;

    public FirstBadVersion(int bad) {
        this.bad = bad;
    }

    public int firstBadVersion(int n) {
        var left = 1;
        var right = n;

        while (left < right) {
            var mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return right;
    }

    boolean isBadVersion(int version) {
        return version >= bad;
    }
}
