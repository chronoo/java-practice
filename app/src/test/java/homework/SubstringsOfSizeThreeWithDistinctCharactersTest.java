package homework;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SubstringsOfSizeThreeWithDistinctCharactersTest {

    private final SubstringsOfSizeThreeWithDistinctCharacters obj = new SubstringsOfSizeThreeWithDistinctCharacters();

    @Test
    void test1() {
        assertThat(obj.countGoodSubstrings("xyzzaz"))
            .isEqualTo(1);
    }

    @Test
    void test2() {
        assertThat(obj.countGoodSubstrings("aababcabc"))
            .isEqualTo(4);
    }
}