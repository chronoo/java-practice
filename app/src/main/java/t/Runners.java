package t;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Runners {
    public List<Integer> findChampions(Rec[][] recs) {
        return Arrays.stream(recs)
            .flatMap(rec -> {
                var max = Arrays.stream(rec)
                    .mapToInt(x -> x.step)
                    .max()
                    .orElse(0);
                return Arrays.stream(rec).filter(x -> x.step == max);
            }).collect(Collectors.groupingBy(x -> x.id))
            .entrySet()
            .stream()
            .filter(x -> x.getValue().size() == recs.length)
            .map(Map.Entry::getKey)
            .toList();
    }

    public static class Rec {
        final int id;
        final int step;

        public Rec(int id, int step) {
            this.id = id;
            this.step = step;
        }
    }
}
