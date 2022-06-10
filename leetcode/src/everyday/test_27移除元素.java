package everyday;

public class test_27移除元素 {
    public int removeElement(int[] nums, int val) {
        int len=nums.length;
        if(len==0){
            return 0;
        }
        int i=0;
        int j=len-1;
        while(i<j){
            while(i<j&&nums[i]!=val){
                i++;
            }
            while(i<j&&nums[j]==val){
                j--;
            }
            if(i<j){
                nums[i]=nums[j];
                nums[j]=val;
            }
        }
        if(nums[j]==val){
            return j;
        }
        return j+1;

    }
}
