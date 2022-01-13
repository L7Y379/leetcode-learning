package hot;

import java.util.ArrayList;
import java.util.List;

public class hot_78_listback {
    class Solution {
        public List<List<Integer>> subsets(int[] nums) {
            List<List<Integer>> result=new ArrayList<List<Integer>>();
            List<Integer> list=new ArrayList<Integer>();
            back(result,list,0,nums);
            return result;
        }
        public void back(List<List<Integer>> result,List<Integer> list,int k,int[] nums) {
            if(k==nums.length){
                result.add(new ArrayList<Integer>(list));
                return;
            }
            back(result,list,k+1,nums);

            list.add(nums[k]);
            back(result,list,k+1,nums);
            list.remove(list.size()-1);
        }
    }
}
