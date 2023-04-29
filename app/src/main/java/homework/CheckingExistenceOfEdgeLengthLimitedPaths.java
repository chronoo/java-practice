package homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CheckingExistenceOfEdgeLengthLimitedPaths {
    class Node {
        final int number;
        List<Edge> sibling = new ArrayList<>();

        Node(int number) {
            this.number = number;
        }
    }

    class Edge {
        final Node node;
        final int distance;

        Edge(Node node, int distance) {
            this.node = node;
            this.distance = distance;
        }
    }

    public boolean[] distanceLimitedPathsExist(int n, int[][] edgeList, int[][] queries) {
        boolean[] res = new boolean[queries.length];
        Node[] nodes = new Node[n];
        for (int i = 0; i < nodes.length; i++) {
            nodes[i] = new Node(i);
        }

        for (int[] ints : edgeList) {
            nodes[ints[0]].sibling.add(new Edge(nodes[ints[1]], ints[2]));
            nodes[ints[1]].sibling.add(new Edge(nodes[ints[0]], ints[2]));
        }

        for (int k = 0; k < queries.length; k++) {
            int[] query = queries[k];
            TestUnionFind unionFind = new TestUnionFind(n);
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (isAllowed(nodes[i], nodes[j], query[2])) {
                        unionFind.union(i, j);
                    }
                }
            }
            res[k] = unionFind.find(unionFind.parent, query[0]) == unionFind.find(unionFind.parent, query[1]);
        }
        return res;
    }

    private boolean isAllowed(Node firstNode, Node secondNode, int i) {
        for (Edge edge : firstNode.sibling) {
            if (edge.node == secondNode && edge.distance < i) {
                return true;
            }
        }
        return false;
    }
}

class TestUnionFind {
    int num;
    int[] parent;
    int[] size;

    public TestUnionFind(int num) {
        this.num = num;
        this.parent = new int[num];
        this.size = new int[num];

        for (int i = 0; i < num; i++) {
            parent[i] = i;
            size[i] = 1;
        }
    }

    public int find(int[] parent, int x) {
        if (parent[x] == x) return x;
        return parent[x] = find(parent, parent[x]);
    }

    public void union(int x, int y) {
        int p1 = find(parent, x);
        int p2 = find(parent, y);

        if (p1 != p2) {
            num--;

            if (size[p1] > size[p2]) {
                parent[p2] = p1;
                size[p1] += size[p2];
            } else {
                parent[p1] = p2;
                size[p2] += size[p1];
            }
        }
    }
}