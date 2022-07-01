package everyday;

public class test_673最长递增子序列的个数 {
    int result=0;
    int len_max=1;
    public int findNumberOfLIS(int[] nums) {

        for(int i=0;i<nums.length;i++){
            dfs(nums,i);
        }
        return 1;
    }
    public static void dfs(int[] nums,int i){

    }
}
