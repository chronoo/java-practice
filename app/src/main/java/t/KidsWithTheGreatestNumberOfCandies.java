package t;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        var max = Integer.MIN_VALUE;
        for (var candy : candies) max = Math.max(candy, max);
        var res = new ArrayList<Boolean>();
        for (var candy : candies) res.add(candy + extraCandies >= max);
        return res;
    }
}
