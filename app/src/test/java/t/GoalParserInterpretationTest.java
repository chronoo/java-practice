package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class GoalParserInterpretationTest {
    GoalParserInterpretation obj = new GoalParserInterpretation();

    @Test
    void test1() {
        assertThat(obj.interpret("G()(al)")).isEqualTo("Goal");
    }

    @Test
    void test2() {
        assertThat(obj.interpret("G()()()()(al)")).isEqualTo("Gooooal");
    }

    @Test
    void test3() {
        assertThat(obj.interpret("(al)G(al)()()G")).isEqualTo("alGalooG");
    }
}