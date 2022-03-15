package hot;

public class hot_283移动零 {
    // class Solution {
//     public void moveZeroes(int[] nums) {
//         int k=0;
//         for(int i=0;i<nums.length-1;i++){
//             if(nums[i]==0){
//                 for(int j=i;j<nums.length-1;j++){
//                     if(nums[j]==0&&nums[j+1]!=0){
//                         nums[j]=nums[j+1];
//                         nums[j+1]=0;
//                     }
//                 }
//                 k++;
//                 if(k<nums.length-i){
//                     i--;
//                 }
//                 //
//             }

//         }
//     }
// }

    class Solution {
        public void moveZeroes(int[] nums) {
            int index = 0;
            for (int num : nums) {
                if (num != 0) {
                    nums[index++] = num;
                }
            }
            for (int i = index; i < nums.length; i++) {
                nums[i] = 0;
            }
        }
    }
}
