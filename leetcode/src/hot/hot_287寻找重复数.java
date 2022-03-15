package hot;

import java.util.HashSet;
import java.util.Set;

public class hot_287寻找重复数 {
    class Solution {
        // public int findDuplicate(int[] nums) {
        //     for(int i=0;i<nums.length;i++){
        //         for(int j=i+1;j<nums.length;j++){
        //             if(nums[i]==nums[j]){
        //                 return nums[i];
        //             }
        //         }
        //     }
        //     return 0;
        // }

        public int findDuplicate(int[] nums) {
            Set<Integer> set=new HashSet<Integer>();
            for(int i=0;i<nums.length;i++){
                if(!set.contains(nums[i])){
                    set.add(nums[i]);
                }else{
                    return nums[i];
                }
            }

            return 0;
        }
    }
}
