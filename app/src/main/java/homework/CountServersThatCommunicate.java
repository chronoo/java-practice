package homework;

import java.util.ArrayList;
import java.util.List;

public class CountServersThatCommunicate {
    public int countServers(int[][] grid) {
        int height = grid.length;
        int width = grid[0].length;
        UnionFind uf = new UnionFind(height * width);
        for (int i = 0; i < height; i++) {
            List<Integer> arr = new ArrayList<>();
            for (int j = 0; j < width; j++) {
                if (grid[i][j] == 1) arr.add(j);
            }
            for (int j = 1; j < arr.size(); j++) {
                uf.union(i*width+arr.get(0), i*width+arr.get(j));
            }
        }
        for (int i = 0; i < width; i++) {
            List<Integer> arr = new ArrayList<>();
            for (int j = 0; j < height; j++) {
                if (grid[j][i] == 1) arr.add(j);
            }
            for (int j = 1; j < arr.size(); j++) {
                uf.union(i+arr.get(0)*width, i+arr.get(j)*width);
            }
        }
        int res = 0;
        for (int j = 0; j < uf.parent.length; j++) {
            if (uf.parent[j] != j || uf.rank[j] > 0) res++;
        }
        return res;
    }

    class UnionFind {
        int[] parent;
        int[] rank;

        UnionFind(int size) {
            parent = new int[size];
            rank = new int[size];

            for (int i = 0; i < size; i++) {
                parent[i] = i;
            }
        }

        int find(int target) {
            if (parent[target] != target) {
                parent[target] = find(parent[target]);
            }
            return parent[target];
        }

        void union(int first, int second) {
            int parent1 = find(first);
            int parent2 = find(second);
            if (parent1 != parent2) {
                if (rank[parent1] > rank[parent2]) {
                    parent[parent2] = parent1;
                } else {
                    parent[parent1] = parent2;
                }
                if (rank[parent1] == rank[parent2]) rank[parent1]++;
                if (rank[parent2] == 0) rank[parent2] = 1;
            }
        }
    }
}
