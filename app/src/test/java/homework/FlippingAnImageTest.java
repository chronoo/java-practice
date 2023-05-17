package homework;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class FlippingAnImageTest {

    private final FlippingAnImage obj = new FlippingAnImage();

    @Test
    void test1() {
        assertThat(obj.flipAndInvertImage(new int[][]{
            {1,1,0},{1,0,1},{0,0,0}
        })).isEqualTo(new int[][] {
            {1,0,0}, {0,1,0}, {1,1,1}
        });
    }
}