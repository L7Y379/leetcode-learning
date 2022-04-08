package JD;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int X=sc.nextInt();
        String s=sc.next();
        int k=0;
        long result=X;
        while(k!=N){
            if(s.charAt(k)=='U'){
                result=result/2;
            }
            if(s.charAt(k)=='L'){
                result=result*2;
            }
            if(s.charAt(k)=='R'){
                result=result*2+1;
            }

            k++;
        }
        System.out.println(result);
    }
}
