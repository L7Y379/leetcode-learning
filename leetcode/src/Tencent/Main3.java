package Tencent;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String s=sc.nextLine();
        long[] left=new long[n];
        long[] right=new long[n];
        if((s.charAt(0)-'0')==0){
            left[0]=1;
        }
        if((s.charAt(n-1)-'0')==1){
            right[n-1]=n;
        }
        for (int i=1;i<n;i++){
            int k1=0;
            int k2=0;
            int j=n-i-1;
            if((s.charAt(i)-'0')==0){
                k1=i+1;
            }
            if((s.charAt(j)-'0')==1){
                k2=j+1;
            }
            left[i]=left[i-1]+k1;
            right[j]=right[j+1]+k2;
        }
        long result=right[0];
        for(int i=0;i<n-1;i++){
            result=Math.min(result,Math.abs(left[i]-right[i+1]));
        }
        System.out.println(result);
    }
}
