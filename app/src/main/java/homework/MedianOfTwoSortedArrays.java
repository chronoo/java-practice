package homework;

public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int total = nums1.length + nums2.length;
        int first = total / 2;
        int x = 0;
        int y = 0;
        int overall = 0;
        int firstResult = 0;
        int next = 0;
        while (overall <= first) {
            next = firstResult;
            if (x < nums1.length && y < nums2.length) {
                if (nums1[x] < nums2[y]) {
                    firstResult = nums1[x];
                    x++;
                } else {
                    firstResult = nums2[y];
                    y++;
                }
            } else if (x < nums1.length) {
                firstResult = nums1[x];
                x++;
            } else {
                firstResult = nums2[y];
                y++;
            }
            overall++;
        }

        if (total % 2 == 1) return firstResult;
        return (firstResult + next) / 2.0;
    }
}
