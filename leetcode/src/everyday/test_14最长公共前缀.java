package everyday;

public class test_14最长公共前缀 {
    public static void main(String[] args) {
        String[] strs={"flower","flow","flight"};
        if(strs.length==1){
            System.out.println(strs[0]);
        }
        String result=strs[0];
        for(int i=1;i<strs.length;i++){
            int k1=0;
            while(k1<result.length()){
                if(!(result.charAt(k1)==strs[i].charAt(k1))){
                    break;
                }
                k1++;
            }
            if(k1==0){
                System.out.println("");
            }
            result=result.substring(0,k1-1);
        }
    }
}
