package everyday;

import java.util.Arrays;

public class test_698划分为k个相等的子集 {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        if(sum%k!=0){
            return false;
        }
        int target=sum/k;
        Arrays.sort(nums);
        int[] link=new int[nums.length];
        while(true){
            int t=0;
            for(int i=0;i<nums.length;i++){
                if(link[i]==0){
                    if(t+nums[i]<=target){
                        t+=nums[i];
                        link[i]=1;

                    }else if(t+nums[i]>target){
                    }
                    if(t==target){
                        break;
                    }
                }
            }

        }
    }
}
