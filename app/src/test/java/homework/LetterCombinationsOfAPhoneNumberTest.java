package homework;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class LetterCombinationsOfAPhoneNumberTest {

    private final LetterCombinationsOfAPhoneNumber obj = new LetterCombinationsOfAPhoneNumber();

    @Test
    void test1() {
        assertThat(obj.letterCombinations("23"))
                .isEqualTo(List.of("ad","ae","af","bd","be","bf","cd","ce","cf"));
    }

    @Test
    void test2() {
        assertThat(obj.letterCombinations(""))
                .isEqualTo(List.of());
    }

    @Test
    void test3() {
        assertThat(obj.letterCombinations("2"))
                .isEqualTo(List.of("a","b","c"));
    }

}