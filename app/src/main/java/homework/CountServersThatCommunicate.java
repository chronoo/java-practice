package homework;

import java.util.HashSet;
import java.util.Set;

public class CountServersThatCommunicate {
    public int countServers(int[][] grid) {
        Set<Integer> res = new HashSet<>();
        int height = grid.length;
        int width = grid[0].length;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                boolean has = false;
                if (grid[i][j] == 1) {
                    for (int k = j + 1; k < width; k++) {
                        if (grid[i][k] == 1) {
                            has = true;
                            res.add(i * width + k);
                        }
                    }
                }
                if (has) {
                    res.add(i * width + j);
                    break;
                }
            }
        }
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                boolean has = false;
                if (grid[j][i] == 1) {
                    for (int k = j + 1; k < height; k++) {
                        if (grid[k][i] == 1) {
                            has = true;
                            res.add(k * width + i);
                        }
                    }
                }
                if (has) {
                    res.add(j * width + i);
                    break;
                }
            }
        }
        return res.size();
    }
}
