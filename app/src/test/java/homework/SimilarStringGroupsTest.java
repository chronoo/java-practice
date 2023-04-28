package homework;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SimilarStringGroupsTest {

    private final SimilarStringGroups obj = new SimilarStringGroups();

    @Test
    void test1() {
        assertThat(obj.numSimilarGroups(new String[]{
            "tars","rats","arts","star"
        })).isEqualTo(2);
    }

    @Test
    void test2() {
        assertThat(obj.numSimilarGroups(new String[]{
            "omv","ovm"
        })).isEqualTo(1);
    }

    @Test
    void test3() {
        assertThat(obj.numSimilarGroups(new String[]{
            "nmiwx","mniwx","wminx","mnixw","xnmwi"
        })).isEqualTo(2);
    }

    @Test
    void test4() {
        assertThat(obj.numSimilarGroups(new String[]{
            "kccomwcgcs",
            "socgcmcwkc",
            "sgckwcmcoc",
            "coswcmcgkc",
            "cowkccmsgc",
            "cosgmccwkc", // --
            "sgmkwcccoc",
            "coswmccgkc", // --
            "kowcccmsgc",
            "kgcomwcccs"
        })).isEqualTo(5);
    }
}