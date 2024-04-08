package func;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class PascalsTriangleIITest {
    PascalsTriangleII obj = new PascalsTriangleII();

    @Test
    void test1() {
        assertThat(obj.getRow(3)).isEqualTo(List.of(1, 3, 3, 1));
    }

    @Test
    void test2() {
        assertThat(obj.getRow(0)).isEqualTo(List.of(1));
    }

    @Test
    void test3() {
        assertThat(obj.getRow(1)).isEqualTo(List.of(1, 1));
    }
}
