package jianzhi;

public class jianzhi_14_1 {
    public static int cuttingRope(int n) {
        //暴力解法
        int result=0;
        for(int i=2;i<=n;i++){
            int yu=n%i;
            int link=n/i;
            result=Math.max(result,(int)Math.pow(link,i-yu)*(int)Math.pow(link+1,yu));
        }
        return result;
    }
    public static void main(String[] args){
        int result=cuttingRope(58);
        System.out.println(result);
    }
}
