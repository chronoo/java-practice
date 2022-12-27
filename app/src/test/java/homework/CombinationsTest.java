package homework;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CombinationsTest {

    private final Combinations obj = new Combinations();

    @Test
    void test1() {
        List<List<Integer>> result = obj.resolve(new int[]{0, 1, 2, 3, 4, 5, 6, 7}, 2);
        System.out.println(result.size());
        System.out.println(result);
    }
}