package homework;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class ReverseWordsInAStringTest {

    private final ReverseWordsInAString obj = new ReverseWordsInAString();

    @Test
    void test1() {
        assertThat(obj.reverseWords("Let's take LeetCode contest"))
            .isEqualTo("s'teL ekat edoCteeL tsetnoc");
    }

    @Test
    void test2() {
        assertThat(obj.reverseWords("God Ding"))
            .isEqualTo("doG gniD");
    }
}