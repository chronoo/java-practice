package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class ContainsDuplicateIITest {
    ContainsDuplicateII obj = new ContainsDuplicateII();

    @Test
    void test1() {
        assertThat(obj.containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3)).isTrue();
    }

    @Test
    void test2() {
        assertThat(obj.containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1)).isTrue();
    }

    @Test
    void test3() {
        assertThat(obj.containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2)).isFalse();
    }
}