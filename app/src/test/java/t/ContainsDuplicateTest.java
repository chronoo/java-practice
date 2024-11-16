package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class ContainsDuplicateTest {
    ContainsDuplicate obj = new ContainsDuplicate();

    @Test
    void test1() {
        assertThat(obj.containsDuplicate(new int[]{1, 2, 3, 1})).isTrue();
    }

    @Test
    void test2() {
        assertThat(obj.containsDuplicate(new int[]{1, 2, 3, 4})).isFalse();
    }

    @Test
    void test3() {
        assertThat(obj.containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2})).isTrue();
    }
}