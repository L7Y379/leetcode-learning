package jianzhi;

public class jianzhi_59_1 {
    class Solution {
        public int[] maxSlidingWindow(int[] nums, int k) {
            if(nums.length==0)return new int[0];
            int[] result = new int[nums.length-k+1];
            for(int i=0;i<=result.length-1;i++){
                result[i]=getmax(nums,i,i+k-1);
            }
            return result;
        }
        public int getmax(int[] nums,int i,int j){
            int max=nums[i];
            for(int m=i;m<=j;m++){
                if(nums[m]>max){
                    max=nums[m];
                }
            }
            return max;
        }
    }
}
