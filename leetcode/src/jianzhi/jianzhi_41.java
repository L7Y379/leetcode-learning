package jianzhi;

import java.util.ArrayList;
import java.util.Collections;

public class jianzhi_41 {
    class MedianFinder {
        ArrayList<Integer> nums;

        /** initialize your data structure here. */
        public MedianFinder() {
            nums=new ArrayList<Integer>();
        }

        public void addNum(int num) {
            nums.add(num);
        }

        public double findMedian() {
            double result=0.0;
            if(nums.size()==0){
                return 0.0;
            }
            Collections.sort(nums);
            if(nums.size()%2==0){
                result=((double)nums.get(nums.size()/2)+(double)nums.get(nums.size()/2-1))/2.0;
            }
            if(nums.size()%2==1){
                result=(double)nums.get(nums.size()/2);
            }
            return result;
        }
    }

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
}
