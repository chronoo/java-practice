package homework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class EvaluateDivision {
    public double[] calcEquation(
        List<List<String>> equations,
        double[] values,
        List<List<String>> queries
    ) {
        List<String> words = equations.stream()
            .flatMap(Collection::stream)
            .distinct()
            .toList();
        UnionFind uf = new UnionFind(words.size());
        for (int i = 0; i < equations.size(); i++) {
            List<String> eq = equations.get(i);
            double value = values[i];
            uf.union(words.indexOf(eq.get(0)), words.indexOf(eq.get(1)), value);
        }
        int[] parent = uf.parent;
        for (int j = 0; j < parent.length; j++) {
            parent[j] = uf.find(parent[j]);
        }

        List<Double> res = new ArrayList<>();
        for (List<String> query : queries) {
            int first = words.indexOf(query.get(0));
            int second = words.indexOf(query.get(1));
            if (first == -1 || second == -1) {
                res.add(-1.0);
            } else {
                res.add(uf.rank[first] / uf.rank[second]);
            }
        }

        return res.stream()
            .mapToDouble(Double::doubleValue)
            .toArray();
    }

    class UnionFind {
        int[] parent;
        double[] rank;

        UnionFind(int size) {
            parent = new int[size];
            rank = new double[size];
            for (int i = 0; i < size; i++) {
                parent[i] = i;
                rank[i] = 1;
            }
        }

        int find(int target) {
            if (parent[target] != target) {
                parent[target] = find(parent[target]);
                rank[parent[target]] *=rank[target];
            }
            return parent[target];
        }

        void union(int first, int second, double koeff) {
            parent[second] = first;
            rank[first] = rank[second] * koeff;
        }
    }
}
