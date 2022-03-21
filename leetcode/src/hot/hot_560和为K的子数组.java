package hot;

public class hot_560和为K的子数组 {
    public static void main(String[] args) {

    }
    public int subarraySum(int[] nums, int k) {
        int[] sums=new int[nums.length];
        int result=0;
        sums[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            sums[i]=nums[i]+sums[i-1];
        }
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                if(i==0){
                    if(sums[j]==k){
                        result++;
                    }
                }else {
                    if(sums[j]-sums[i-1]==k){
                        result++;
                    }
                }
            }
        }
        return result;
    }
}
