package func;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class MergeSortedArrayTest {
    MergeSortedArray obj = new MergeSortedArray();

    @Test
    void test1() {
        int[] source = {1, 2, 3, 0, 0, 0};
        obj.merge(source, 3, new int[]{2, 5, 6}, 3);
        assertThat(source).isEqualTo(new int[]{1,2,2,3,5,6});
    }

    @Test
    void test2() {
        int[] source = {1};
        obj.merge(source, 1, new int[]{}, 0);
        assertThat(source).isEqualTo(new int[]{1});
    }

    @Test
    void test3() {
        int[] source = {0};
        obj.merge(source, 0, new int[]{1}, 1);
        assertThat(source).isEqualTo(new int[]{1});
    }

    @Test
    void test4() {
        int[] source = {2,0};
        obj.merge(source, 1, new int[]{1}, 1);
        assertThat(source).isEqualTo(new int[]{1, 2});
    }
}
