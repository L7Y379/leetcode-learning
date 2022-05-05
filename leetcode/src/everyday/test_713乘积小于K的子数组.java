package everyday;

public class test_713乘积小于K的子数组 {
    // class Solution {
//     int result=0;
//     public int numSubarrayProductLessThanK(int[] nums, int k) {
//         for(int i=0;i<nums.length;i++){
//             dfs(nums,k,nums[i],i);
//         }
//         return result;

//     }
//     public void dfs(int[] nums, int k,int now,int i){
//         if(now>=k){
//             return;
//         }
//         result++;
//         if(i+1<nums.length){
//             dfs(nums,k,now*nums[i+1],i+1);
//         }

//     }
// }

    class Solution {
        public int numSubarrayProductLessThanK(int[] nums, int k) {
            int n = nums.length, ret = 0;
            int prod = 1, i = 0;
            for (int j = 0; j < n; j++) {
                prod *= nums[j];
                while (i <= j && prod >= k) {
                    prod /= nums[i];
                    i++;
                }
                ret += j - i + 1;
            }
            return ret;
        }
    }

}
