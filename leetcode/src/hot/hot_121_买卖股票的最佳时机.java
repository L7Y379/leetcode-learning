package hot;

public class hot_121_买卖股票的最佳时机 {
    // class Solution {
//     public int maxProfit(int[] prices) {
//         //暴力解
//         int max_lr=0;
//         for(int i=0;i<prices.length-1;i++){
//             for(int j=i+1;j<prices.length;j++){
//                 if(prices[j]-prices[i]>max_lr){
//                     max_lr=prices[j]-prices[i];
//                 }
//             }
//         }
//         return max_lr;
//     }
// }

    public class Solution {
        public int maxProfit(int prices[]) {
            int minprice = Integer.MAX_VALUE;
            int maxprofit = 0;
            for (int i = 0; i < prices.length; i++) {
                if (prices[i] < minprice) {
                    minprice = prices[i];
                } else if (prices[i] - minprice > maxprofit) {
                    maxprofit = prices[i] - minprice;
                }
            }
            return maxprofit;
        }
    }

}
