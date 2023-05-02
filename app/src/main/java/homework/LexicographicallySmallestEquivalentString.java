package homework;

import java.util.stream.Collector;

public class LexicographicallySmallestEquivalentString {
    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        int length = s1.length();
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        UnionFind uf = new UnionFind();
        for (int i = 0; i < length; i++) {
            uf.union(chars1[i] - 'a', chars2[i] - 'a');
        }
        return baseStr.chars()
            .map(x -> x - 'a')
            .map(uf::find)
            .map(x -> x + 'a')
            .mapToObj(Character::toString)
            .collect(Collector.of(
                StringBuilder::new,
                StringBuilder::append,
                StringBuilder::append,
                StringBuilder::toString)
            );
    }

    static class UnionFind {
        int[] parents;

        public UnionFind() {
            parents = new int[27];
            for (int i = 0; i <= 26; i++) {
                parents[i] = i;
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
                if (parent1 < parent2) {
                    parents[parent2] = parent1;
                } else {
                    parents[parent1] = parent2;
                }
            }
        }
    }
}
