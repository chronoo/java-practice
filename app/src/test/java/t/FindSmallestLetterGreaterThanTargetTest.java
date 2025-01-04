package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class FindSmallestLetterGreaterThanTargetTest {
    FindSmallestLetterGreaterThanTarget obj = new FindSmallestLetterGreaterThanTarget();

    @Test
    void test1() {
        assertThat(obj.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'a')).isEqualTo('c');
    }
    @Test
    void test2() {
        assertThat(obj.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'c')).isEqualTo('f');
    }
    @Test
    void test3() {
        assertThat(obj.nextGreatestLetter(new char[]{'x','x','y','y'}, 'z')).isEqualTo('x');
    }
}