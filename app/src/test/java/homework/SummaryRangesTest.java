package homework;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SummaryRangesTest {

    private final SummaryRanges obj = new SummaryRanges();

    @Test
    void test1() {
        assertThat(obj.summaryRanges(new int[]{0,1,2,4,5,7}))
                .isEqualTo(List.of("0->2","4->5","7"));
    }

    @Test
    void test2() {
        assertThat(obj.summaryRanges(new int[]{0,2,3,4,6,8,9}))
                .isEqualTo(List.of("0","2->4","6","8->9"));
    }
}