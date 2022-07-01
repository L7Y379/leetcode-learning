package huawei;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] arr_s=s.split(" ");
        System.out.println(arr_s[arr_s.length-1].length());
    }
}
