package hot;

public class hot_75_sort {
    // class Solution {
//     public void sortColors(int[] nums) {
//         int n = nums.length;
//         int p0 = 0, p2 = n - 1;
//         for (int i = 0; i <= p2; ++i) {
//             while (i <= p2 && nums[i] == 2) {
//                 int temp = nums[i];
//                 nums[i] = nums[p2];
//                 nums[p2] = temp;
//                 --p2;
//             }
//             if (nums[i] == 0) {
//                 int temp = nums[i];
//                 nums[i] = nums[p0];
//                 nums[p0] = temp;
//                 ++p0;
//             }
//         }
//     }
// }

// class Solution {
//     public void sortColors(int[] nums) {
//         int n = nums.length;
//         int p0 = 0, p2 = n - 1;
//         int i=p0,j=p2;
//         while((i<p2&&p0<=p2)||(j>p0&&p0<=p2)){
//             while(i<p2&&nums[i]!=0){
//                 i++;
//             }
//             if(i<=p2&&nums[i]==0){
//                 int temp = nums[i];
//                 nums[i] = nums[p0];
//                 nums[p0] = temp;
//                 if(p0==i){
//                     i++;
//                 }
//                 ++p0;
//             }
//             while(j>p0&&nums[j]!=2){
//                 j--;
//             }
//             if(j>=p0&&nums[j]==2){
//                 int temp = nums[j];
//                 nums[j] = nums[p2];
//                 nums[p2] = temp;
//                 if(p2==j){
//                     j--;
//                 }
//                 --p2;
//             }
//         }
//         // System.out.println(i);
//         // System.out.println(j);
//         // System.out.println(p0);
//         // System.out.println(p2);
//     }
// }

    class Solution {
        public void sortColors(int[] nums) {
            int n = nums.length;
            int p0 = 0, p2 = n - 1;
            int i=p0,j=p2;
            while(i<n){
                while(i<n&&nums[i]!=0){
                    i++;
                }
                if(i<n&&nums[i]==0){
                    int temp = nums[i];
                    nums[i] = nums[p0];
                    nums[p0] = temp;
                    if(p0==i){
                        i++;
                    }
                    ++p0;
                }
            }
            while(j>=0){
                while(j>=0&&nums[j]!=2){
                    j--;
                }
                if(j>=0&&nums[j]==2){
                    int temp = nums[j];
                    nums[j] = nums[p2];
                    nums[p2] = temp;
                    if(p2==j){
                        j--;
                    }
                    --p2;
                }
            }

            // System.out.println(i);
            // System.out.println(j);
            // System.out.println(p0);
            // System.out.println(p2);
        }
    }

}
