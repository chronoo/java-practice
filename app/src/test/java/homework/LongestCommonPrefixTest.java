package homework;

import org.assertj.core.api.AbstractObjectAssert;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {

    private final LongestCommonPrefix obj = new LongestCommonPrefix();

    @Test
    void test1() {
        assertThat(obj.longestCommonPrefix(new String[]{
            "flower","flow","flight"
        })).isEqualTo("fl");
    }

    @Test
    void test2() {
        assertThat(obj.longestCommonPrefix(new String[]{
            "dog","racecar","car"
        })).isEqualTo("");
    }
}