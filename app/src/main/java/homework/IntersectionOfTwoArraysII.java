package homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list = new ArrayList<>();

        int j = 0;
        for (int first : nums1) {
            for (int k = j; k < nums2.length; k++) {
                int second = nums2[k];
                if (first == second) {
                    j = k + 1;
                    list.add(second);
                    break;
                }
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
