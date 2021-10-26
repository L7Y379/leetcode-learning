package jianzhi;

public class jianzhi_46 {
    class Solution {
        public int translateNum(int num) {
            String s=""+num;
            int s_length=s.length();
            int result=res(s,s_length-1);
            return result;
        }
        public int res(String s,int l){
            if(l==0||l==-1){
                return 1;
            }
            String ntr=""+s.charAt(l-1)+s.charAt(l);
            Integer i=new Integer(ntr);
            int link=i.intValue();
            if(link<=25&&link>=10){
                return res(s,l-1)+res(s,l-2);
            }else{
                return res(s,l-1);
            }
        }
    }
}
