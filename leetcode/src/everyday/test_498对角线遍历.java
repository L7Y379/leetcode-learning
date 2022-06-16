package everyday;

import java.util.Arrays;

public class test_498对角线遍历 {
    public int[] findDiagonalOrder(int[][] mat) {
        int[] result=new int[mat.length*mat[0].length];
        int i=0;
        int j=0;
        int k=0;
        int t=0;
        while(i<=mat.length&&j<=mat[0].length){
            System.out.println(Arrays.toString(result));
            if(k==0){
                while(i>=0&&j<=mat[0].length-1){
                    result[t]=mat[i][j];
                    t++;
                    k=1;
                    i--;
                    j++;
                }
                i++;
                j--;
                if(j<mat[0].length-1){
                    j++;
                }else{
                    i++;
                }
            }else{
                while(i<=mat.length-1&&j>=0){
                    result[t]=mat[i][j];
                    t++;
                    k=0;
                    i++;
                    j--;
                }
                i--;
                j++;
                if(i<mat.length-1){
                    i++;
                }else{
                    j++;
                }
            }

        }
        return result;
    }
    public String minNumber(int[] nums) {
        String[] snums=new String[nums.length];
        for(int i=0;i<snums.length;i++){
            snums[i]=nums[i]+"";
        }
        for(int i=0;i<snums.length;i++){
            System.out.println(Arrays.toString(snums));
            for(int j=0;j<snums.length-i-1;j++){
                if(snums[j].length()==snums[j+1].length()){
                    if(snums[j].compareTo(snums[j+1])>0){
                        String s=snums[j];
                        snums[j]=snums[j+1];
                        snums[j+1]=s;
                    }
                    continue;
                }
                if(snums[j].length()>snums[j+1].length()){
                    for(int k1=0,k2=0;k1<snums[j].length();k1++){
                        if(snums[j].charAt(k1)>snums[j].charAt(k2%snums[j+1].length())){
                            String s=snums[j];
                            snums[j]=snums[j+1];
                            snums[j+1]=s;
                            break;
                        }
                        k2++;
                    }
                    continue;
                }
                if(snums[j].length()<snums[j+1].length()){
                    for(int k1=0,k2=0;k2<snums[j+1].length();k2++){
                        if(snums[j].charAt(k1%snums[j].length())>snums[j+1].charAt(k2)){
                            String s=snums[j];
                            snums[j]=snums[j+1];
                            snums[j+1]=s;
                            break;
                        }
                        k1++;
                    }
                    continue;
                }
            }
        }
        String result="";
        for(int i=0;i<snums.length;i++){
            result=result+snums[i];
        }
        

        return result;

    }
}
