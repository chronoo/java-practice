package homework;

import java.util.HashMap;
import java.util.LinkedList;

public class CustomLRUCache {
    private final int capacity;
    private final LinkedList<Integer> integers = new LinkedList<>();
    private final HashMap<Integer, Integer> map = new HashMap<>();

    public CustomLRUCache(int capacity) {
        this.capacity = capacity;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            integers.remove((Integer) key);
            map.remove(key);
        }
        if (map.size() > capacity - 1) {
            Integer removedKey = integers.removeLast();
            map.remove(removedKey);
        }
        integers.offerFirst(key);
        map.put(key, value);
    }

    public Integer get(int key) {
        Integer value = map.get(key);
        if (value != null) {
            integers.remove((Integer) key);
            integers.offerFirst(key);
            return map.get(key);
        }
        return -1;
    }
}
