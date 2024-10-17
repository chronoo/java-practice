package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class FindTheIndexOfTheFirstOccurrenceInAStringTest {
    FindTheIndexOfTheFirstOccurrenceInAString obj = new FindTheIndexOfTheFirstOccurrenceInAString();

    @Test
    void test1() {
        assertThat(obj.strStr("sadbutsad", "sad")).isEqualTo(0);
    }

    @Test
    void test2() {
        assertThat(obj.strStr("leetcode", "leeto")).isEqualTo(-1);
    }
    @Test
    void test6() {
        assertThat(obj.strStr("hello", "ll")).isEqualTo(2);
    }
    @Test
    void test7() {
        assertThat(obj.strStr("mississippi", "issip")).isEqualTo(4);
    }

    @Test
    void test8() {
        assertThat(obj.strStr("abc", "c")).isEqualTo(2);
    }
    @Test
    void test9() {
        assertThat(obj.strStr("a", "a")).isEqualTo(0);
    }
}