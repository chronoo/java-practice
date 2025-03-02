package t;

import java.util.ArrayList;

/**
 * https://leetcode.com/problems/merge-two-2d-arrays-by-summing-values
 */
public class MergeTwo2DArraysBySummingValues {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        var res = new ArrayList<int[]>();
        var nums1i = 0;
        var nums2i = 0;
        while (nums1i < nums1.length || nums2i < nums2.length) {
            var cur1 = nums1i < nums1.length ? nums1[nums1i] : new int[]{Integer.MAX_VALUE, 0};
            var cur2 = nums2i < nums2.length ? nums2[nums2i] : new int[]{Integer.MAX_VALUE, 0};
            if (cur1[0] == cur2[0]) {
                res.add(new int[]{cur1[0], cur1[1] + cur2[1]});
                nums1i++;
                nums2i++;
            } else if (cur1[0] < cur2[0]) {
                res.add(cur1);
                nums1i++;
            } else {
                res.add(cur2);
                nums2i++;
            }
        }
        return res.toArray(int[][]::new);
    }
}
