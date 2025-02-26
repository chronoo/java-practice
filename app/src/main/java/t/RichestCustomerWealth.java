package t;

public class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        var max = 0;
        for (var account : accounts) {
            var sum = 0;
            for (var bank : account) {
                sum += bank;
            }
            max = Math.max(max, sum);
        }
        return max;
    }
}
