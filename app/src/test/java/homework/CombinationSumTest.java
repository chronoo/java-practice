package homework;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CombinationSumTest {
    private final CombinationSum obj = new CombinationSum();

    @Test
    void test1() {
        assertThat(obj.combinationSum(new int[]{2, 3, 6, 7}, 7))
                .isEqualTo(List.of(
                                List.of(2, 2, 3),
                                List.of(7)
                        )
                );
    }

    @Test
    void test2() {
        assertThat(obj.combinationSum(new int[]{2, 3, 5}, 8))
                .isEqualTo(List.of(
                                List.of(2, 2, 2, 2),
                                List.of(2, 3, 3),
                                List.of(3, 5)
                        )
                );
    }

    @Test
    void test3() {
        assertThat(obj.combinationSum(new int[]{2}, 1))
                .isEqualTo(List.of());
    }
}