package homework;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class GroupAnagramsTest {
    private final GroupAnagrams obj = new GroupAnagrams();

    @Test
    void test1() {
        assertThat(obj.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}))
                .isEqualTo(
                        List.of(
                                List.of("bat"),
                                List.of("nat", "tan"),
                                List.of("ate", "eat", "tea")
                        )
                );
    }

    @Test
    void test2() {
        assertThat(obj.groupAnagrams(new String[]{""}))
                .isEqualTo(
                        List.of(
                                List.of("")
                        )
                );
    }

    @Test
    void test3() {
        assertThat(obj.groupAnagrams(new String[]{"a"}))
                .isEqualTo(
                        List.of(
                                List.of("a")
                        )
                );
    }
}