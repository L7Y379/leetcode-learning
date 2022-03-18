package hot;

import java.util.ArrayList;
import java.util.List;

public class hot_301删除无效括号 {
    public static List<String> removeInvalidParentheses(String s) {
        List<String> list=new ArrayList<String>();
        char[] s_arr=s.toCharArray();
        int left=0;
        int right=0;
        for(char s_num:s_arr){
            if(s_num=='('){
                left++;
            }
            if(s_num==')'){
                right++;
            }
        }
        return list;
    }
    public static void main(String[] args){

    }
}
