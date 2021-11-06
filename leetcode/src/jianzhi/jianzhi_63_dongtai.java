package jianzhi;

public class jianzhi_63_dongtai {
    // class Solution {
//     public int maxProfit(int[] prices) {
//         int result=0;
//         if(prices.length==0||prices.length==1){
//             return 0;
//         }
//         int[] num=new int[prices.length-1];
//         for(int i=0;i<=num.length-1;i++){
//             int max=0;
//             for(int j=i+1;j<=prices.length-1;j++){
//                 if(prices[j]-prices[i]>=max){
//                     max=prices[j]-prices[i];
//                 }
//             }
//             num[i]=max;
//         }
//         for(int i:num){
//             if(i>result)result=i;
//         }
//         return result;
//     }
// }



    class Solution {
        public int maxProfit(int[] prices) {
            int cost = Integer.MAX_VALUE, profit = 0;
            for(int price : prices) {
                cost = Math.min(cost, price);
                profit = Math.max(profit, price - cost);
            }
            return profit;
        }
    }


}
