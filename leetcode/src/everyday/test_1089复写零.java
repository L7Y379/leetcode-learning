package everyday;

public class test_1089复写零 {
    public void duplicateZeros(int[] arr) {

        int[] link=new int[arr.length];
        for(int i=0;i<link.length;i++){
            link[i]=arr[i];
        }
        int m=0;
        int n=0;
        while(m<arr.length){
            if(link[n]==0){
                arr[m]=0;
                if(m+1<arr.length)arr[m+1]=0;
                m=m+2;
                n++;
            }else {
                arr[m]=link[n];
                m++;
                n++;
            }
        }

    }
    public String reverseLeftWords(String s, int n) {
        String s1=s.substring(0,n);
        String s2=s.substring(n,s.length()-1);
        return s2+s1;
    }
}
