import java.util.Arrays;

public class KMP {
    public static int kmpbaoli(String s,String t){
        int len_s=s.length();
        int len_t=t.length();
        if(len_s==0||len_t==0){
            return -1;
        }
        for(int i=0;i<len_s;i++){
            for(int j=0;j<len_t;j++){
                if(s.charAt(i+j)!=t.charAt(j)){
                    break;
                }
                //System.out.println(s.charAt(i+j));
                if(j==len_t-1){
                    return i;
                }
            }

        }
        return -1;
    }



    public static int KMP(String haystack, String needle) {
        int i=0,j=0;
        int[] next=getNext(needle);
        while (i< haystack.length() && j<needle.length()){
            if (j==-1 || haystack.charAt(i)==needle.charAt(j)){
                i++;
                j++;
            }else {
                j=next[j];
            }
        }
        if (j==needle.length())
            return i-j;
        else
            return -1;
    }


    //求next[]数组,next[0]=-1 当遇到冲突时直接查next数组并且返回到相应位置
    private static int[] getNext(String sub){
        int[] next=new int[sub.length()+1];
        int i=0;
        int j=-1;
        next[0]=-1;
        while (i<sub.length()){
            if (j==-1 || sub.charAt(i) == sub.charAt(j)){
                next[++i]=++j;
            }else {
                j=next[j];
            }
        }
        System.out.println(Arrays.toString(next));
        return next;

    }





    public static int KMP2(String s,String t){
        int len_s=s.length();
        int len_t=t.length();
        int[] next=new int[t.length()+1];
        next=getNext2(t);
        int i=0;
        int j=0;
        while(i<len_s&&j<len_t){
            if(j==-1||s.charAt(i)==t.charAt(j)){
                i++;
                j++;
            }else {
                j=next[j];
            }
            if(j==len_t){
                return i-j;
            }
        }
        return -1;
    }
    public static int[] getNext2(String t){
        int len_t=t.length();
        int[] next=new int[len_t+1];
        next[0]=-1;
        int i=0;
        int j=-1;
        while(i<len_t){
            if(j==-1||t.charAt(i)==t.charAt(j)){
                i++;
                j++;
                next[i]=j;
            }else {
                j=next[j];
            }

        }
        return next;
    }


    public static void main(String[] args) {
        System.out.println(kmpbaoli("aaaaabaaaaac","aaaaac"));
        System.out.println(KMP("aaaaabaaaaac","aaaaac"));
        System.out.println(KMP2("aaaaabaaaaac","aaaaac"));
    }
}
