package t;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class FindWordsContainingCharacterTest {
    FindWordsContainingCharacter obj = new FindWordsContainingCharacter();

    @Test
    void test1() {
        assertThat(obj.findWordsContaining(new String[]{"leet", "code"}, 'e'))
            .isEqualTo(List.of(0, 1));
    }

    @Test
    void test2() {
        assertThat(obj.findWordsContaining(new String[]{"abc", "bcd", "aaaa", "cbc"}, 'a'))
            .isEqualTo(List.of(0, 2));
    }

    @Test
    void test3() {
        assertThat(obj.findWordsContaining(new String[]{"abc", "bcd", "aaaa", "cbc"}, 'z'))
            .isEqualTo(List.of());
    }
}