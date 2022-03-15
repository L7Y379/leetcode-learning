package meituan;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(luck_num(nums[i])){
                System.out.println("yes");
            }else {
                System.out.println("no");
            }
        }
    }
    public static boolean luck_num(int k){
        if(k%11==0){
            return true;
        }
        int cout_1=0;
        while(k!=0){
            int y=k%10;
            if(y==1){
                cout_1++;
            }
            k=k/10;
        }
        if(cout_1>=2){
            return true;
        }
        return false;
    }
}
