package jianzhi;

import java.util.Arrays;

public class jianzhi_45 {
    // class Solution {
//     public String minNumber(int[] nums) {
//         if(nums.length==0){
//             return null;
//         }
//         if(nums.length==1){
//             return ""+nums[0];
//         }
//         String[] s_nums=new String[nums.length];
//         for(int i=0;i<=s_nums.length-1;i++){
//             Integer k = new Integer(nums[i]);
//             s_nums[i]=k.toString();
//         }
//         for(int m=0;m<=s_nums.length-1;m++){
//             for(int n=0;n<=s_nums.length-m-2;n++){
//                 if((s_nums[n]+s_nums[n+1]).compareTo(s_nums[n+1]+s_nums[n])>0){
//                     String s=new String(s_nums[n]);
//                     s_nums[n]=s_nums[n+1];
//                     s_nums[n+1]=s;
//                 }
//             }
//         }
//         String result="";
//         for(int z=0;z<=s_nums.length-1;z++){
//             result+=s_nums[z];
//         }
//         return result;
//     }
// }

    class Solution {
        public String minNumber(int[] nums) {
            String[] strs = new String[nums.length];
            for(int i = 0; i < nums.length; i++)
                strs[i] = String.valueOf(nums[i]);
            Arrays.sort(strs, (x, y) -> (x + y).compareTo(y + x));
            StringBuilder res = new StringBuilder();
            for(String s : strs)
                res.append(s);
            return res.toString();
        }
    }

}
