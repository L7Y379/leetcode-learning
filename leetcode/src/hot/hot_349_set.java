package hot;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class hot_349_set {
    class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            Set set =new HashSet();
            List<Integer> list=new ArrayList<Integer>();
            for(int i=0;i<nums1.length;i++){
                set.add(nums1[i]);
            }
            for(int i=0;i<nums2.length;i++){
                if(set.contains(nums2[i])){
                    if(!list.contains(nums2[i])){
                        list.add(nums2[i]);
                    }

                }

            }
            Integer[] intteger=list.toArray(new Integer[0]);
            int[] result=new int[list.size()];
            for(int j=0;j<result.length;j++){
                result[j]=intteger[j].intValue();
            }
            return result;
        }
    }

// class Solution {
//     public int[] intersection(int[] nums1, int[] nums2) {
//         Arrays.sort(nums1);
//         Arrays.sort(nums2);
//         int length1 = nums1.length, length2 = nums2.length;
//         int[] intersection = new int[length1 + length2];
//         int index = 0, index1 = 0, index2 = 0;
//         while (index1 < length1 && index2 < length2) {
//             int num1 = nums1[index1], num2 = nums2[index2];
//             if (num1 == num2) {
//                 // 保证加入元素的唯一性
//                 if (index == 0 || num1 != intersection[index - 1]) {
//                     intersection[index++] = num1;
//                 }
//                 index1++;
//                 index2++;
//             } else if (num1 < num2) {
//                 index1++;
//             } else {
//                 index2++;
//             }
//         }
//         return Arrays.copyOfRange(intersection, 0, index);
//     }
// }

}
