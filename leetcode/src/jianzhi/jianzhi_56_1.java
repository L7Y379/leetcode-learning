package jianzhi;

public class jianzhi_56_1 {
    // class Solution {
//     public int[] singleNumbers(int[] nums) {
//         Map<Integer,Integer> map=new HashMap<Integer,Integer>();
//         for(int i=0;i<=nums.length-1;i++){
//             if(!map.containsKey(nums[i])){
//                 map.put(nums[i],1);
//             }else{
//                 map.replace(nums[i], 2);
//             }

//         }
//         int[] result=new int[2];
//         int k=0;
//         for(int key:map.keySet()){
//             // System.out.println(key);
//             // System.out.println(map.get(key));
//             if(map.get(key)==1){
//                 result[k]=key;
//                 k++;
//             }
//         }
//         return result;
//     }
// }

    class Solution {
        public int[] singleNumbers(int[] nums) {
            int ret = 0;
            for (int n : nums) {
                ret ^= n;
            }
            int div = 1;
            while ((div & ret) == 0) {
                div <<= 1;
            }
            int a = 0, b = 0;
            for (int n : nums) {
                if ((div & n) != 0) {
                    a ^= n;
                } else {
                    b ^= n;
                }
            }
            return new int[]{a, b};
        }
    }



}
