package structure;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class HashCodes {
    public static void main(String[] args) {
        Map<String, String> map = new WeakHashMap<>();
        map.put("1", "2");

        Set<Long> set = LongStream.range(0, Long.MAX_VALUE)
                .boxed()
                .collect(Collectors.toSet());
    }
}
