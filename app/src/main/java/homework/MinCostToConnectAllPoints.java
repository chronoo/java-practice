package homework;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MinCostToConnectAllPoints {
    public int minCostConnectPoints(int[][] points) {
        List<int[]> edges = new ArrayList<>();

        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                edges.add(new int[]{i, j, Math.abs(points[i][0] - points[j][0]) + Math.abs(points[i][1] - points[j][1])});
            }
        }
        if (edges.size() == 1)
            return edges.get(0)[2];
        edges.sort(Comparator.comparingInt(value -> value[2]));
        UnionFind uf = new UnionFind(edges.size());
        for (int[] edge : edges) {
            uf.union(edge[0], edge[1], edge[2]);
        }
        return uf.cost;
    }

    class UnionFind {
        int[] parents;
        int[] rank;
        int cost = 0;

        UnionFind(int size) {
            parents = new int[size];
            rank = new int[size];
            for (int i = 0; i < size; i++) {
                parents[i] = i;
            }
        }

        int find(int target) {
            if (parents[target] != target) {
                parents[target] = find(parents[target]);
            }
            return parents[target];
        }

        void union(int first, int second, int i) {
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
                cost += i;
            }
        }
    }
}
