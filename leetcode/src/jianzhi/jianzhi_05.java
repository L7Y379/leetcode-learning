package jianzhi;

public class jianzhi_05 {
    public String replaceSpace(String s) {
        int length_s=s.length();
        if(length_s==0){
            return s;
        }
        String result="";
        for(int i=0;i<=length_s-1;i++){
            if(s.charAt(i)!=' '){
                result=result+s.charAt(i);
            }
            if(s.charAt(i)==' '){
                result=result+"%20";
            }
        }
        return result;
    }

}
