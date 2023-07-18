package homework;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CombinationSumIITest {

    private final CombinationSumII obj = new CombinationSumII();

    @Test
    void test1() {
        assertThat(obj.combinationSum2(new int[]{
                10, 1, 2, 7, 6, 1, 5
        }, 8)).isEqualTo(List.of(
                        List.of(1, 1, 6),
                        List.of(1, 2, 5),
                        List.of(1, 7),
                        List.of(2, 6)
                )
        );
    }

    @Test
    void test2() {
        assertThat(obj.combinationSum2(new int[]{
                2,5,2,1,2
        }, 5)).isEqualTo(List.of(
                        List.of(1,2,2),
                        List.of(5)
                )
        );
    }

    @Test
    void test3() {
        assertThat(obj.combinationSum2(new int[]{
                3,1,3,5,1,1
        }, 8)).isEqualTo(List.of(
                        List.of(1,2,2),
                        List.of(5)
                )
        );
    }
}