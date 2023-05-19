package homework;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FindFirstPalindromicStringInTheArrayTest {

    private final FindFirstPalindromicStringInTheArray obj = new FindFirstPalindromicStringInTheArray();

    @Test
    void test1() {
        assertThat(obj.firstPalindrome(new String[] {
            "abc","car","ada","racecar","cool"
        })).isEqualTo("ada");
    }

    @Test
    void test2() {
        assertThat(obj.firstPalindrome(new String[] {
            "notapalindrome","racecar"
        })).isEqualTo("racecar");
    }

    @Test
    void test3() {
        assertThat(obj.firstPalindrome(new String[] {
            "def","ghi"
        })).isEqualTo("");
    }
}