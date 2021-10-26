package jianzhi;

import java.util.HashMap;
import java.util.Map;

public class jianzhi_56 {
    class Solution {
        public int singleNumber(int[] nums) {
            Map<Integer,Integer> map=new HashMap<Integer,Integer>();
            for(int i=0;i<=nums.length-1;i++){
                if(map.containsKey(nums[i])){
                    map.replace(nums[i],3);
                }else{
                    map.put(nums[i],1);
                }
            }
            int result=0;
            for(int key:map.keySet()){
                if(map.get(key)==1){
                    result=key;
                }
            }
            return result;
        }
    }
}
