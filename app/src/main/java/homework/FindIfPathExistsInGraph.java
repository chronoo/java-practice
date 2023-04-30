package homework;

public class FindIfPathExistsInGraph {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        FindUnion fu = new FindUnion(n);
        for (int[] edge : edges) {
            fu.union(edge[0], edge[1]);
        }
        return fu.find(source) == fu.find(destination);
    }
}

class FindUnion {
    int[] parent;
    int[] rank;

    public FindUnion(int n) {
        parent = new int[n];
        rank = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }

    public void union(int first, int second) {
        int parent1 = find(first);
        int parent2 = find(second);
        if (parent1 != parent2) {
            if (rank[parent1] < rank[parent2]) {
                parent[parent1] = parent2;
            } else {
                parent[parent2] = parent1;
            }
            if (rank[parent1] == rank[parent2]) {
                rank[parent1]++;
            }
        }
    }

    public int find(int element) {
        if (element == parent[element]) {
            return parent[element];
        }
        parent[element] = find(parent[element]);
        return parent[element];
    }
}
