package t;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class RunnersTest {
    Runners obj = new Runners();

    @Test
    void test1() {
        assertThat(obj.findChampions(
            new Runners.Rec[][]{
                {new Runners.Rec(1, 2000), new Runners.Rec(2, 3000)},
                {new Runners.Rec(2, 2000)}
            }
        )).isEqualTo(List.of(2));
    }
}