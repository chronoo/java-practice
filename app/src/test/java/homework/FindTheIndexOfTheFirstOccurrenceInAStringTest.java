package homework;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class FindTheIndexOfTheFirstOccurrenceInAStringTest {

    private final FindTheIndexOfTheFirstOccurrenceInAString obj = new FindTheIndexOfTheFirstOccurrenceInAString();

    @Test
    void test1() {
        assertThat(obj.strStr("sadbutsad", "sad")).isEqualTo(0);
    }

    @Test
    void test2() {
        assertThat(obj.strStr("leetcode", "leeto")).isEqualTo(-1);
    }

    @Test
    void test3() {
        assertThat(obj.strStr("hello", "ll")).isEqualTo(2);
    }

    @Test
    void test4() {
        assertThat(obj.strStr("mississippi", "issip")).isEqualTo(4);
    }
}