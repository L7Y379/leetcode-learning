package Tencent;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] s=new String[n];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        //System.out.println(Arrays.toString(s));
        int len=s[0].length();//4
        String[] s_now=new String[len];
        int[] num_now=new int[len];
        for(int i=0;i<len;i++){
            String str="";
            int j=0;
            while(j<n&&s[j].charAt(i)=='0'){
                j++;
            }
            //System.out.println("555");
            while (j<n){
                str+=s[j].charAt(i);
                j++;
            }
            //System.out.println(str);
            if(str==""){
                num_now[i]=0;
            }else {
                num_now[i]=Integer.parseInt(str);
            }

            //System.out.println("666");
        }

        Arrays.sort(num_now);
        for(int i=0;i<len-1;i++){
            System.out.print(num_now[i]+" ");
        }
        System.out.print(num_now[len-1]);
    }
}
