class Solution {
    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 2, 10};
        System.out.println(stockBuyAndSell(5, arr));
    }
    public static int stockBuyAndSell(int n, int[] prices) {
        int maxProfit = 0;
        
        for (int i = 1; i < n; i++) {
            if (prices[i] > prices[i - 1]) {
                maxProfit = maxProfit + prices[i] - prices[i-1];
            }
        }
        return maxProfit;
    }
}