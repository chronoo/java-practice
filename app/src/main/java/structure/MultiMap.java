package structure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MultiMap {
    private final Map<String, List<String>> map = new HashMap<>();

    public void add(String key, String value) {
        map.computeIfAbsent(key, k -> new ArrayList<>())
                .add(value);
    }

    public List<String> get(String key) {
        return map.get(key);
    }
}
