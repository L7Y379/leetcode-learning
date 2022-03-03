package hot;

public class hot_169多数元素_cout {
    class Solution {
        // public int majorityElement(int[] nums) {
        //     Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        //     int result=0;
        //     for(int num:nums){
        //         if(!map.containsKey(num)){
        //             map.put(num,1);

        //         }else{
        //             map.put(num,map.get(num)+1);

        //         }
        //         if(map.get(num)>nums.length/2){
        //                 result= num;
        //                 break;
        //             }

        //     }
        //     return result;

        // }
        public int majorityElement(int[] nums) {
            int count = 0;
            Integer candidate = null;

            for (int num : nums) {
                if (count == 0) {
                    candidate = num;
                }
                count += (num == candidate) ? 1 : -1;
            }

            return candidate;
        }
    }
}
