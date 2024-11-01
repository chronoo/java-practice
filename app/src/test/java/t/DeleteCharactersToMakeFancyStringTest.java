package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class DeleteCharactersToMakeFancyStringTest {
    DeleteCharactersToMakeFancyString obj = new DeleteCharactersToMakeFancyString();

    @Test
    void test1() {
        assertThat(obj.makeFancyString("leeetcode")).isEqualTo("leetcode");
    }

    @Test
    void test2() {
        assertThat(obj.makeFancyString("aaabaaaa")).isEqualTo("aabaa");
    }
}