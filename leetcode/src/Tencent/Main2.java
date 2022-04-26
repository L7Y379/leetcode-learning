package Tencent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        int[] a={3,1,1,4,5,6};
        System.out.println(getNumber(a));
    }
    public static int getNumber(int[] a) {
        // write code here
        List<Integer> list= new ArrayList<>();
        for(int i=0;i<a.length;i++){
            //System.out.println(a[i]);
            list.add(a[i]);
        }
        while (list.size()>1){
            int len=list.size();
            //System.out.println(len);
            for(int i=len-1;i>=2;i--){
                for(int j=2;j<=Math.sqrt(i+1);j++){
                    if((i+1)%j==0){
                        list.remove(i);
                        break;
                    }
                }
            }
            list.remove(0);
        }
        return list.get(0);
    }
}
