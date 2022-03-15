package meituan;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main6 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] nums=new int[n][2];
        for(int i=0;i<n;i++){
            nums[i][0]=sc.nextInt();
            nums[i][1]=sc.nextInt();
        }
        int result=0;
        Set<Integer> set=new HashSet<Integer>();
        for(int i=0;i<n;i++){
            if(!set.contains(nums[i][0])&&!set.contains(nums[i][1])){
                set.add(nums[i][0]);
                set.add(nums[i][1]);
                result++;
            }
        }
        System.out.println(result);

    }


}
