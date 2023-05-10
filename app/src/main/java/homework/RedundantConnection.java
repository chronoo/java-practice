package homework;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class RedundantConnection {
    public int[] findRedundantConnection(int[][] edges) {
        IntSummaryStatistics statistics = Arrays.stream(edges)
            .flatMapToInt(Arrays::stream)
            .summaryStatistics();

        for (int i = edges.length-1; i >=0; i--) {
            UnionFind uf = new UnionFind(statistics.getMax());
            for (int j = 0; j < edges.length; j++) {
                if (j!=i) {
                    uf.union(edges[j][0] - 1, edges[j][1] - 1);
                }
            }
            for (int j = 0; j < statistics.getMax(); j++) {
                uf.parents[j] = uf.find(uf.parents[j]);
            }

            if (Arrays.stream(uf.parents).distinct().count() == 1) {
                return edges[i];
            }

        }
        return null;
    }

    class UnionFind {
        int[] parents;
        int[] rank;

        UnionFind(int max) {
            parents = new int[max];
            rank = new int[max];
            for (int i = 0; i < max; i++) {
                parents[i] = i;
            }
        }

        int find(int x) {
            if (parents[x] == x) {
                return x;
            }
            return parents[x] = find(parents[x]);
        }

        void union(int first, int second) {
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
