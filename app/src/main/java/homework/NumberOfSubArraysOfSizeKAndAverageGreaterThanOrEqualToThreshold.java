package homework;

public class NumberOfSubArraysOfSizeKAndAverageGreaterThanOrEqualToThreshold {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count = 0;
        for (int i = 0; i <= arr.length - k; i++) {
            if (sum(arr, i, k) >= threshold*k) {
                count++;
            }
        }
        return count;
    }

    private int sum(int[] arr, int i, int k) {
        int sum = 0;
        for (int j = i; j < i + k; j++) {
            sum += arr[j];
        }
        return sum;
    }
}
