package homework;

import java.util.Arrays;

public class MaxAreaOfIsland {
    public int maxAreaOfIsland(int[][] grid) {
        int xSize = grid.length;
        int ySize = grid[0].length;
        boolean exist = false;
        UnionFind uf = new UnionFind(xSize * ySize);
        for (int i = 0; i < grid.length; i++) {
            int[] row = grid[i];
            for (int j = 0; j < row.length; j++) {
                int cell = row[j];
                if (cell == 1) {
                    exist = true;
                    if (j > 0 && grid[i][j - 1] == 1) {
                        uf.union(i * ySize + j, i * ySize + j - 1);
                    }
                    if (j < ySize - 1 && grid[i][j + 1] == 1) {
                        uf.union(i * ySize + j, i * ySize + j + 1);
                    }
                    if (i > 0 && grid[i - 1][j] == 1) {
                        uf.union(i * ySize + j, (i - 1) * ySize + j);
                    }
                    if (i < xSize - 1 && grid[i + 1][j] == 1) {
                        uf.union(i * ySize + j, (i + 1) * ySize + j);
                    }
                }
            }
        }
        if (!exist) return 0;
        return Arrays.stream(uf.ranks).max().getAsInt();
    }

    class UnionFind {
        int[] parents;
        int[] ranks;

        public UnionFind(int size) {
            parents = new int[size];
            ranks = new int[size];
            for (int i = 0; i < size; i++) {
                parents[i] = i;
                ranks[i] = 1;
            }
        }

        public int find(int target) {
            if (parents[target] != target) {
                parents[target] = find(parents[target]);
            }
            return parents[target];
        }

        public void union(int first, int second) {
            int parent1 = find(first);
            int parent2 = find(second);
            if (parent1 != parent2) {
                if (ranks[parent1] < ranks[parent2]) {
                    parents[parent1] = parent2;
                    ranks[parent2] += ranks[parent1];
                } else {
                    parents[parent2] = parent1;
                    ranks[parent1] += ranks[parent2];
                }
            }
        }
    }
}
