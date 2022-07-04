package hot;

public class hot_198打家劫舍_动态规划 {
    class Solution {
        public int rob(int[] nums) {
            if (nums == null || nums.length == 0) {
                return 0;
            }
            int length = nums.length;
            if (length == 1) {
                return nums[0];
            }
            int[] dp = new int[length];
            dp[0] = nums[0];
            dp[1] = Math.max(nums[0], nums[1]);
            for (int i = 2; i < length; i++) {
                dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
            }
            return dp[length - 1];
        }
    }
































    public int rob(int[] nums) {
        int[] dp=new int[nums.length];
        if(nums.length<=2){
            return Math.max(nums[0],nums[1]);
        }
        dp[0]=nums[0];
        dp[1]=nums[1];
        dp[2]=nums[0]+nums[2];
        for(int i=3;i<dp.length;i++){
            dp[i]=Math.max(dp[i-3],dp[i-2])+nums[i];
        }
        int max=0;
        for(int num:nums){
            if(num>max){
                max=num;
            }
        }
        return max;
    }
}
