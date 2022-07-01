package huawei;

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String c=sc.next();
        char link=c.charAt(0);
        System.out.println(c);
        int result=0;
        if(link>='a'&&link<='z'||link>='A'&&link<='Z'){
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)>='a'&&s.charAt(i)<='z'||s.charAt(i)>='A'&&s.charAt(i)<='Z'){
                    if(s.charAt(i)==link||s.charAt(i)-link==32||s.charAt(i)-link==-32){
                        result++;
                    }
                }
            }
        }else {
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)==link){
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}
