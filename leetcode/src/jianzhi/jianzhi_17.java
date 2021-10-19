package jianzhi;

public class jianzhi_17 {
    public int[] printNumbers(int n) {
        int max=(int)Math.pow(10,n);
        int[] result=new int[max-1];
        for(int i=0;i<=max-2;i++){
            result[i]=i+1;
        }
        return result;
    }

}
