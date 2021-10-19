public class test20 {
    public static void main(String[] args){
        boolean result=isValid("[[[[[[[[[[[[[[[[[[[");
        System.out.println(result);
    }
    public static boolean isValid(String s) {
        int length_s=s.length();
        char[] a=new char[length_s];
        if(s.charAt(0)==')'||s.charAt(0)=='}'||s.charAt(0)==']'||length_s==1){
            return false;
        }
        a[0]=s.charAt(0);
        int k=1;
        for(int i=1;i<=length_s-1;i++){
            a[k]=s.charAt(i);
            k=k+1;
            if(s.charAt(i)==')'){
                if(k-2>=0&&a[k-2]=='('){
                    a[k-2]='a';
                    a[k-1]='a';
                    k=k-2;
                }else{
                    return false;
                }
            }
            if(s.charAt(i)==']'){
                if(k-2>=0&&a[k-2]=='['){
                    a[k-2]='a';
                    a[k-1]='a';
                    k=k-2;
                }else{
                    return false;
                }
            }
            if(s.charAt(i)=='}'){
                if(k-2>=0&&a[k-2]=='{'){
                    a[k-2]='a';
                    a[k-1]='a';
                    k=k-2;
                }else{
                    return false;
                }
            }

        }
        if(a[0]=='a'){
            return true;
        }
        return false;


    }
}
