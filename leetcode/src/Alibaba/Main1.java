package Alibaba;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int d=sc.nextInt();
        int[] nums=new int[N*N];
        for(int i=0;i<N*N;i++){
            nums[i]=sc.nextInt();
        }
        int result=0;
        int max_num=Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > max_num) {
                max_num = num;
            }
        }
        for(int num : nums){
            if((max_num-num)%d!=0){
                result=-1;
                break;
            }
            result+=(max_num-num)/d;
        }
        System.out.println(result);
    }
}
