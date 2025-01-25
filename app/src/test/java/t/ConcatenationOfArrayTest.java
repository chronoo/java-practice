package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class ConcatenationOfArrayTest {
    ConcatenationOfArray obj = new ConcatenationOfArray();

    @Test
    void test1() {
        assertThat(obj.getConcatenation(new int[]{1, 2, 1})).isEqualTo(new int[]{1, 2, 1, 1, 2, 1});
    }
}