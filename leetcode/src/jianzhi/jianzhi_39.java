package jianzhi;

public class jianzhi_39 {
    // class Solution {
//     public int majorityElement(int[] nums) {
//         //暴力解法
//         Arrays.sort(nums);
//         int length_nums=nums.length;
//         return nums[length_nums/2];
//     }
// }

    class Solution {
        public int majorityElement(int[] nums) {
            int count = 0;
            Integer candidate = null;

            for (int num : nums) {
                if (count == 0) {
                    candidate = num;
                }
                count += (num == candidate) ? 1 : -1;
            }

            return candidate;
        }
    }

}
