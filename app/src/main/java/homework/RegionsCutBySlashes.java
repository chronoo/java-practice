package homework;

public class RegionsCutBySlashes {
    public int regionsBySlashes(String[] grid) {
        int length = grid.length;
        UnionFind uf = new UnionFind(length * length * 4);
        for (int i = 0; i < length; i++) {
            String s = grid[i];
            char[] charArray = s.toCharArray();
            for (int j = 0; j < charArray.length; j++) {
                int first = (i * length + j) * 4;
                int second = (i * length + j) * 4 + 1;
                int third = (i * length + j) * 4 + 2;
                int forth = (i * length + j) * 4 + 3;
                char c = charArray[j];
                if (c == '\\') {
                    uf.union(first, second);
                    uf.union(third, forth);
                }
                if (c == '/') {
                    uf.union(first, forth);
                    uf.union(second, third);
                }
                if (c == ' ') {
                    uf.union(first, second);
                    uf.union(second, third);
                    uf.union(third, forth);
                    uf.union(forth, first);
                }
                if (i > 0) uf.union(first, ((i - 1) * length + j) * 4 + 2);
                if (j < length - 1) uf.union(second, (i * length + j + 1) * 4 + 3);
                if (i < length - 1) uf.union(third, ((i + 1) * length + j) * 4);
                if (j > 0) uf.union(forth, (i * length + j - 1) * 4 + 1);
            }
        }

        return uf.count;
    }

    static class UnionFind {
        int[] parents;
        int count;

        public UnionFind(int size) {
            parents = new int[size];
            for (int i = 0; i < size; i++) {
                parents[i] = i;
            }
            count = size;
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
                if (parent1 < parent2) {
                    parents[parent2] = parent1;
                } else {
                    parents[parent1] = parent2;
                }
                count--;
            }
        }
    }
}
