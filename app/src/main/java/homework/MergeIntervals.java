package homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        return Arrays.stream(intervals)
                .sorted(Comparator.comparingInt(interval -> interval[0]))
                .reduce(new ArrayList<int[]>(),
                        (list, interval) -> {
                            if (list.isEmpty()) list.add(interval);
                            else {
                                int[] last = list.get(list.size() - 1);
                                if (last[1] < interval[0]) {
                                    list.add(interval);
                                } else {
                                    last[1] = Math.max(last[1], interval[1]);
                                }
                            }
                            return list;
                        }, (list1, list2) -> list1)
                .toArray(int[][]::new);
    }
}
