package t;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/intersection-of-two-arrays
 */
public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0, j = 0, index = 0;
        int[] result = new int[Math.min(nums1.length, nums2.length)];

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                result[index++] = nums1[i];
                i++;
                j++;
                while (i < nums1.length && nums1[i] == nums1[i - 1]) {
                    i++;
                }
                while (j < nums2.length && nums2[j] == nums2[j - 1]) {
                    j++;
                }
            }
        }
        return Arrays.copyOf(result, index);
    }
}
