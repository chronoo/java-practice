package generic.exceptions;

import java.io.Serializable;
import java.util.*;

@SuppressWarnings("unchecked")
public class ListGen {
    public void doIt(List<String>... list) {
        System.out.println(list);
    }

    public void doThis() {
        List<? extends Number> numbers = List.of(1L, 2L);
        for (Number number : numbers) {
            System.out.println(number);
        }

        System.out.println(numbers);

        List<? super Number> numbers2 = new ArrayList<>();
        numbers2.add(1L);
        numbers2.add(2);
        numbers2.add(3.0);

        numbers2.forEach(o -> {
            System.out.println(o);
        });

        Comparator<Object> integerComparator = (o1, o2) -> 1;
        max(List.of(1,2,3), integerComparator);
    }

    public static <T> T max (Collection<? extends T> coll, Comparator<? super T> comp) {
        if (comp==null)
            return (T)max((Collection) coll);

        Iterator<? extends T> i = coll.iterator();
        T candidate = i.next();

        while (i.hasNext()) {
            T next = i.next();
            if (comp.compare(next, candidate) > 0)
                candidate = next;
        }
        return candidate;
    }

    public static <T extends Object & Comparable<? super T>> T max(Collection<? extends T> coll) {
        Iterator<? extends T> i = coll.iterator();
        T candidate = i.next();

        while (i.hasNext()) {
            T next = i.next();
            if (next.compareTo(candidate) > 0)
                candidate = next;
        }
        return candidate;
    }

    public void doIt2() {
        Helper<?> helper = new Helper<>();
        List<Integer> numbers = helper.numbers();
        for (Integer number : numbers) {
            System.out.println(number);
        }
        List<?> list = new ArrayList<Object>();

    }

    public static void main(String[] args) {
        String string = "";
        System.out.println(string);
    }

    private static <T extends List<Integer>> T newList() {
        return (T) List.of(1,2,3);
    }
}

interface DoIt {
    Integer count();
}

class Helper<T> {
    public List<Integer> numbers() {
        return List.of(1,2);
    }
}
