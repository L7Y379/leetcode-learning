package hot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class hot_15 {
    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            int n = nums.length;
            Arrays.sort(nums);
            List<List<Integer>> ans = new ArrayList<List<Integer>>();
            // 枚举 a
            for (int first = 0; first < n; ++first) {
                // 需要和上一次枚举的数不相同
                if (first > 0 && nums[first] == nums[first - 1]) {
                    continue;
                }
                // c 对应的指针初始指向数组的最右端
                int third = n - 1;
                int target = -nums[first];
                // 枚举 b
                for (int second = first + 1; second < n; ++second) {
                    // 需要和上一次枚举的数不相同
                    if (second > first + 1 && nums[second] == nums[second - 1]) {
                        continue;
                    }
                    // 需要保证 b 的指针在 c 的指针的左侧
                    while (second < third && nums[second] + nums[third] > target) {
                        --third;
                    }
                    // 如果指针重合，随着 b 后续的增加
                    // 就不会有满足 a+b+c=0 并且 b<c 的 c 了，可以退出循环
                    if (second == third) {
                        break;
                    }
                    if (nums[second] + nums[third] == target) {
                        List<Integer> list = new ArrayList<Integer>();
                        list.add(nums[first]);
                        list.add(nums[second]);
                        list.add(nums[third]);
                        ans.add(list);
                    }
                }
            }
            return ans;
        }
    }

}

//
//class Solution {
//    public List<List<Integer>> threeSum(int[] nums) {
//        List<List<Integer>> list=new ArrayList<List<Integer>>();
//        //return list;
//        if(nums.length<3){
//            return list;
//        }
//        Arrays.sort(nums);
//
//        //System.out.println(toString(nums));
//        for(int i=0;i<=nums.length-1;i++){
//            if (i > 0 && nums[i] == nums[i - 1]) {
//                continue;
//            }
//            int j=i+1;
//            while(j<=nums.length-1){
//                for(int k=j+1;k<=nums.length-1;k++){
//                    if(nums[i]+nums[j]+nums[k]==0){
//                        List<Integer> l=new ArrayList<Integer>();
//                        l.add(nums[i]);
//                        l.add(nums[j]);
//                        l.add(nums[k]);
//                        list.add(l);
//                        break;
//                    }
//                }
//                j++;
//                while(j<=nums.length-1&&nums[j]==nums[j-1]){
//                    j++;
//                }
//            }
//
//        }
//        return list;
//    }
//}