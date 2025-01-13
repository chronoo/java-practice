package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class MinimumLengthOfStringAfterOperationsTest {
    MinimumLengthOfStringAfterOperations obj = new MinimumLengthOfStringAfterOperations();

    @Test
    void test1() {
        assertThat(obj.minimumLength("abaacbcbb")).isEqualTo(5);
    }

    @Test
    void test2() {
        assertThat(obj.minimumLength("aa")).isEqualTo(2);
    }
}