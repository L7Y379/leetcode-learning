package jianzhi;

public class jianzhi_10_1 {
    public static int fib(int n) {
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        //return (fib(n-1)+fib(n-2))<=1000000007?fib(n-1)+fib(n-2):1;
        //return (fib(n-1)+fib(n-2));

        int result=0;
        int link1=0;
        int link2=1;
        for(int i=0;i<=n-2;i++){
            result=link1+link2;
            if(result>1000000007){
                result=result-1000000007;
            }
            link1=link2;
            link2=result;
        }
        return result;
    }
    public static void main(String[] args){
        int result=fib(44);
        System.out.println(result);
        int result2=fib(45);
        System.out.println(result2);
    }
}
