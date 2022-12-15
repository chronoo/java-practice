package ya;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class NotOddIterator implements Iterator<Integer> {
    private final Iterator<Integer> iterator;
    private int current;

    public NotOddIterator(Iterator<Integer> intIterator) {
        this.iterator = intIterator;
        current = -1;
    }

    @Override
    public boolean hasNext() {
        if (current % 2 == 0) return true;
        while (iterator.hasNext()) {
            current = iterator.next();
            if (current % 2 == 0) return true;
        }
        return false;
    }

    @Override
    public Integer next() {
        if (!hasNext()) throw new NoSuchElementException();
        int tmp = current;
        current = -1;
        return tmp;
    }
}
