package homework;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class NumberOfSubstringsContainingAllThreeCharactersTest {

    private final NumberOfSubstringsContainingAllThreeCharacters obj = new NumberOfSubstringsContainingAllThreeCharacters();

    @Test
    void test1() {
        assertThat(obj.numberOfSubstrings("abcabc"))
            .isEqualTo(10);
    }

    @Test
    void test2() {
        assertThat(obj.numberOfSubstrings("aaacb"))
            .isEqualTo(3);
    }

    @Test
    void test3() {
        assertThat(obj.numberOfSubstrings("abc"))
            .isEqualTo(1);
    }
}