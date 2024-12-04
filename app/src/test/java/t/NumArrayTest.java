package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class NumArrayTest {
    @Test
    void test1() {
        var array = new NumArray(new int[]{-2, 0, 3, -5, 2, -1});
        assertThat(array.sumRange(0, 2)).isEqualTo(1);
        assertThat(array.sumRange(2, 5)).isEqualTo(-1);
        assertThat(array.sumRange(0, 5)).isEqualTo(-3);
    }
}