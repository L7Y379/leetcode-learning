package hot;

public class hot_279完全平方数_动态规划 {
    class Solution {
        public int numSquares(int n) {
            int[] nums=new int[n+1];
            for(int i=1;i<n+1;i++){
                int min=Integer.MAX_VALUE;
                for(int j=1;j*j<=i;j++){
                    min=Math.min(min,nums[i-j*j]);
                }
                nums[i]=++min;
            }
            return nums[n];
        }
    }

// class Solution {
//     public int numSquares(int n) {
//         int[] f = new int[n + 1];
//         for (int i = 1; i <= n; i++) {
//             int minn = Integer.MAX_VALUE;
//             for (int j = 1; j * j <= i; j++) {
//                 minn = Math.min(minn, f[i - j * j]);
//             }
//             f[i] = minn + 1;
//         }
//         return f[n];
//     }
// }

}
