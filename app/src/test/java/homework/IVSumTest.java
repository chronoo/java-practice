package homework;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class IVSumTest {

    private final IVSum obj = new IVSum();

    @Test
    void test1() {
        assertThat(obj.fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0))
                .isEqualTo(List.of(
                        List.of(-2, -1, 1, 2),
                        List.of(-2, 0, 0, 2),
                        List.of(-1, 0, 0, 1)
                ));
    }

    @Test
    void test2() {
        assertThat(obj.fourSum(new int[]{2, 2, 2, 2, 2}, 8))
                .isEqualTo(List.of(
                        List.of(2, 2, 2, 2)
                ));
    }

    @Test
    void test3() {
        obj.fourSum(new int[]{-497,-481,-481,-472,-471,-465,-422,-420,-413,-405,-388,-381,-366,-361,-359,-348,-334,-334,-318,-310,-305,-280,-273,-272,-262,-254,-248,-223,-208,-202,-196,-192,-189,-167,-165,-165,-156,-143,-136,-122,-120,-120,-108,-77,-50,-44,-34,-26,-17,-5,13,46,46,53,54,56,66,71,72,75,89,115,130,139,149,151,154,196,209,219,230,240,245,246,253,267,277,289,299,302,303,304,342,349,360,361,361,375,392,400,407,408,408,426,427,429,443,451,481},
                -5617);
    }
}