package meituan;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int result=0;
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        for(int i=1;i<=n;i++){
            for (int j=0;j<n-i+1;j++){
                if(mul_zheng(nums,j,i)){
                    result++;
                }
            }
        }
        System.out.println(result);
    }
    public static boolean mul_zheng(int[] nums,int start,int len){
        int cout_fu1=0;
        for(int i=start;i<start+len;i++){
            if(nums[i]==-1){
                cout_fu1++;
            }
        }
        if(cout_fu1%2==0){
            return true;
        }
        return false;
    }
}
