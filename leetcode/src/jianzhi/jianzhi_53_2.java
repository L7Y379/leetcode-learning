package jianzhi;

public class jianzhi_53_2 {
    class Solution {
        public int missingNumber(int[] nums) {
            if(nums[0]!=0){
                return 0;
            }
            if(nums[nums.length-1]!=nums.length){
                return nums.length;
            }
            int i=0;
            int j=nums.length-1;
            while(i<j-1){
                if(nums[(i+j)/2]*2<nums[i]+nums[j]){
                    i=(i+j)/2;
                }else{
                    j=(i+j)/2;
                }
            }
            return (nums[i]+nums[j])/2;
        }
    }
}
