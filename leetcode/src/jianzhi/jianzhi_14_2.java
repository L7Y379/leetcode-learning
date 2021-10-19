package jianzhi;

public class jianzhi_14_2 {
    public static int cuttingRope(int n) {
        //暴力解法
        long result=0;
        for(int i=2;i<=n;i++){
            int yu=n%i;
            int link=n/i;
            long fake_result=1;
            for(int k =0;k<=i-yu-1;k++){
                fake_result=fake_result*link;
            }
            for(int j=0;j<=yu-1;j++){
                fake_result=fake_result*(link+1);
            }
            if(fake_result>1000000007){
                fake_result=fake_result%1000000007;
                //System.out.println(fake_result);
            }
            if(result<fake_result){
                result=fake_result;
            }
//            System.out.println(i);
//            System.out.println(result);
        }
        return (int)result;
    }
    public static void main(String[] args){
        int result=cuttingRope(120);
        System.out.println(result);
        int kkk=(int)Math.pow(3,40);
//        System.out.println(kkk);
//        System.out.println(kkk%1000000007);
    }
}
