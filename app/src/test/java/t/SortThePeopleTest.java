package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SortThePeopleTest {
    SortThePeople obj = new SortThePeople();

    @Test
    void test1() {
        assertThat(obj.sortPeople(
            new String[]{"Mary", "John", "Emma"},
            new int[]{180, 165, 170}
        )).isEqualTo(new String[]{"Mary", "Emma", "John"});
    }

    @Test
    void test2() {
        assertThat(obj.sortPeople(
            new String[]{"Alice", "Bob", "Bob"},
            new int[]{155, 185, 150}
        )).isEqualTo(new String[]{"Bob", "Alice", "Bob"});
    }
}