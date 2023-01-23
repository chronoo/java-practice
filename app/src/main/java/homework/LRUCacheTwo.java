package homework;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;

import java.util.Optional;

public class LRUCacheTwo {
    private final Cache<Integer, Integer> cache;

    public LRUCacheTwo(int capacity) {
        cache = CacheBuilder.newBuilder()
                .maximumSize(capacity)
                .build();
    }

    public void put(int key, int value) {
        cache.put(key, value);
    }

    public int get(int key) {
        return Optional.ofNullable(cache.getIfPresent(key))
                .orElse(-1);
    }
}
