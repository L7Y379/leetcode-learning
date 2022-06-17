package everyday;

import java.util.HashSet;
import java.util.Set;

public class test_532数组中的k_diff数对 {
    public int findPairs(int[] nums, int k) {
        Set<Integer> set=new HashSet<Integer>();
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]-nums[j]==k||nums[j]-nums[i]==k){
                    int t=Math.min(nums[i],nums[j]);
                    set.add(t);
                }
            }
        }
        return set.size();
    }
    public static String reverseWords(String s) {
        String[] strs=s.split(" ");
        for(int i=0;i<strs.length;i++){
            System.out.println(strs[i]);
        }
        String result=strs[strs.length-1];
        for(int i=strs.length-2;i>=0;i--){
            if(!strs[i].equals(" ")){
                result=result+" "+strs[i];
            }
        }
        //result+=strs[0];
        return result;
    }
    public static void main(String[] args) {
        System.out.println(reverseWords("  hello world!  "));
    }
}
