package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SortingTheSentenceTest {
    SortingTheSentence obj = new SortingTheSentence();

    @Test
    void test1() {
        assertThat(obj.sortSentence("is2 sentence4 This1 a3")).isEqualTo("This is a sentence");
    }

    @Test
    void test2() {
        assertThat(obj.sortSentence("Myself2 Me1 I4 and3")).isEqualTo("Me Myself and I");
    }
}