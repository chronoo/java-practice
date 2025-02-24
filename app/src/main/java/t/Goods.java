package t;

import java.util.Arrays;

public class Goods {
    public int diff(int[] goods, int[] wishes) {
        var diff = 0;
        Arrays.sort(goods);
        Arrays.sort(wishes);
        var goodsI = 0;
        var isOver = false;
        for (var wish : wishes) {
            while (!isOver) {
                var current = goods[goodsI];
                if (wish == current) break;
                if (Math.abs(goods[goodsI + 1] - wish) >= Math.abs(wish - current)) {
                    diff += Math.abs(wish - current);
                    break;
                } else {
                    if (++goodsI == goods.length - 1) isOver = true;
                }
            }
            if (isOver) diff += Math.abs(wish - goods[goods.length - 1]);
        }
        return diff;
    }
}
