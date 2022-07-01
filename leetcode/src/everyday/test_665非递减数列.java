package everyday;

import java.util.*;

public class test_665非递减数列 {
    public boolean checkPossibility(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                count++;
                if(count>1){
                    return false;
                }
                if(i>0&&nums[i+1]<nums[i-1]){
                    nums[i+1]=nums[i];
                }else {
                    nums[i]=nums[i+1];
                }
            }
        }
        return true;
    }
//    List<String> res = new LinkedList<>();
//    char[] c;
//    public String[] permutation(String s) {
//        c = s.toCharArray();
//        dfs(0);
//        return res.toArray(new String[res.size()]);
//    }
//    void dfs(int x) {
//        if(x == c.length - 1) {
//            res.add(String.valueOf(c));      // 添加排列方案
//            return;
//        }
//        HashSet<Character> set = new HashSet<>();
//        for(int i = x; i < c.length; i++) {
//            if(set.contains(c[i])) continue; // 重复，因此剪枝
//            set.add(c[i]);
//            swap(i, x);                      // 交换，将 c[i] 固定在第 x 位
//            dfs(x + 1);                      // 开启固定第 x + 1 位字符
//            swap(i, x);                      // 恢复交换
//        }
//    }
//    void swap(int a, int b) {
//        char tmp = c[a];
//        c[a] = c[b];
//        c[b] = tmp;
//    }

    public String[] permutation(String s) {
        char[] c=s.toCharArray();
        Set<String> result=new HashSet<String>();
        dfs(0,c,result);
        System.out.println(result);
        return result.toArray(new String[0]);
    }
    public void dfs(int deep,char[] c,Set<String> result){
        if(deep==c.length-1){
            result.add(String.valueOf(c));
            return;
        }
        for(int i=deep;i<c.length;i++){
            swap(i,deep,c);
            dfs(deep+1,c,result);
            swap(deep,i,c);
        }
    }
    public void swap(int a,int b,char[] c){
        char k=c[a];
        c[a]=c[b];
        c[b]=k;
    }

}
