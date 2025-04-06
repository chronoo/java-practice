package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class DecodeXORedArrayTest {
    DecodeXORedArray obj = new DecodeXORedArray();

    @Test
    void test1() {
        assertThat(obj.decode(new int[]{
            1, 2, 3
        }, 1)).isEqualTo(new int[]{
            1, 0, 2, 1
        });
    }

    @Test
    void test2() {
        assertThat(obj.decode(new int[]{
            6, 2, 7, 3
        }, 4)).isEqualTo(new int[]{
            4, 2, 0, 7, 4
        });
    }
}