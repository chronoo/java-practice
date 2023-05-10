package homework;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class RedundantConnectionTest {

    private final RedundantConnection obj = new RedundantConnection();

    @Test
    void test1() {
        assertThat(obj.findRedundantConnection(new int[][]{
            {1, 2}, {1, 3}, {2, 3}
        })).isEqualTo(new int[]{2, 3});
    }

    @Test
    void test2() {
        assertThat(obj.findRedundantConnection(new int[][]{
            {1, 2}, {2, 3}, {3, 4}, {1, 4}, {1, 5}
        })).isEqualTo(new int[]{1, 4});
    }
}