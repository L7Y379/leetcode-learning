package hot;

public class hot_34 {
    class Solution {
        public int[] searchRange(int[] nums, int target) {
            int[] result={-1,-1};
            int i=0;
            int j=nums.length-1;
            while(i<=j){
                int mid=(i+j)/2;
                if(nums[mid]==target){
                    int m=mid;
                    while(m>=i&&nums[m]==target){
                        m--;
                    }
                    m++;
                    int n=mid;
                    while(n<=j&&nums[n]==target){
                        n++;
                    }
                    n--;
                    result[0]=m;
                    result[1]=n;
                    break;
                }
                if(nums[mid]>target){
                    j=mid-1;
                }
                if(nums[mid]<target){
                    i=mid+1;
                }
            }
            return result;
        }
    }
}
