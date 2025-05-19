package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class RemoveOutermostParenthesesTest {
    RemoveOutermostParentheses obj = new RemoveOutermostParentheses();

    @Test
    void test1() {
        assertThat(obj.removeOuterParentheses("(()())(())")).isEqualTo("()()()");
    }

    @Test
    void test2() {
        assertThat(obj.removeOuterParentheses("(()())(())(()(()))")).isEqualTo("()()()()(())");
    }

    @Test
    void test3() {
        assertThat(obj.removeOuterParentheses("()()")).isEqualTo("");
    }
}