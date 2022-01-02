package hot;

public class hot_53 {
    // class Solution {
//     public int maxSubArray(int[] nums) {
//         int max=-10001;
//         for(int i=1;i<=nums.length;i++){
//             for(int j=0;j<nums.length-i+1;j++){
//                 int he=0;
//                 for(int k=0;k<i;k++){
//                     he=he+nums[j+k];
//                 }
//                 if(he>max){
//                     max=he;
//                 }
//             }
//         }
//         return max;
//     }
// }

    class Solution {
        public int maxSubArray(int[] nums) {
            int pre = 0, maxAns = nums[0];
            for (int x : nums) {
                pre = Math.max(pre + x, x);
                maxAns = Math.max(maxAns, pre);
            }
            return maxAns;
        }
    }

}
