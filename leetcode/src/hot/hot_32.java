package hot;

public class hot_32 {
    public int longestValidParentheses(String s) {
        int max=0;
        for(int i=0;i<s.length();i++){
            int length=0;
            int balance=0;
            if(s.charAt(i)==')'){
                continue;
            }
            if(s.charAt(i)=='('){
                balance++;
                length++;
                for(int j=i+1;j<s.length();j++){
                    if(s.charAt(j)=='('){
                        balance++;
                        length++;
                    }
                    if(s.charAt(j)==')'){
                        balance--;
                        if(balance<0){
                            break;
                        }
                        if(balance==0){
                            length++;
                            if(length>=max){
                                max=length;
                            }
                        }
                        if(balance>0){
                            length++;
                        }
                    }
                }
            }
        }
        return max;
    }
    public static void main(String[] args){
        hot_32 hh=new hot_32();
        int result=hh.longestValidParentheses(")()())");
        System.out.println(result);
    }
}
