package t;

import org.junit.jupiter.api.Test;

class GoodsTest {
    @Test
    void test1() {
        Goods obj = new Goods();
        System.out.println(obj.diff(new int[]{3,4,5,7}, new int[]{1,6}));
    }
}