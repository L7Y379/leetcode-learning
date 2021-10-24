package jianzhi;

import java.util.HashMap;
import java.util.Map;

public class jianzhi_50 {
    class Solution {
        public char firstUniqChar(String s) {
            // if(s.length()==0){
            //     return ' ';
            // }
            // char[] char_s=s.toCharArray();
            // for(int i=0;i<=s.length()-1;i++){
            //     char link=char_s[i];
            //     int k=0;
            //     for(int j=0;j<=s.length()-1;j++){
            //         if(link==char_s[j]){
            //             k++;
            //         }
            //     }
            //     if(k==1){
            //         return link;
            //     }
            // }
            // return ' ';


            // if (s.equals("")) return ' ';
            // //创建‘a'-'z'的字典
            // int[] target = new int[26];
            // //第一次遍历，将字符统计到字典数组
            // for (int i = 0; i < s.length(); i++) {
            //     target[s.charAt(i) - 'a']++;
            // }
            // //第二次遍历，从字典数组获取次数
            // for (int i = 0; i < s.length(); i++) {
            //     if (target[s.charAt(i) - 'a'] == 1) return s.charAt(i);
            // }

            // return ' ';

            Map<Character, Boolean> dic = new HashMap<>();

            char[] array = s.toCharArray();

            for (char c : array) {
                dic.put(c, !dic.containsKey(c));
            }

            for (char c : array) {
                if (dic.get(c)) return c;
            }

            return ' ';

        }
    }
}
