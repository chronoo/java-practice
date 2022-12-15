package ya;

import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class NotOddIteratorTest {
    @Test
    void test1() {
        List<Integer> list = new ArrayList<>();
        NotOddIterator iterator = new NotOddIterator(List.of(1, 2, 3, 4).iterator());
        while (iterator.hasNext()) {
            list.add(iterator.next());
        }
        assertThat(list).isEqualTo(List.of(2,4));
    }

    @Test
    void test2() {
        List<Integer> list = new ArrayList<>();
        NotOddIterator iterator = new NotOddIterator(List.of(1).iterator());
        while (iterator.hasNext()) {
            list.add(iterator.next());
        }
        assertThat(list).isEqualTo(List.of());
    }

    @Test
    void test3() {
        List<Integer> list = new ArrayList<>();
        NotOddIterator iterator = new NotOddIterator(List.of(2).iterator());
        while (iterator.hasNext()) {
            list.add(iterator.next());
        }
        assertThat(list).isEqualTo(List.of(2));
    }

    @Test
    void test4() {
        List<Integer> list = new ArrayList<>();
        NotOddIterator iterator = new NotOddIterator(List.of(-2).iterator());
        while (iterator.hasNext()) {
            list.add(iterator.next());
        }
        assertThat(list).isEqualTo(List.of(-2));
    }

    @Test
    void test5() {
        List<Integer> list = new ArrayList<>();
        NotOddIterator iterator = new NotOddIterator(List.of(-4,-5,-6,-7,-8).iterator());
        while (iterator.hasNext()) {
            list.add(iterator.next());
        }
        assertThat(list).isEqualTo(List.of(-4, -6, -8));
    }

    @Test
    void test6() {
        List<Integer> list = new ArrayList<>();
        NotOddIterator iterator = new NotOddIterator(List.of(-3,-5,-7, 0).iterator());
        while (iterator.hasNext()) {
            list.add(iterator.next());
        }
        assertThat(list).isEqualTo(List.of(0));
    }

    @Test
    void test7() {
        List<Integer> list = new ArrayList<>();
        NotOddIterator iterator = new NotOddIterator(List.of(-3,-5,-7).iterator());
        while (iterator.hasNext()) {
            list.add(iterator.next());
        }
        assertThat(list).isEqualTo(List.of());
    }

    @Test
    void test8() {
        List<Integer> list = new ArrayList<>();
        NotOddIterator iterator = new NotOddIterator(List.<Integer>of().iterator());
        while (iterator.hasNext()) {
            list.add(iterator.next());
        }
        assertThat(list).isEqualTo(List.of());
    }

    @Test
    void test9() {
        AtomicInteger integer = new AtomicInteger();

        NotOddIterator iterator = new NotOddIterator(
                IntStream.generate(integer::incrementAndGet)
                        .iterator()
        );

        for (int i = 0; i < 10; i++) {
            if (iterator.hasNext()) System.out.println(iterator.next());
        }
    }
}