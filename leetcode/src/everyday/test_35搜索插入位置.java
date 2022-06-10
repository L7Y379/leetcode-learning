package everyday;

public class test_35搜索插入位置 {
    public int searchInsert(int[] nums, int target) {
        int i=0;
        int j=nums.length-1;
        while(i<j){
            int mid=(i+j)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]>target){
                j=mid-1;

            }else{
                i=mid+1;
            }
        }
        if(nums[i]<target){
            return i+1;
        }
        return i;
    }
}
