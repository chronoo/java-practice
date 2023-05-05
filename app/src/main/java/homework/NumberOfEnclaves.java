package homework;

import java.util.HashMap;
import java.util.Map;

public class NumberOfEnclaves {
    public int numEnclaves(int[][] grid) {
        int height = grid.length;
        int width = grid[0].length;
        UnionFind uf = new UnionFind(height * width);
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (grid[i][j] == 1)
                    uf.count[i * width + j] = 1;
            }
        }
        int out = height * width;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                int current = i * width + j;
                int cell = grid[i][j];
                if (cell == 0) continue;

                if (i > 0 && grid[i - 1][j] == 1) uf.union(current, (i - 1) * width + j);
                if (j < width - 1 && grid[i][j + 1] == 1) uf.union(current, i * width + j + 1);
                if (i < height - 1 && grid[i + 1][j] == 1) uf.union(current, (i + 1) * width + j);
                if (j > 0 && grid[i][j - 1] == 1) uf.union(current, i * width + j - 1);
                if (i == 0 || i == height-1 || j == 0 || j == width-1) {
                    uf.union(current, out);
                }
            }
        }
        Map<Integer, Integer> sum = new HashMap<>();
        for (int i = 0; i <= out; i++) {
            int parent = uf.find(i);
            int currentCount = uf.count[parent];
            if (currentCount !=0 && parent != out) {
                sum.put(parent, currentCount);
            }
        }
        return sum.values().stream().mapToInt(Integer::intValue).sum();
    }

    class UnionFind {
        int[] parents;
        int[] count;
        int size;

        public UnionFind(int size) {
            this.size = size;
            parents = new int[size+1];
            count = new int[size+1];
            for (int i = 0; i < size+1; i++) {
                parents[i] = i;
                count[i] = 0;
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
            if (parent1 == size) {
                parents[parent2] = parent1;
                count[parent1] += count[parent2];
            } else if (parent2 == size) {
                parents[parent1] = parent2;
                count[parent2] += count[parent1];
            } else if (parent1 != parent2) {
                if (count[parent1] > count[parent2]) {
                    parents[parent2] = parent1;
                    count[parent1] += count[parent2];
                } else {
                    parents[parent1] = parent2;
                    count[parent2] += count[parent1];
                }
            }
        }
    }
}
