package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class MissingNumberTest {
    MissingNumber obj = new MissingNumber();

    @Test
    void test1() {
        assertThat(obj.missingNumber(new int[]{3, 0, 1})).isEqualTo(2);
    }

    @Test
    void test2() {
        assertThat(obj.missingNumber(new int[]{0, 1})).isEqualTo(2);
    }

    @Test
    void test3() {
        assertThat(obj.missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1})).isEqualTo(8);
    }
}