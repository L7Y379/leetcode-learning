package everyday;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class test_1051高度检查器 {
    public int heightChecker(int[] heights) {
        int[] expected=new int[heights.length];
        for(int i=0;i<expected.length;i++){
            expected[i]=heights[i];
        }
        Arrays.sort(expected);
        int result=0;
        for(int i=0;i<expected.length;i++){
            if(expected[i]!=heights[i]){
                result++;
            }
        }
        return result;
    }
}
