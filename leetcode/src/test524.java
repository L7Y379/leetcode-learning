import java.util.ArrayList;
import java.util.List;

public class test524 {
    public static String findLongestWord(String s, List<String> dictionary) {
        int n_s=s.length();
        int n_dictionary=dictionary.size();
        String LongestWord=new String();
        System.out.println(LongestWord);
        for(int i=0;i<=n_dictionary-1;i++){
            int n_word=dictionary.get(i).length();
            int j=0,k=0;
            loop:
            while(k<n_s){
                if(dictionary.get(i).charAt(j)==s.charAt(k)){
                    j++;
                    k++;
                }else{
                    k++;
                }
                if(j==n_word){
                    break loop;
                }
            }
            if((j==n_word)&&(j>LongestWord.length())&& (dictionary.get(i).compareTo(s) < 0)){
                LongestWord=dictionary.get(i);
            }


        }
        return LongestWord;
    }
    public static void main(String[] args){
        String s="abce";
        List<String> str_list=new ArrayList<>();
        str_list.add("abe");
        str_list.add("abc");
        String result=findLongestWord(s,str_list);
        System.out.println(result);
    }
    //leetcode
    public static String findLongestWord1(String s, List<String> dictionary) {
        String res = "";
        for (String t : dictionary) {
            int i = 0, j = 0;
            while (i < t.length() && j < s.length()) {
                if (t.charAt(i) == s.charAt(j)) {
                    ++i;
                }
                ++j;
            }
            if (i == t.length()) {
                if (t.length() > res.length() || (t.length() == res.length() && t.compareTo(res) < 0)) {
                    res = t;
                }
            }
        }
        return res;
    }


}
