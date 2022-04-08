package huawei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        String input=sc.next();
        String[] arr_s=input.split(",");
        int[] hole=new int[arr_s.length];
        for(int i=0;i<arr_s.length;i++){
            hole[i]=Integer.parseInt(arr_s[i]);

        }
        int l=0,r=0;
        int ans=0;
        while(r<m){
            int min=Integer.MIN_VALUE;
            while(l<m&&hole[l]>=0){
                l++;
            }
            if(l==m)break;
            r=l;
            while (r<m&&hole[r]<0){
                min=Math.max(min,hole[l]);
                r++;
            }
            if(r-l<n){
                l=r;
                continue;
            }
            ans+=((r-l)/n)*(-min);
            for (int j=l;j<r;j++){
                hole[j]-=min;
            }
        }
        System.out.println(ans);
    }
}
