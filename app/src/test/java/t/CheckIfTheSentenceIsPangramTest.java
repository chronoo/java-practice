package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CheckIfTheSentenceIsPangramTest {
    CheckIfTheSentenceIsPangram obj = new CheckIfTheSentenceIsPangram();

    @Test
    void test1() {
        assertThat(obj.checkIfPangram("thequickbrownfoxjumpsoverthelazydog")).isTrue();
    }

    @Test
    void test2() {
        assertThat(obj.checkIfPangram("leetcode")).isFalse();
    }
}