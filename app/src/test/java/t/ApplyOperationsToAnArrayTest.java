package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class ApplyOperationsToAnArrayTest {
    ApplyOperationsToAnArray obj = new ApplyOperationsToAnArray();

    @Test
    void test1() {
        assertThat(obj.applyOperations(new int[]{
                1, 2, 2, 1, 1, 0
        })).isEqualTo(new int[]{
                1, 4, 2, 0, 0, 0
        });
    }

    @Test
    void test2() {
        assertThat(obj.applyOperations(new int[]{
                0, 1
        })).isEqualTo(new int[]{
                1, 0
        });
    }
}