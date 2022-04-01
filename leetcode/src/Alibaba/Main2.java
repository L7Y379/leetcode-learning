package Alibaba;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        Set<String> set=new HashSet<String>();
        String[] s_arr=new String[t];
        for(int i=0;i<t;i++){
            s_arr[i]=sc.next();
        }
        for(int i=0;i<t;i++){
            if(s_arr[i].length()<6||s_arr[i].length()>12){
                System.out.println("illegal length");
                continue;
            }
            int k=0;
            for(int j=0;j<s_arr[i].length();j++){
                if(!(s_arr[i].charAt(j)>='a'&&s_arr[i].charAt(j)<='z'||s_arr[i].charAt(j)>='A'&&s_arr[i].charAt(j)<='Z')){
                    System.out.println("illegal charactor");
                    k=1;
                    break;
                }
            }
            if(k==1){
                continue;
            }
            if(set.contains(s_arr[i])){
                System.out.println("acount existed");
            }else {
                set.add(s_arr[i]);
                System.out.println("registration complete");
            }



        }
    }
}
