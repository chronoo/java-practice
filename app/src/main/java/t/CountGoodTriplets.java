package t;

/**
 * https://leetcode.com/problems/count-good-triplets
 */
public class CountGoodTriplets {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        var count = 0;
        for (var i = 0; i < arr.length - 2; i++) {
            for (var j = i + 1; j < arr.length - 1; j++) {
                if (Math.abs(arr[i] - arr[j]) > a) continue;
                for (var y = j + 1; y < arr.length; y++) {
                    if (Math.abs(arr[j] - arr[y]) > b) continue;
                    if (Math.abs(arr[i] - arr[y]) > c) continue;
                    count++;
                }
            }
        }
        return count;
    }
}
