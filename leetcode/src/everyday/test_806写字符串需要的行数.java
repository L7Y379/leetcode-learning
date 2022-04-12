package everyday;

import java.util.Arrays;

public class test_806写字符串需要的行数 {
    public static void main(String[] args) {
        int[] widths = {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        String s = "abcdefghijklmnopqrstuvwxyz";
        char[] S_arr=s.toCharArray();
        int len=0;
        int[] result=new int[2];
        for(char c:S_arr){
            int k=widths[c-'a'];
            if(len+k<=100){
                len+=k;
            }else {
                len=k;
                result[0]++;
            }

        }
        result[0]++;
        result[1]=len;

        System.out.println(Arrays.toString(result));
    }
}
