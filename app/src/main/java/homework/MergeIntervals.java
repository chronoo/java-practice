package homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        return Arrays.stream(intervals)
                .sorted(Comparator.comparingInt(interval -> interval[0]))
                .reduce(new ArrayList<>(),
                        MergeIntervals::addToList,
                        (list1, list2) -> list1)
                .toArray(int[][]::new);
    }

    private static List<int[]> addToList(List<int[]> list, int[] interval) {
        if (list.isEmpty()) {
            list.add(interval);
        } else {
            int[] last = list.get(list.size() - 1);
            if (last[1] < interval[0]) {
                list.add(interval);
            } else {
                last[1] = Math.max(last[1], interval[1]);
            }
        }
        return list;
    }
}
