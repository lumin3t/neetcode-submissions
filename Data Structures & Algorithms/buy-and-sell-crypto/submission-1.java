class Solution {
    public int maxProfit(int[] prices) {
        int l = 0, max = 0;
        for (int r=0; r<prices.length; r++) {
            if (prices[r]<prices[l]) {
                // new lowest found;
                l = r;
            }
            int curr = prices[r] - prices[l];
            max = Math.max(curr, max);
        }
        return max;
    }
}
