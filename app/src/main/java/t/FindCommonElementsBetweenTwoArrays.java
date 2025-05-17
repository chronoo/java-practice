package t;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * https://leetcode.com/problems/find-common-elements-between-two-arrays
 */
public class FindCommonElementsBetweenTwoArrays {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        var firstFreq = calcFreq(nums1);
        var secondFreq = calcFreq(nums2);
        var firstCount = calcCount(firstFreq, secondFreq);
        var secondCount = calcCount(secondFreq, firstFreq);
        return new int[]{secondCount, firstCount};
    }

    private static int calcCount(Map<Integer, Long> firstFreq, Map<Integer, Long> secondFreq) {
        return (int) firstFreq.keySet().stream()
                .mapToLong(integer -> secondFreq.getOrDefault(integer, 0L))
                .sum();
    }

    private static Map<Integer, Long> calcFreq(int[] nums) {
        return Arrays.stream(nums).boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}
