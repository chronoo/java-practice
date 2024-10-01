package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CheckIfArrayPairsAreDivisibleByKTest {
    CheckIfArrayPairsAreDivisibleByK obj = new CheckIfArrayPairsAreDivisibleByK();

    @Test
    public void test1() {
        assertThat(obj.canArrange(new int[]{1,2,3,4,5,10,6,7,8,9}, 5)).isTrue();
    }

    @Test
    public void test2() {
        assertThat(obj.canArrange(new int[]{1,2,3,4,5,6}, 7)).isTrue();
    }

    @Test
    public void test3() {
        assertThat(obj.canArrange(new int[]{1,2,3,4,5,6}, 10)).isFalse();
    }
}