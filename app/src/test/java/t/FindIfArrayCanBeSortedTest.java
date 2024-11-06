package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class FindIfArrayCanBeSortedTest {
    FindIfArrayCanBeSorted obj = new FindIfArrayCanBeSorted();

    @Test
    void test1() {
        assertThat(obj.canSortArray(new int[]{8, 4, 2, 30, 15})).isTrue();
    }

    @Test
    void test2() {
        assertThat(obj.canSortArray(new int[]{1, 2, 3, 4, 5})).isTrue();
    }

    @Test
    void test3() {
        assertThat(obj.canSortArray(new int[]{3, 16, 8, 4, 2})).isFalse();
    }
}