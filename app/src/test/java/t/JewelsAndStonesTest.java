package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class JewelsAndStonesTest {
    JewelsAndStones obj = new JewelsAndStones();

    @Test
    void test1() {
        assertThat(obj.numJewelsInStones("aA", "aAAbbbb"))
            .isEqualTo(3);
    }

    @Test
    void test2() {
        assertThat(obj.numJewelsInStones("z", "ZZ"))
            .isEqualTo(0);
    }
}