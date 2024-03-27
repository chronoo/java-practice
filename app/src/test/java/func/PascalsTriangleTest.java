package func;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class PascalsTriangleTest {
    PascalsTriangle obj = new PascalsTriangle();
    @Test
    void test1() {
        assertThat(obj.generate(5)).isEqualTo(
            List.of(
                List.of(1),
                List.of(1,1),
                List.of(1,2,1),
                List.of(1,3,3,1),
                List.of(1,4,6,4,1)
            )
        );
    }
}