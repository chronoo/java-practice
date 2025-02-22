package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class ShuffleTheArrayTest {
    ShuffleTheArray obj = new ShuffleTheArray();

    @Test
    void test1() {
        assertThat(obj.shuffle(new int[]{
            2, 5, 1, 3, 4, 7
        }, 3)).isEqualTo(new int[]{2, 3, 5, 4, 1, 7});
    }

    @Test
    void test3() {
        assertThat(obj.shuffle(new int[]{
            1, 1, 2, 2
        }, 2)).isEqualTo(new int[]{1, 2, 1, 2});
    }
}