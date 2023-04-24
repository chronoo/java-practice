package homework;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class RemoveElementTest {

    private final RemoveElement obj = new RemoveElement();

    @Test
    void test1() {
        int[] array = new int[]{3, 2, 2, 3};
        assertThat(obj.removeElement(array, 3))
            .isEqualTo(2);
        assertThat(array).startsWith(2, 2);
    }

    @Test
    void test2() {
        int[] array = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        assertThat(obj.removeElement(array, 2))
            .isEqualTo(5);
        assertThat(array).startsWith(0, 1, 3, 0, 4);
    }
}