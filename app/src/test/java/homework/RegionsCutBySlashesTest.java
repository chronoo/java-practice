package homework;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class RegionsCutBySlashesTest {
    private final RegionsCutBySlashes obj = new RegionsCutBySlashes();

    @Test
    void test1() {
        assertThat(obj.regionsBySlashes(new String[]{
            " /","  "
        })).isEqualTo(1);
    }
    @Test
    void test2() {
        assertThat(obj.regionsBySlashes(new String[]{
            "/\\","\\/"
        })).isEqualTo(5);
    }
}