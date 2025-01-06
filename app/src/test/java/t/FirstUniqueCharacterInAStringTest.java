package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class FirstUniqueCharacterInAStringTest {
    FirstUniqueCharacterInAString obj = new FirstUniqueCharacterInAString();

    @Test
    void test1() {
        assertThat(obj.firstUniqChar("leetcode")).isEqualTo(0);
    }

    @Test
    void test2() {
        assertThat(obj.firstUniqChar("loveleetcode")).isEqualTo(2);
    }

    @Test
    void test3() {
        assertThat(obj.firstUniqChar("aabb")).isEqualTo(-1);
    }
}