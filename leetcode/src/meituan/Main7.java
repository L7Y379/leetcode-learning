package meituan;

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] nums=new int[m];
        for(int i=0;i<m;i++){
            nums[i]=sc.nextInt();
        }
        int now=1;
        int result=0;
        for(int i=0;i<m;i++){
            if(nums[i]==now){
                now=get_change(nums,now,i,n);
                result++;
            }
        }
        System.out.println(result);

    }
    public static int get_change(int[] nums,int now,int start,int n){
        int[] check=new int[n];
        int k=0;
        while(k!=n-1){
            check[nums[start]-1]=1;
            start++;
            k++;
        }
        for(int i=0;i<n;i++){
            if(check[i]==0){
                return i+1;
            }
        }
        return 0;
    }
}
