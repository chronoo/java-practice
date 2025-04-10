package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class DecompressRunLengthEncodedListTest {
    @Test
    void test1() {
        assertThat(new DecompressRunLengthEncodedList().decompressRLElist(new int[]{
                1, 2, 3, 4
        })).isEqualTo(new int[]{
                2, 4, 4, 4
        });
    }

    @Test
    void test2() {
        assertThat(new DecompressRunLengthEncodedList().decompressRLElist(new int[]{
                1, 1, 2, 3
        })).isEqualTo(new int[]{
                1, 3, 3
        });
    }
}