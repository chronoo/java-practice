package structure;

import java.util.HashMap;
import java.util.Map;

public class MultiSet {
    private final Map<String, Integer> counts = new HashMap<>();

    public void add(String key) {
        Integer count = counts.get(key);
        if (count == null) count = 0;
        counts.put(key, count + 1);
    }

    public void add1(String key) {
        counts.put(key, counts.computeIfAbsent(key, k -> 0) + 1);
    }

    public void add2(String key) {
        counts.merge(key, 1, (a, b) -> a + b);
    }
}
