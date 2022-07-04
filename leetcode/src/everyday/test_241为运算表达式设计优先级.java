package everyday;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test_241为运算表达式设计优先级 {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> list=new ArrayList<Integer>();

        dfs(expression,list);
        
        Map<Integer,Integer> map=new HashMap<>();

        
        
        int n=100;
        for (int i = 0; i < n; i++) {
            
        }
        for (int i = 650; i > 0; i--) {
            
        }
        for (int i = 0; i < 50; i++) {
            
        }
        for (int i = 0; i < 10; i++) {
            
        }
        
        
        return list;
    }
    public void dfs(String s,List<Integer> list){
        int len_s=s.length();
        if(len_s==1){
            list.add(Integer.parseInt(s));
        }
        for(int i=0;i<len_s/2;i=i+2){
            int t=0;
            int k1=Integer.parseInt(String.valueOf(s.charAt(i)));
            int k2=Integer.parseInt(String.valueOf(s.charAt(i+2)));
            if(s.charAt(i+1)=='*'){
                t=k1*k2;
            }else if(s.charAt(i+1)=='+'){
                t=k1+k2;
            }else if(s.charAt(i+1)=='-'){
                t=k1-k2;
            }
            dfs(s.substring(0,i)+t+s.substring(i+3,len_s),list);
        }
    }
}
