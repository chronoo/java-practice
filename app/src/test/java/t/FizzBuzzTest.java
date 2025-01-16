package t;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class FizzBuzzTest {
    FizzBuzz obj = new FizzBuzz();

    @Test
    void test1() {
        assertThat(obj.fizzBuzz(3)).isEqualTo(
            List.of("1", "2", "Fizz")
        );
    }

    @Test
    void test2() {
        assertThat(obj.fizzBuzz(5)).isEqualTo(
            List.of("1","2","Fizz","4","Buzz")
        );
    }

    @Test
    void test3() {
        assertThat(obj.fizzBuzz(15)).isEqualTo(
            List.of("1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz")
        );
    }
}