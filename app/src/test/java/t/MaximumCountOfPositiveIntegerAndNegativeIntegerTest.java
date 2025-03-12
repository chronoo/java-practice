package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class MaximumCountOfPositiveIntegerAndNegativeIntegerTest {
    MaximumCountOfPositiveIntegerAndNegativeInteger obj = new MaximumCountOfPositiveIntegerAndNegativeInteger();

    @Test
    void test1() {
        assertThat(obj.maximumCount(new int[]{
                -2, -1, -1, 1, 2, 3
        })).isEqualTo(3);
    }

    @Test
    void test2() {
        assertThat(obj.maximumCount(new int[]{
                -3, -2, -1, 0, 0, 1, 2
        })).isEqualTo(3);
    }

    @Test
    void test3() {
        assertThat(obj.maximumCount(new int[]{
                5, 20, 66, 1314
        })).isEqualTo(4);
    }
}