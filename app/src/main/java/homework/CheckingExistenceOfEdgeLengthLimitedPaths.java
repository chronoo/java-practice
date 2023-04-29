package homework;

import java.util.Arrays;
import java.util.Comparator;

public class CheckingExistenceOfEdgeLengthLimitedPaths {
    public boolean[] distanceLimitedPathsExist(int n, int[][] edgeList, int[][] queries) {
        TestUnionFind dsu = new TestUnionFind(n);
        for (int i = 0; i < queries.length; i++) {
            queries[i] = new int[] { queries[i][0], queries[i][1], queries[i][2], i };
        }

        Arrays.sort(queries, Comparator.comparingInt(a -> a[2]));
        Arrays.sort(edgeList, Comparator.comparingInt(a -> a[2]));

        int i = 0;
        boolean[] res = new boolean[queries.length];
        for (int[] q : queries) {
            while (i < edgeList.length && edgeList[i][2] < q[2]) {
                dsu.union(edgeList[i][0], edgeList[i][1]);
                i++;
            }

            if (dsu.find(q[0]) == dsu.find(q[1])) {
                res[q[3]] = true;
            }
        }

        return res;
    }
}

class TestUnionFind {
    private int[] parent;
    private int[] rank;

    public TestUnionFind(int n) {
        parent = new int[n];
        rank = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }

    public int find(int x) {
        if (parent[x] == x) {
            return x;
        }
        return parent[x] = find(parent[x]);
    }

    public boolean union(int x, int y) {
        int xset = find(x), yset = find(y);
        if (xset != yset) {
            if (rank[xset] < rank[yset]) {
                parent[xset] = yset;
            } else {
                parent[yset] = xset;
            }
            if (rank[xset] == rank[yset]) {
                rank[xset]++;
            }
            return true;
        }
        return false;
    }
}