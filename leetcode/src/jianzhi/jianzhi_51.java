package jianzhi;

public class jianzhi_51 {
    // class Solution {
//     public int reversePairs(int[] nums) {
//         int length_nums=nums.length;
//         if(length_nums==0||length_nums==1){
//             return 0;
//         }
//         int result=0;
//         for(int i=0;i<=length_nums-2;i++){
//             for(int j=i+1;j<=length_nums-1;j++){
//                 if(nums[i]>nums[j]){
//                     result++;
//                 }
//             }
//         }
//         return result;
//     }
// }
    public class Solution {
        public int reversePairs(int[] nums) {
            int len = nums.length;

            if (len < 2) {
                return 0;
            }

            int[] copy = new int[len];
            for (int i = 0; i < len; i++) {
                copy[i] = nums[i];
            }

            int[] temp = new int[len];
            return reversePairs(copy, 0, len - 1, temp);
        }

        private int reversePairs(int[] nums, int left, int right, int[] temp) {
            if (left == right) {
                return 0;
            }

            int mid = left + (right - left) / 2;
            int leftPairs = reversePairs(nums, left, mid, temp);
            int rightPairs = reversePairs(nums, mid + 1, right, temp);

            if (nums[mid] <= nums[mid + 1]) {
                return leftPairs + rightPairs;
            }

            int crossPairs = mergeAndCount(nums, left, mid, right, temp);
            return leftPairs + rightPairs + crossPairs;
        }

        private int mergeAndCount(int[] nums, int left, int mid, int right, int[] temp) {
            for (int i = left; i <= right; i++) {
                temp[i] = nums[i];
            }

            int i = left;
            int j = mid + 1;

            int count = 0;
            for (int k = left; k <= right; k++) {

                if (i == mid + 1) {
                    nums[k] = temp[j];
                    j++;
                } else if (j == right + 1) {
                    nums[k] = temp[i];
                    i++;
                } else if (temp[i] <= temp[j]) {
                    nums[k] = temp[i];
                    i++;
                } else {
                    nums[k] = temp[j];
                    j++;
                    count += (mid - i + 1);
                }
            }
            return count;
        }
    }

}
