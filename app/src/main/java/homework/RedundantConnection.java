package homework;

public class RedundantConnection {
    public int[] findRedundantConnection(int[][] edges) {
        UnionFind uf = new UnionFind(edges.length + 1);
        int[] result = null;
        for (int[] edge : edges) {
            int parent1 = uf.find(edge[0]);
            int parent2 = uf.find(edge[1]);
            if (parent1 != parent2) {
                uf.union(edge[0], edge[1]);
            } else {
                result = edge;
            }
        }
        return result;
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
