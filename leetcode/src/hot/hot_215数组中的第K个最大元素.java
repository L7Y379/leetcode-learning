package hot;

public class hot_215数组中的第K个最大元素 {
    class Solution {
        public int findKthLargest(int[] nums, int k) {
            int m=0;
            int max=-10000;
            for(int j=0;j<k;j++){
                for(int i=0;i<nums.length;i++){
                    if(i==0){
                        max=nums[i];
                        m=0;
                    }
                    if(nums[i]>=max){
                        m=i;
                        max=nums[i];
                    }
                }
                nums[m]=-10000;
            }

            return max;
        }
    }
}
