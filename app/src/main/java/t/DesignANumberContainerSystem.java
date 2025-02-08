package t;

import java.util.*;

/**
 * https://leetcode.com/problems/design-a-number-container-system
 */
public class DesignANumberContainerSystem {
    public static class NumberContainers {
        private Map<Integer, Integer> cells = new HashMap<>();
        private Map<Integer, TreeSet<Integer>> fields = new HashMap<>();

        public void change(int index, int number) {
            var prev = cells.get(index);
            if (prev != null) {
                if (prev == number) return;
                var integers = fields.get(prev);
                integers.remove(index);
                if (integers.isEmpty()) fields.remove(prev);
            }
            fields.putIfAbsent(number, new TreeSet<>());
            fields.get(number).add(index);
            cells.put(index, number);
        }

        public int find(int number) {
            var res = fields.get(number);
            if (res != null) return res.first();
            return -1;
        }
    }
}
