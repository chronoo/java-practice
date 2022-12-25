package homework;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class GenerateParenthesesTest {

    private final GenerateParentheses obj = new GenerateParentheses();

    @Test
    void test1() {
        assertThat(obj.generateParenthesis(3))
                .isEqualTo(List.of("((()))","(()())","(())()","()(())","()()()"));
    }

    @Test
    void test2() {
        assertThat(obj.generateParenthesis(1))
                .isEqualTo(List.of("()"));
    }

    @Test
    void test3() {
        assertThat(obj.generateParenthesis(0))
                .isEqualTo(List.of(""));
    }
}