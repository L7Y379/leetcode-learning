package jianzhi;

public class jianzhi_15 {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        String str_n=Integer.toBinaryString(n);
        System.out.println(str_n);
        int length_str=str_n.length();
        char[] char_n=str_n.toCharArray();
        int result=0;
        for(int i=0;i<=length_str-1;i++){
            if(char_n[i]=='1'){
                result++;
            }
        }
        return result;
    }
    public static void main(String[] args){
        jianzhi_15 hhh=new jianzhi_15();
        int result = hhh.hammingWeight(88);
        System.out.println(result);
    }

}
