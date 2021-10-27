package jianzhi;

public class jianzhi_58_2 {
    class Solution {
        public String reverseLeftWords(String s, int n) {
            //StringBuilder str=new StringBuilder(s);
            String str1=s.substring(0,n);
            String str2=s.substring(n);
            return str2+str1;
        }
    }
}
