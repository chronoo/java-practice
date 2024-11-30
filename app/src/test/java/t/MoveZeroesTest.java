package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class MoveZeroesTest {
    MoveZeroes obj = new MoveZeroes();

    @Test
    void test1() {
        int[] array = {0, 1, 0, 3, 12};
        obj.moveZeroes(array);
        assertThat(array).isEqualTo(new int[]{1, 3, 12, 0, 0});
    }


    @Test
    void test2() {
        int[] array = {0};
        obj.moveZeroes(array);
        assertThat(array).isEqualTo(new int[]{0});
    }

    @Test
    void test3() {
        int[] array = {1};
        obj.moveZeroes(array);
        assertThat(array).isEqualTo(new int[]{1});
    }
}