package meituan;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args){
        int sa=Integer.parseInt("15");
        System.out.println(sa);
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] nums=new int[m][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                nums[j][i]=sc.nextInt();
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(nums[i][j]);
                if(j!=n-1){
                    System.out.print(" ");
                }
            }
            if(i!=m-1){
                System.out.println();
            }
        }

    }
}
