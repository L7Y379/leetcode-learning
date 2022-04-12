package everyday;

import java.util.Arrays;

public class test_806写字符串需要的行数 {
    public static void main(String[] args) {
        int[] widths = {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        String S = "abcdefghijklmnopqrstuvwxyz";
        char[] S_arr=S.toCharArray();
        int len=0;
        for(char s:S_arr){
            len+=widths[s-'a'];
        }
        int[] result=new int[2];
        result[0]=len/100+1;
        result[1]=len%100;
        System.out.println(Arrays.toString(result));
    }
}
