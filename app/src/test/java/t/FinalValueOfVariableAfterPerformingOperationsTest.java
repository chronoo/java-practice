package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class FinalValueOfVariableAfterPerformingOperationsTest {
    FinalValueOfVariableAfterPerformingOperations obj = new FinalValueOfVariableAfterPerformingOperations();

    @Test
    void test1() {
        assertThat(obj.finalValueAfterOperations(new String[]{"--X", "X++", "X++"})).isEqualTo(1);
    }
}