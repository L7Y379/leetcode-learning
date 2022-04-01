package Alibaba;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[][] nums=new int[n][3];
        for(int i=0;i<n;i++){
            nums[i][0]=sc.nextInt();
            nums[i][1]=sc.nextInt();
            nums[i][2]=sc.nextInt();
        }
        if(n==1){
            System.out.println(0);
            return;
        }
        int result=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(!(nums[i][0]==0&&nums[j][0]==0||nums[i][1]==0&&nums[j][1]==0)){

                }
            }
        }

    }
}
