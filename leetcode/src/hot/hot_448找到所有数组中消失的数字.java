package hot;

import java.util.ArrayList;
import java.util.List;

public class hot_448找到所有数组中消失的数字 {
    class Solution {
        public List<Integer> findDisappearedNumbers(int[] nums) {
            int[] k=new int[nums.length];
            List<Integer> result=new ArrayList<Integer>();
            for(int num:nums){
                k[num-1]=1;
            }
            for(int i=0;i<k.length;i++){
                if(k[i]==0){
                    result.add(i+1);
                }
            }
            return result;
        }
    }
}
