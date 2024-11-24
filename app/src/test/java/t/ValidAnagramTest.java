package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class ValidAnagramTest {
    ValidAnagram obj = new ValidAnagram();

    @Test
    void test1() {
        assertThat(obj.isAnagram("anagram", "nagaram")).isTrue();
    }

    @Test
    void test2() {
        assertThat(obj.isAnagram("rat", "car")).isFalse();
    }
}