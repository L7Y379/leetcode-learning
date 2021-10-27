package jianzhi;

public class jianzhi_53 {
    class Solution {
        public int search(int[] nums, int target) {
            int result=0;
            for(int i=0;i<=nums.length-1;i++){
                if(nums[i]==target){
                    result++;
                }
                if(nums[i]>target){
                    break;
                }
            }
            return result;
        }
    }
}
