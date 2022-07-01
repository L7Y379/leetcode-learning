package everyday;

public class test_1004最大连续1的个数III {
    public int longestOnes(int[] nums, int k) {
        int left=0;
        int right=0;
        int result=0;
        int num_0=0;
        while(right<nums.length){
            if(nums[right]==0){
                num_0++;
                if(num_0>k){
                    while(nums[left]!=0){
                        left++;
                    }
                    left++;
                }
                result=Math.max(result,right-left+1);
            }else {
                result=Math.max(result,right-left+1);
            }
            right++;
        }
        return result;
    }
}
