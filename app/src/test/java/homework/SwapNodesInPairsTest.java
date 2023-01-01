package homework;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static homework.SwapNodesInPairs.ListNode.ofNumbers;
import static org.assertj.core.api.Assertions.*;

@Slf4j
class SwapNodesInPairsTest {
    private final SwapNodesInPairs obj = new SwapNodesInPairs();

    @Test
    void test1() {
        assertThat(obj.swapPairs(ofNumbers(1, 2, 3, 4)))
            .isEqualTo(ofNumbers(2, 1, 4, 3));
    }

    @Test
    void test2() {
        assertThat(obj.swapPairs(new SwapNodesInPairs.ListNode())).
            isEqualTo(new ListNode());
    }

    @Test
    void test3() {
        assertThat(obj.swapPairs(ofNumbers(2,5,3,4,6,2,2)).toString()).
            isEqualTo(ofNumbers(5,2,4,3,2,6,2).toString());
    }
}