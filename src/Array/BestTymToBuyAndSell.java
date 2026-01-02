package Array;

public class BestTymToBuyAndSell {
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        System.out.println("Maximum profit is: " + maxProfit(arr));
    }
    public static int maxProfit(int[] prices) {
        int bestbuy = prices[0];
        int maxProfit = 0;

        for(int i=1;i<prices.length;i++)
        {
            bestbuy = Math.min(bestbuy,prices[i]);
            maxProfit = Math.max(maxProfit,prices[i]-bestbuy);
        }
        return maxProfit;
    }
}
