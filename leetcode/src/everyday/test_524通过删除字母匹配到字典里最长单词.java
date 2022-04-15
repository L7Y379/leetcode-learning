package everyday;

import java.util.List;

public class test_524通过删除字母匹配到字典里最长单词 {
    class Solution {
        public String findLongestWord(String s, List<String> dictionary) {
            int max=0;
            String max_s="";
            for(int i=0;i<dictionary.size();i++){
                int j=0;
                int k=0;
                int len=0;
                while(j<s.length()){
                    if(s.charAt(j)==dictionary.get(i).charAt(k)){
                        k++;
                    }
                    if(k>=dictionary.get(i).length()){
                        len=dictionary.get(i).length();
                        break;
                    }
                    j++;
                }
                if(len>max){
                    max=len;
                    max_s=dictionary.get(i);
                }
                if(len==max){
                    if(dictionary.get(i).compareTo(max_s)<0){
                        max_s=dictionary.get(i);
                    }
                }
            }
            return max_s;
        }
    }
}
