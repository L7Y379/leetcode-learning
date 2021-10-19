public class test600 {
    public static void main(String[] args){
//        String str = "asfawfawf";
//        System.out.println(str.charAt(3));
        int result=findIntegers(5);
        System.out.println(result);
    }

    public static int findIntegers(int n) {
        String str=new String();
        int link=n+1;
        if(n==1){
            return 2;
        }
        for(int i=2;i<=n;i++){
            str=Integer.toBinaryString(i);
            int length_str=str.length();
            for(int j=0;j<=length_str-2;j++){
                if(str.charAt(j)=='1'&&str.charAt(j+1)=='1'){
                    link--;
                    break;
                }
            }
        }
        return link;
    }
}
