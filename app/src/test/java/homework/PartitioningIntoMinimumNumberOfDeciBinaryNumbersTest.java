package homework;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class PartitioningIntoMinimumNumberOfDeciBinaryNumbersTest {
    private final PartitioningIntoMinimumNumberOfDeciBinaryNumbers obj = new PartitioningIntoMinimumNumberOfDeciBinaryNumbers();

    @Test
    void test1() {
        assertThat(obj.minPartitions("32")).isEqualTo(3);
    }

    @Test
    void test2() {
        assertThat(obj.minPartitions("82734")).isEqualTo(8);
    }

    @Test
    void test3() {
        assertThat(obj.minPartitions("27346209830709182346")).isEqualTo(9);
    }
}