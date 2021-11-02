package jianzhi;

public class jianzhi_49 {
    // class Solution {
//     Set<Integer> set=new HashSet<Integer>();
//     public int nthUglyNumber(int n) {
//         int num=1,k=1;
//         set.add(1);
//         while(k!=n){
//             num++;
//             if(res(num)){
//                 set.add(num);
//                 k++;
//             }
//         }
//         return num;
//     }
//     public boolean res(int num){
//         if(set.contains(num)){
//             return true;
//         }
//         int link=num;
//         if(num%2==0){
//             num=num/2;
//         }
//         if(num%3==0){
//             num=num/3;
//         }
//         if(num%5==0){
//             num=num/5;
//         }
//         if(link==num){
//             return false;
//         }
//         return res(num);

//     }
// }

    class Solution {
        public int nthUglyNumber(int n) {
            int[] dp = new int[n + 1];
            dp[1] = 1;
            int p2 = 1, p3 = 1, p5 = 1;
            for (int i = 2; i <= n; i++) {
                int num2 = dp[p2] * 2, num3 = dp[p3] * 3, num5 = dp[p5] * 5;
                dp[i] = Math.min(Math.min(num2, num3), num5);
                if (dp[i] == num2) {
                    p2++;
                }
                if (dp[i] == num3) {
                    p3++;
                }
                if (dp[i] == num5) {
                    p5++;
                }
            }
            return dp[n];
        }
    }

}
