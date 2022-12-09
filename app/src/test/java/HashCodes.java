import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

class HashCodes
{
    @Test
    void test() {
        Set<Long> set = LongStream.range(0, 1_000_000)
                .boxed()
                .collect(Collectors.toSet());

        for (long i = 0; i < 1_000_000; i++) {
            if (!set.contains(i)) Assertions.fail();
        }
    }

    @Test
    void test2() {
        Obj a = new Obj(1);
        Obj b = new Obj(2);

        Set<Obj> set = new HashSet<>();
        set.add(a);
        set.add(b);
        System.out.println(set);

        HashMap<Obj, Object> map = new HashMap<>();
        map.put(a, 1);
        map.put(b, "C");
        System.out.println(map);

        Set<Obj> objSet = new TreeSet<>(Comparator.comparingLong(Obj::getVal));
        objSet.add(a);
        objSet.add(b);
        System.out.println(objSet);

        Set<Obj> objSet1 = new LinkedHashSet<>();
        objSet1.add(a);
        objSet1.add(b);
        System.out.println(objSet1);

        System.out.println(Stream.of(a, b).collect(Collectors.toSet()));
    }
}

class Obj {
    private final long val;

    public Obj(long val) {
        this.val = val;
    }

    @Override
    public int hashCode() {
        return Long.hashCode(val);
    }

    public long getVal() {
        return val;
    }

    @Override
    public boolean equals(Object obj) {
        return true;
//        if (obj instanceof Obj) {
//            return ((Obj) obj).val == val;
//        }
//        return false;
    }
}
