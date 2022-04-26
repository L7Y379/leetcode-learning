package Tencent;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String ad = sc.nextLine();
        long[] latt = new long[n];
        long[] rdef = new long[n];
        if((ad.charAt(0)-'0')==0)latt[0] = 1;
        if((ad.charAt(n-1)-'0')==1)rdef[n-1] = n;
        for(int i = 1 ; i < n;i++)
        {
            int j = n-i-1;
            int att = 0,def = 0;
            if((ad.charAt(i)-'0')==0)
                att = i+1;
            if((ad.charAt(j)-'0')==1)
                def = j+1;
            latt[i] = latt[i-1]+att;
            rdef[j] = rdef[j+1]+def;
        }
        long ans = rdef[0];
        for(int k = 0 ; k<n-1;k++)
        {
            ans=Math.min(ans,Math.abs(latt[k]-rdef[k+1]));
        }
        System.out.println(ans);
    }
}
