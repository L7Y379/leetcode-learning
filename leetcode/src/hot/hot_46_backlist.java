package hot;

import java.util.ArrayList;
import java.util.List;

public class hot_46_backlist {
    public List<List<Integer>> permute(int[] nums) {
        int length_nums=nums.length;
        int[] nn=new int[length_nums];
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        List<Integer> list=new ArrayList<Integer>();
        back(nums,nn,result,list,0);
        System.out.println(result);
        return result;
    }
    public void back(int[] nums,int[] nn,List<List<Integer>> result,List<Integer> list,int k) {
        if(k==nums.length){
            result.add(new ArrayList<>(list));
            //System.out.println(result);
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(nn[i]==0){
                list.add(nums[i]);
                nn[i]=1;
                k++;
                back(nums,nn,result,list,k);
                nn[i]=0;
                k--;
                list.remove(list.size() - 1);

            }

        }
    }
    public static void main(String[] args){
        hot_46_backlist hh=new hot_46_backlist();
        int[] candidates={1,2,3};
        hh.permute(candidates);
    }
}
