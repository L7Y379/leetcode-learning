package hot;

import java.util.HashMap;
import java.util.Map;

public class hot_136只出现一次的数字_map遍历 {
    class Solution {
        public int singleNumber(int[] nums) {
            //Set<Integer> nums_set=new HashSet<Integer>();
            Map<Integer,Integer> nums_map=new HashMap<Integer,Integer>();
            int result =0;
            for(int num:nums){
                if(!nums_map.containsKey(num)){
                    nums_map.put(num,1);
                }else{
                    nums_map.put(num,2);
                }
            }
            for(Map.Entry<Integer, Integer> entry : nums_map.entrySet()){
                if(entry.getValue()==1){
                    result=entry.getKey();
                }
                System.out.println("key = " + entry.getKey() + ", value = " + entry.getValue());
            }
            return result;
        }
    }
}
