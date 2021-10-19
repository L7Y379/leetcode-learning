package jianzhi;

import java.util.ArrayList;
import java.util.List;

public class jianzhi_10_2 {
    public static int numWays(int n) {
        int result=0;
        if(n<=1){
            return 1;
        }
        int link1=1;
        int link2=1;
        for(int i=0;i<=n-2;i++){
            result=link1+link2;
            if(result>1000000007){
                result=result-1000000007;
            }
            link1=link2;
            link2=result;
        }
        return result;
    }
    public static void main(String[] args){
        int result=numWays(100);
        System.out.println(result);
    }
}
