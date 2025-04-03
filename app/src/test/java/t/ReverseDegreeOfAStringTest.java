package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class ReverseDegreeOfAStringTest {
    ReverseDegreeOfAString obj = new ReverseDegreeOfAString();

    @Test
    void test1() {
        assertThat(obj.reverseDegree("abc")).isEqualTo(148);
    }

    @Test
    void test2() {
        assertThat(obj.reverseDegree("zaza")).isEqualTo(160);
    }
}