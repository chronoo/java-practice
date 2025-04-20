package t;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SumOfValuesAtIndicesWithKSetBitsTest {
    SumOfValuesAtIndicesWithKSetBits obj = new SumOfValuesAtIndicesWithKSetBits();

    @Test
    void test1() {
        assertThat(obj.sumIndicesWithKSetBits(List.of(5, 10, 1, 5, 2), 1)).isEqualTo(13);
    }

    @Test
    void test2() {
        assertThat(obj.sumIndicesWithKSetBits(List.of(4,3,2,1), 2)).isEqualTo(1);
    }
}