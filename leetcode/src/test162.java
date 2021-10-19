import java.util.ArrayList;
import java.util.List;

public class test162 {
    // class Solution {
//     public int findPeakElement(int[] nums) {
//         //int[] link=new int(3);
//         int i=0,j=nums.length-1;
//         if(j==0){
//             return 0;
//         }
//         if(j==1){
//             if(nums[i]>nums[j]){
//                 return i;
//             }
//             if(nums[j]>nums[i]){
//                 return j;
//             }
//         }
//         int mid=(i+j)/2;
//         while(i<(j-1)){
//             if((nums[mid]>nums[mid-1]&&nums[mid]>nums[mid+1])){
//                 return mid;
//             }else if(nums[j]>=nums[i]){
//                 i=mid;
//                 mid=(i+j)/2;
//             }else if(nums[i]>nums[j]){
//                 j=mid;
//                 mid=((i+j)%2==0)?mid:mid+1;
//             }
//         }
//         if(nums[0]>=nums[nums.length-1]){
//             return 0;
//         }
//         if(nums[0]<nums[nums.length-1]){
//             return nums.length-1;
//         }
//         return 0;
//     }
// }

    public static int findPeakElement(int[] nums) {
            int idx = 0;
            for (int i = 1; i < nums.length; ++i) {
                if (nums[i] > nums[idx]) {
                    idx = i;
                }
            }
            return idx;
    }
    public static void main(String[] args){
        int[] nums=new int[]{6,5,4,3,2,1};
        int result=findPeakElement(nums);
        System.out.println(result);
        String s="asf"+'a';
        System.out.println(s);
    }
}
