package huawei;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s=in.next();
        char[] s_arr=s.toCharArray();
        Set<Character> set=new HashSet<>();
        String result="";
        for (char c : s_arr) {
            if (!set.contains(c)) {
                set.add(c);
                result = result + c;
            }
        }
        System.out.println(result);
    }
}
