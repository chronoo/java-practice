package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class MaximumStrongPairXORITest {
    MaximumStrongPairXORI obj = new MaximumStrongPairXORI();

    @Test
    void test1() {
        assertThat(obj.maximumStrongPairXor(new int[]{1, 2, 3, 4, 5})).isEqualTo(7);
    }

    @Test
    void test2() {
        assertThat(obj.maximumStrongPairXor(new int[]{10, 100})).isEqualTo(0);
    }

    @Test
    void test3() {
        assertThat(obj.maximumStrongPairXor(new int[]{5, 6, 25, 30})).isEqualTo(7);
    }
}