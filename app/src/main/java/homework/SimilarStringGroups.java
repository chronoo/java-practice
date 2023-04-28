package homework;

import java.util.*;

public class SimilarStringGroups {
    public int numSimilarGroups(String[] strs) {
        if(strs == null || strs.length == 0)
            return 0;

        int length = strs.length;
        UnionFind uf = new UnionFind(length);

        for(int i=0; i<length; i++){
            for(int j=i+1; j<length; j++){
                if(isSimilar(strs[i], strs[j]))
                    uf.union(i,j);
            }
        }
        return uf.num;
    }

    private boolean isSimilar(String str1, String str2){
        if(str1.equals(str2)) return true;
        int diff = 0;
        for(int i=0; i<str1.length(); i++){
            if(str1.charAt(i) != str2.charAt(i)) diff++;
            if(diff>2) return false;
        }
        return true;
    }
}

class UnionFind{
    int num;
    int[] parent;
    int[] size;

    public UnionFind(int num){
        this.num = num;
        this.parent = new int[num];
        this.size = new int[num];

        for(int i=0; i<num; i++){
            parent[i] = i;
            size[i] = 1;
        }
    }

    public int find(int[] parent, int x){
        if(parent[x] == x) return x;
        return parent[x] = find(parent, parent[x]);
    }

    public void union(int x, int y){
        int p1 = find(parent, x);
        int p2 = find(parent, y);

        if(p1 != p2){
            num--;

            if(size[p1] > size[p2]){
                parent[p2] = p1;
                size[p1] += size[p2];
            } else{
                parent[p1] = p2;
                size[p2] += size[p1];
            }
        }
    }
}
