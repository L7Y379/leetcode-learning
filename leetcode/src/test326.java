public class test326 {
     public static boolean isPowerOfThree2(int n) {
         int link=1;
         if(n<=0){
             return false;
         }
         if(n==1){
             return true;
         }
         while(link<n){
             link=link*3;//精度丢失了！
             System.out.println(link);
         }
         if(link==n){
             return true;
         }
         return false;
    }
    public static boolean isPowerOfThree(int n) {
        while (n != 0 && n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }
    public static void main(String[] args){
        boolean result=isPowerOfThree(2147483647);
        System.out.println(result);
        boolean result2=isPowerOfThree2(2147483647);
        System.out.println(result2);
    }
}
