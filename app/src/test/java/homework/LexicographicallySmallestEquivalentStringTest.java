package homework;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class LexicographicallySmallestEquivalentStringTest {

    private final LexicographicallySmallestEquivalentString obj = new LexicographicallySmallestEquivalentString();

    @Test
    void test1() {
        assertThat(obj.smallestEquivalentString("parker", "morris", "parser"))
            .isEqualTo("makkek");
    }

    @Test
    void test2() {
        assertThat(obj.smallestEquivalentString("hello", "world", "hold"))
            .isEqualTo("hdld");
    }

    @Test
    void test3() {
        assertThat(obj.smallestEquivalentString("leetcode", "programs", "sourcecode"))
            .isEqualTo("aauaaaaada");
    }
}