package homework;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CountServersThatCommunicateTest {
    private final CountServersThatCommunicate obj = new CountServersThatCommunicate();

    @Test
    void test1() {
        assertThat(obj.countServers(new int[][]{
            {1,0}, {0,1}
        })).isEqualTo(0);
    }

    @Test
    void test2() {
        assertThat(obj.countServers(new int[][]{
            {1,0}, {1,1}
        })).isEqualTo(3);
    }

    @Test
    void test3() {
        assertThat(obj.countServers(new int[][]{
            {1,1,0,0},{0,0,1,0},{0,0,1,0},{0,0,0,1}
        })).isEqualTo(4);
    }

    @Test
    void test4() {
        assertThat(obj.countServers(new int[][]{
            {1,0,0,1,0},{0,0,0,0,0},{0,0,0,1,0}
        })).isEqualTo(3);
    }
}