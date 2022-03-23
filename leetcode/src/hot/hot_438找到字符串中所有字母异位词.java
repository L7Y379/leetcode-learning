package hot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class hot_438找到字符串中所有字母异位词 {
    // class Solution {
//     public List<Integer> findAnagrams(String s, String p) {
//         List<Integer> result=new ArrayList<Integer>();
//         int len_s=s.length();
//         int len_p=p.length();
//         for(int i=0;i<=len_s-len_p;i++){
//             if(yiweici(s,p,i)){
//                 result.add(i);
//             }

//         }
//         return result;
//     }
//     public boolean yiweici(String s, String p,int start){
//         Map<Character,Integer> map=new HashMap<Character,Integer> ();
//         for(int i=0;i<p.length();i++){
//             if(!map.containsKey(s.charAt(start+i))){
//                 map.put(s.charAt(start+i),1);
//             }else{
//                 map.put(s.charAt(start+i),map.get(s.charAt(start+i))+1);
//             }

//         }
//         for(int i=0;i<p.length();i++){
//             if(!map.containsKey(p.charAt(i))){
//                 return false;
//             }else{
//                 if(map.get(p.charAt(i))==1){
//                     map.remove(p.charAt(i));
//                 }else{
//                     map.put(p.charAt(i),map.get(p.charAt(i))-1);
//                 }
//             }
//         }
//         if(map.isEmpty()){
//             return true;
//         }
//         return false;

//     }
// }


    class Solution {
        public List<Integer> findAnagrams(String s, String p) {
            int sLen = s.length(), pLen = p.length();

            if (sLen < pLen) {
                return new ArrayList<Integer>();
            }

            List<Integer> ans = new ArrayList<Integer>();
            int[] sCount = new int[26];
            int[] pCount = new int[26];
            for (int i = 0; i < pLen; ++i) {
                ++sCount[s.charAt(i) - 'a'];
                ++pCount[p.charAt(i) - 'a'];
            }

            if (Arrays.equals(sCount, pCount)) {
                ans.add(0);
            }

            for (int i = 0; i < sLen - pLen; ++i) {
                --sCount[s.charAt(i) - 'a'];
                ++sCount[s.charAt(i + pLen) - 'a'];

                if (Arrays.equals(sCount, pCount)) {
                    ans.add(i + 1);
                }
            }

            return ans;
        }
    }
}
