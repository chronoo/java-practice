package homework;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class EvaluateDivisionTest {
    private final EvaluateDivision obj = new EvaluateDivision();

    @Test
    void test1() {
        assertThat(obj.calcEquation(
                List.of(
                    List.of("a", "b"),
                    List.of("b", "c")
                ), new double[]{
                    2.0, 3.0
                }, List.of(
                    List.of("a", "c"),
                    List.of("b", "a"),
                    List.of("a", "e"),
                    List.of("a", "a"),
                    List.of("x", "x")
                )
            )
        ).isEqualTo(new double[]{
            6.0, 0.5, -1.0, 1.0, -1.0
        });
    }

    @Test
    void test2() {
        assertThat(obj.calcEquation(
                List.of(
                    List.of("a", "b"),
                    List.of("b", "c"),
                    List.of("bc", "cd")
                ), new double[]{
                    1.5, 2.5, 5.0
                }, List.of(
                    List.of("a", "c"),
                    List.of("c", "b"),
                    List.of("bc", "cd"),
                    List.of("cd", "bc")
                )
            )
        ).isEqualTo(new double[]{
            3.75000, 0.40000, 5.00000, 0.20000
        });
    }

    @Test
    void test3() {
        assertThat(obj.calcEquation(
                List.of(
                    List.of("a", "b")
                ), new double[]{
                    0.5
                }, List.of(
                    List.of("a", "b"),
                    List.of("b", "a"),
                    List.of("a", "c"),
                    List.of("x", "y")
                )
            )
        ).isEqualTo(new double[]{
            0.50000, 2.00000, -1.00000, -1.00000
        });
    }

    @Test
    void test4() {
        assertThat(obj.calcEquation(
                List.of(
                    List.of("a", "e"),
                    List.of("b", "e")
                ), new double[]{
                    4.0, 3.0
                }, List.of(
                    List.of("a", "b"),
                    List.of("e", "e"),
                    List.of("x", "x")
                )
            )
        ).isEqualTo(new double[]{
            1.33333, 1.00000, -1.00000
        });
    }
}