package everyday;

import java.util.HashSet;
import java.util.Set;

public class test_357统计各位数字都不同的数字个数 {
    public static void main(String[] args) {
        int n=8;
        //int k=100000000;
        //System.out.println(k);
//        int result=0;
//        for(int i=0;i<Math.pow(10,n);i++){
//            Set<Integer> set=new HashSet<>();
//            int k=i;
//            while (k!=0){
//                if(set.contains(k%10)){
//                    result++;
//                    break;
//                }
//                set.add(k%10);
//                k/=10;
//            }
//        }
//        System.out.println((int)Math.pow(10,n)-result);

//        int[] nums=new int[(int)Math.pow(10,n)];
//        nums[0]=1;
//        for(int i=1;i<nums.length;i++){
//            Set<Integer> set=new HashSet<>();
//            int k=i;
//            while (k!=0){
//                if(set.contains(k%10)){
//                    break;
//                }
//                set.add(k%10);
//                k/=10;
//            }
//            if(k==0){
//                nums[i]=nums[i-1]+1;
//
//            }else {
//                nums[i]=nums[i-1];
//            }
//        }
//        System.out.println(nums[(int)Math.pow(10,n)-1]);

        if (n == 0) {
            System.out.println(1);
        }
        if (n == 1) {
            System.out.println(10);
        }
        int res = 10, cur = 9;
        for (int i = 0; i < n - 1; i++) {
            cur *= 9 - i;
            res += cur;
        }
        System.out.println(res);

    }
}
