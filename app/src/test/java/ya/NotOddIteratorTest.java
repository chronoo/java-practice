package ya;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class NotOddIteratorTest {
    @Test
    void test1() {
        List<Integer> list = new ArrayList<>();
        NotOddIterator iterator = new NotOddIterator(new int[]{1, 2, 3, 4});
        while (iterator.hasNext()) {
            list.add(iterator.next());
        }
        assertThat(list).isEqualTo(List.of(2,4));
    }

    @Test
    void test2() {
        List<Integer> list = new ArrayList<>();
        NotOddIterator iterator = new NotOddIterator(new int[]{1});
        while (iterator.hasNext()) {
            list.add(iterator.next());
        }
        assertThat(list).isEqualTo(List.of());
    }

    @Test
    void test3() {
        List<Integer> list = new ArrayList<>();
        NotOddIterator iterator = new NotOddIterator(new int[]{2});
        while (iterator.hasNext()) {
            list.add(iterator.next());
        }
        assertThat(list).isEqualTo(List.of(2));
    }

    @Test
    void test4() {
        List<Integer> list = new ArrayList<>();
        NotOddIterator iterator = new NotOddIterator(new int[]{-2});
        while (iterator.hasNext()) {
            list.add(iterator.next());
        }
        assertThat(list).isEqualTo(List.of(-2));
    }

    @Test
    void test5() {
        List<Integer> list = new ArrayList<>();
        NotOddIterator iterator = new NotOddIterator(new int[]{-4,-5,-6,-7,-8});
        while (iterator.hasNext()) {
            list.add(iterator.next());
        }
        assertThat(list).isEqualTo(List.of(-4, -6, -8));
    }

    @Test
    void test6() {
        List<Integer> list = new ArrayList<>();
        NotOddIterator iterator = new NotOddIterator(new int[]{-3,-5,-7, 0});
        while (iterator.hasNext()) {
            list.add(iterator.next());
        }
        assertThat(list).isEqualTo(List.of(0));
    }

    @Test
    void test7() {
        List<Integer> list = new ArrayList<>();
        NotOddIterator iterator = new NotOddIterator(new int[]{-3,-5,-7});
        while (iterator.hasNext()) {
            list.add(iterator.next());
        }
        assertThat(list).isEqualTo(List.of());
    }

    @Test
    void test8() {
        List<Integer> list = new ArrayList<>();
        NotOddIterator iterator = new NotOddIterator(new int[]{});
        while (iterator.hasNext()) {
            list.add(iterator.next());
        }
        assertThat(list).isEqualTo(List.of());
    }
}