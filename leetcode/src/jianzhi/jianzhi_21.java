package jianzhi;

public class jianzhi_21 {

    public int[] exchange(int[] nums) {
        int nums_length=nums.length;
        if(nums_length==0||nums_length==1){
            return nums;
        }
        int i=0,j=nums_length-1;
        int t=0;
        while(i<j){
            if(nums[i]%2==1){
                i++;
            }
            if(nums[j]%2==0){
                j--;
            }
            if(i<j){
                t=nums[i];
                nums[i]=nums[j];
                nums[j]=t;
            }

        }
        return nums;
    }


}
