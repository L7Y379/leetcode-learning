package hot;

public class hot_494目标和_回溯 {
    class Solution {
        int result=0;
        public int findTargetSumWays(int[] nums, int target) {
            dg(nums,target,0,0);
            return result;
        }
        public void dg(int[] nums,int target,int k,int sums){

            int sum1=sums+nums[k];
            int sum2=sums-nums[k];
            if(k==nums.length-1){
                if(sum1==target){
                    result++;
                }
                if(sum2==target){
                    result++;
                }
                return;
            }
            dg(nums,target,k+1,sum1);
            dg(nums,target,k+1,sum2);
        }
    }
}
