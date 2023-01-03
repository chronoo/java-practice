package homework;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ValidSudokuTest {
    private ValidSudoku obj;

    @Test
    void test1() {
        obj = new ValidSudoku();
        assertThat(obj.isValidSudoku(
                new char[][]{
                    new char[]{'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                    new char[]{'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                    new char[]{'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                    new char[]{'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                    new char[]{'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                    new char[]{'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                    new char[]{'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                    new char[]{'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                    new char[]{'.', '.', '.', '.', '8', '.', '.', '7', '9'},
                }
            )
        ).isTrue();
    }

    @Test
    void test2() {
        obj = new ValidSudoku();
        assertThat(obj.isValidSudoku(
                new char[][]{
                    new char[]{'8', '3', '.', '.', '7', '.', '.', '.', '.'},
                    new char[]{'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                    new char[]{'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                    new char[]{'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                    new char[]{'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                    new char[]{'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                    new char[]{'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                    new char[]{'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                    new char[]{'.', '.', '.', '.', '8', '.', '.', '7', '9'},
                }
            )
        ).isFalse();
    }
}
