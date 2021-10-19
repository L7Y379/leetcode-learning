import java.util.ArrayList;
import java.util.List;

public class test9 {
    public static boolean isPalindrome1(int x) {
        if(x<0){
            return false;
        }
        String link=""+x;
        int length_link=link.length();
        for(int i=0;i<length_link/2;i++){
            if(link.charAt(i)!=link.charAt(length_link-i-1)){
                return false;
            }
        }
        return true;
    }


    public static boolean isPalindrome2(int x) {
        if(x<0){
            return false;
        }
        // if(x==0){
        //     return true;
        // }
        int length_x=0;
        List<Integer> x_list=new ArrayList<Integer>();
        while(x!=0){
            x_list.add(x%10);
            length_x=length_x+1;
            x=x/10;
        }
        for(int i=0;i<length_x/2;i++){
            if(x_list.get(i)!=x_list.get(length_x-i-1)){
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome3(int x) {
        if(x<0){
            return false;
        }
        List<Integer> x_list=new ArrayList<Integer>();
        while(x!=0){
            x_list.add(x%10);
            x=x/10;
        }
        for(int i=0;i<x_list.size()/2;i++){
            if(x_list.get(i)!=x_list.get(x_list.size()-i-1)){
                return false;
            }
        }
        return true;
    }


    public static boolean isPalindrome(int x) {
        // 特殊情况：
        // 如上所述，当 x < 0 时，x 不是回文数。
        // 同样地，如果数字的最后一位是 0，为了使该数字为回文，
        // 则其第一位数字也应该是 0
        // 只有 0 满足这一属性
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        // 当数字长度为奇数时，我们可以通过 revertedNumber/10 去除处于中位的数字。
        // 例如，当输入为 12321 时，在 while 循环的末尾我们可以得到 x = 12，revertedNumber = 123，
        // 由于处于中位的数字不影响回文（它总是与自己相等），所以我们可以简单地将其去除。
        return x == revertedNumber || x == revertedNumber / 10;
    }
    public static void main(String[] args){
        boolean result=isPalindrome(894565498);
        System.out.println(result);
    }


}
