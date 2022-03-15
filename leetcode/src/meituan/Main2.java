package meituan;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){
        int m,n;
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            m=sc.nextInt();
            n=sc.nextInt();
            if(m>=100&&m<=n&&n<=999){
                int t=0;
                for(int i=m;i<=n;i++){
                    if(get_sxh(i)){
                        System.out.print(i+" ");
                        t++;
                    }
                }
                if(t==0){
                    System.out.println("no");
                }
            }else {
                System.out.println("no");
            }

        }
    }
    public static boolean get_sxh(int i){
        int sxh=i;
        int k1=i%10;
        i=i/10;
        int k2=i%10;
        int k3=i/10;
//        System.out.println(k1);
//        System.out.println(k2);
//        System.out.println(k3);
        if((k1*k1*k1+k2*k2*k2+k3*k3*k3)==sxh){
            return true;
        }
        return false;
    }
}
