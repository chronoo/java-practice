package t;

/**
 * https://leetcode.com/problems/sum-of-all-odd-length-subarrays
 */
public class SumOfAllOddLengthSubarrays {
    public int sumOddLengthSubarrays(int[] arr) {
        var sum = 0;
        for (var i = 0; i < arr.length; i++) {
            var cur = 0;
            var x = 0;
            for (var j = i; j < arr.length; j++, x++) {
                cur += arr[j];
                if (x % 2 == 0) sum += cur;
            }
        }
        return sum;
    }
}
