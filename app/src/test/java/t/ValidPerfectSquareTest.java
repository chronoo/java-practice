package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class ValidPerfectSquareTest {
    ValidPerfectSquare obj = new ValidPerfectSquare();

    @Test
    void test1() {
        assertThat(obj.isPerfectSquare(16)).isTrue();
    }

    @Test
    void test2() {
        assertThat(obj.isPerfectSquare(14)).isFalse();
    }

    @Test
    void test3() {
        assertThat(obj.isPerfectSquare(1)).isTrue();
    }

    @Test
    void test4() {
        assertThat(obj.isPerfectSquare(9)).isTrue();
    }

    @Test
    void test5() {
        assertThat(obj.isPerfectSquare(808201)).isTrue();
    }

    @Test
    void test6() {
        assertThat(obj.isPerfectSquare(104976)).isTrue();
    }
}