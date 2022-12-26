package homework;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class NextPermutationTest {
    private final NextPermutation obj = new NextPermutation();

    @Test
    void test1() {
        int[] arr = {1, 2, 3};
        obj.nextPermutation(arr);
        assertThat(arr).isEqualTo(new int[]{1,3,2});
    }

    @Test
    void test2() {
        int[] arr = {3,2,1};
        obj.nextPermutation(arr);
        assertThat(arr).isEqualTo(new int[]{1, 2, 3});
    }

    @Test
    void test3() {
        int[] arr = {1,1,5};
        obj.nextPermutation(arr);
        assertThat(arr).isEqualTo(new int[]{1,5,1});
    }

    @Test
    void test4() {
        int[] arr = {1,7,8,9,6};
        obj.nextPermutation(arr);
        assertThat(arr).isEqualTo(new int[]{1,7,9,6,8});
    }
}