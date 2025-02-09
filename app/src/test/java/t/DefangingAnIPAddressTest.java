package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class DefangingAnIPAddressTest {
    DefangingAnIPAddress obj = new DefangingAnIPAddress();

    @Test
    void test1() {
        assertThat(obj.defangIPaddr("1.1.1.1")).isEqualTo("1[.]1[.]1[.]1");
    }

    @Test
    void test2() {
        assertThat(obj.defangIPaddr("255.100.50.0")).isEqualTo("255[.]100[.]50[.]0");
    }
}