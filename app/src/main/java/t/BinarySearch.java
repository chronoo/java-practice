package t;

/**
 * https://leetcode.com/problems/binary-search/description
 */
public class BinarySearch {
    public int search(int[] nums, int target) {
        var left = 0;
        var right = nums.length - 1;
        while (left <= right) {
            var middle = left + (right - left)/2;
            var middleNum = nums[middle];
            if (middleNum < target) left = middle + 1;
            else if (middleNum > target) right = middle-1;
            else return middle;
        }
        return -1;
    }
}
