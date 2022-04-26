package everyday;

public class test_868二进制间距 {
    public int binaryGap(int n) {
        if(n==1){
            return 0;
        }
        String n_s=Integer.toBinaryString(n);
        int distance=0;
        for (int i=0;i<n_s.length();i++){
            if(n_s.charAt(i)=='1'){
                int j=i+1;
                while (j<n_s.length()){
                    if(n_s.charAt(j)=='1'){
                        distance=Math.max(j-i,distance);
                        i=j-1;
                        break;
                    }
                    j++;
                }
                if(j==n_s.length()){
                    break;
                }
            }
        }
        return distance;
    }

}
