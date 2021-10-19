// class Solution {
//
// }

public class test7 {
    public static int reverse_me(int x) {
         if(x==0){
             return 0;
         }
         int x_t=0;
         if(x>0){
             while(x!=0){
                 x_t=x_t*10+x%10;
                 x=x/10;
             }
             if(x_t<=(int)(Math.pow(2,31))-1){
                 return x_t;
             }else{
                 return 0;
             }
         }
         if(x<0){
             x=0-x;
             while(x!=0){
                 x_t=x_t*10+x%10;
                 x=x/10;
             }
             if(x_t<=(int)(Math.pow(2,31))){
                 return -x_t;
             }else{
                 return 0;
             }
         }
         return 0;

     }
    public static int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            if (rev < Integer.MIN_VALUE / 10 || rev > Integer.MAX_VALUE / 10) {
                return 0;
            }
            int digit = x % 10;
            x /= 10;
            rev = rev * 10 + digit;
        }
        return rev;
    }
    public static void main(String[] args){
        int result=reverse(1534236469);
        int result_me=reverse(1534236469);
        System.out.println(result);
        System.out.println(result_me);
    }
}

