import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class test3 {
// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         int length_s=s.length();
//         int Longest_str=1;
//         if(length_s==0){
//             return 0;
//         }
//         int i=1;
//         int long_str=0;
//         String str="";
//         str=str+s.charAt(0);
//         while(i<=length_s-1){
//             if(str.contains(s.charAt(i)+"")){
//                 long_str=str.length();
//                 str=s.charAt(i)+"";
//                 i++;
//                 if(long_str>Longest_str){
//                     Longest_str=long_str;
//                 }
//             }else{
//                 str=str+s.charAt(i);
//                 i++;
//                 long_str=str.length();
//                 if(long_str>Longest_str){
//                     Longest_str=long_str;
//                 }
//             }
//         }
//         return Longest_str;
//     }
// }

    public static int lengthOfLongestSubstring(String s) {
        // 哈希集合，记录每个字符是否出现过
        Set<Character> occ = new HashSet<Character>();
        int n = s.length();
        // 右指针，初始值为 -1，相当于我们在字符串的左边界的左侧，还没有开始移动
        int rk = -1, ans = 0;
        for (int i = 0; i < n; ++i) {
            if (i != 0) {
                // 左指针向右移动一格，移除一个字符
                occ.remove(s.charAt(i - 1));
            }
            while (rk + 1 < n && !occ.contains(s.charAt(rk + 1))) {
                // 不断地移动右指针
                occ.add(s.charAt(rk + 1));
                ++rk;
            }
            // 第 i 到 rk 个字符是一个极长的无重复字符子串
            ans = Math.max(ans, rk - i + 1);
        }
        return ans;
    }
    public static void main(String[] args){
        String s="abcexfchsdbxsdtetgas";
        int result=lengthOfLongestSubstring(s);
        System.out.println(result);
    }
}
