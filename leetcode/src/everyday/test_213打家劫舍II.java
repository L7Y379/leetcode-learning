package everyday;

public class test_213打家劫舍II {
    public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        if(nums.length==2){
            return Math.max(nums[0],nums[1]);

        }
        if(nums.length==3){
            return Math.max(nums[0],Math.max(nums[1],nums[2]));
        }

        int[] dp=new int[nums.length-1];
        dp[0]=nums[0];
        dp[1]=nums[1];
        dp[2]=nums[0]+nums[2];
        int max=Math.max(dp[1],dp[2]);
        for(int i=3;i<dp.length;i++){
            dp[i]=Math.max(dp[i-2],dp[i-3])+nums[i];
            max=Math.max(max,dp[i]);
        }
        //System.out.println(max);
        dp[0]=nums[1];
        dp[1]=nums[2];
        dp[2]=nums[1]+nums[3];
        max=Math.max(max,Math.max(dp[1],dp[2]));
        for(int i=3;i<dp.length;i++){
            dp[i]=Math.max(dp[i-2],dp[i-3])+nums[i+1];
            max=Math.max(max,dp[i]);
        }
        return max;
    }
}
