package jianzhi;

import java.util.HashSet;
import java.util.Set;

public class jianzhi_03 {
    public static int findRepeatNumber(int[] nums) {
        // for(int i=0;i<=nums.length-1;i++){
        //     for(int j=i+1;j<=nums.length-1;j++){
        //         if(nums[i]==nums[j]){
        //             return nums[i];
        //         }
        //     }
        // }
        // return 0;

        Set<Integer> set=new HashSet<Integer>();
        int result =-1;
        for(int eum:nums){
            if(!set.add(eum)){
                result=eum;
                return result;
            }
        }
        return result;
    }
    public static void main(String[] args){
        int[] test_num= {1,2,3,4,5,6,7,8,9,0,5};
        int result=findRepeatNumber(test_num);
        System.out.println(result);
    }
}
