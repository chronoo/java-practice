package homework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountSubIslands {
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int height = grid1.length;
        int width = grid1[0].length;
        UnionFind uf = new UnionFind(height * width);
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (grid2[i][j] == 1) {
                    int current = i * width + j;
                    uf.rank[current] = 1;
                    if (i > 0 && grid2[i - 1][j] == 1) uf.union(current, (i - 1) * width + j);
                    if (j < width - 1 && grid2[i][j + 1] == 1) uf.union(current, i * width + j + 1);
                    if (i < height - 1 && grid2[i + 1][j] == 1) uf.union(current, (i + 1) * width + j);
                    if (j > 0 && grid2[i][j - 1] == 1) uf.union(current, i * width + j - 1);
                }
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (grid2[i][j] == 1) uf.find(i * width + j);
            }
        }
        List<Integer> pars = new ArrayList<>();
        int[] parents = uf.parents;
        for (int i = 0; i < parents.length; i++) {
            if (uf.rank[i] > 0)
                pars.add(parents[i]);
        }
        Set<Integer> res = new HashSet<>();
        boolean isOk;
        for (Integer par : new HashSet<>(pars)) {
            isOk = true;
            for (int i = 0; i < height * width; i++) {
                if (uf.parents[i] == par && grid1[i / width][i % width] == 0) {
                    isOk = false;
                    break;
                }
            }
            if (isOk) res.add(par);
        }
        return res.size();
    }

    class UnionFind {
        int[] parents;
        int[] rank;

        public UnionFind(int size) {
            parents = new int[size];
            rank = new int[size];
            for (int i = 0; i < size; i++) {
                parents[i] = i;
                rank[i] = 0;
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
                if (rank[parent1] > rank[parent2]) {
                    parents[parent2] = parent1;
                } else {
                    parents[parent1] = parent2;
                }
                if (rank[parent1] == rank[parent2]) {
                    rank[parent1]++;
                }
            }
        }
    }
}
