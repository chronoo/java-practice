package homework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Combinations {
    public List<List<Integer>> resolve(int[] numbers, int count) {
        List<List<Integer>> result = new ArrayList<>();
        resolve(result, numbers, count, new LinkedList<>(), 0, -1);
        return result;
    }

    private void resolve(List<List<Integer>> result, int[] numbers, int count, LinkedList<Integer> integers, int level, int numberI) {
        if (level == count) {
            result.add(new ArrayList<>(integers));
            return;
        }

        for (int i = numberI + 1; i < numbers.length; i++) {
            int number = numbers[i];
            integers.addLast(number);
            resolve(result, numbers, count, integers, level + 1, i);
            integers.pollLast();
        }
    }
}
