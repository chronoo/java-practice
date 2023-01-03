package homework;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        for (char[] chars : board) {
            if (invalidChars(chars)) return false;
        }

        for (int i = 0; i < 9; i++) {
            char[] chars = new char[9];
            for (int j = 0; j < 9; j++) {
                chars[j] = board[j][i];
            }
            if (invalidChars(chars)) return false;
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                char[] chars = new char[9];
                int index = 0;
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        chars[index++] = board[i * 3 + k][j * 3 + l];
                    }
                }
                if (invalidChars(chars)) return false;
            }
        }

        return true;
    }

    private static boolean invalidChars(char[] chars) {
        Set<Character> uniqueChars = new HashSet<>();
        for (char character : chars) {
            if (character == '.') continue;
            if (uniqueChars.contains(character)) return true;
            uniqueChars.add(character);
        }
        return false;
    }
}
