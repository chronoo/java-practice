package t;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/check-if-n-and-its-double-exist
 */
public class CheckIfNAndItsDoubleExist {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        var left = 0;
        var right = 1;
        while (right < arr.length && left < arr.length) {
            int first = arr[left];
            int second = arr[right];
            if (first * 2 == second) return true;
            else if (second * 2 == first) return true;
            else if (first > 0 && first * 2 < second) left++;
            else if (first <= 0 && first < second * 2) left++;
            else right++;
            if (left == right) right++;
        }
        return false;
    }
}
