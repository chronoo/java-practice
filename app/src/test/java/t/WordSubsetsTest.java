package t;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class WordSubsetsTest {
    WordSubsets obj = new WordSubsets();

    @Test
    void test1() {
        assertThat(obj.wordSubsets(
            new String[]{"amazon", "apple", "facebook", "google", "leetcode"},
            new String[]{"e", "o"}
        )).isEqualTo(List.of("facebook", "google", "leetcode"));
    }

    @Test
    void test2() {
        assertThat(obj.wordSubsets(
            new String[]{"amazon", "apple", "facebook", "google", "leetcode"},
            new String[]{"l", "e"}
        )).isEqualTo(List.of("apple", "google", "leetcode"));
    }
}