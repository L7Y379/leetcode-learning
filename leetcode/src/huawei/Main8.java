package huawei;

import java.util.*;

public class Main8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] nums=new int[N];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        Set<Integer> set=new TreeSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(Integer i:set){
            System.out.println(i);
        }

//        List<Integer> list=new ArrayList<Integer>();
//        for(int i=0;i<nums.length;i++){
//            if(!list.contains(nums[i])){
//                list.add(nums[i]);
//            }
//        }
//        Collections.sort(list);
//        for(int i=0;i<list.size();i++){
//            System.out.println(list.get(i));
//        }

    }
}
