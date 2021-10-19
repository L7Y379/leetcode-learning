package jianzhi;

import java.util.ArrayList;
import java.util.List;

public class jianzhi_04 {
    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        int length1=matrix.length;
        if(length1==0){
            return false;
        }
        int length2=matrix[0].length;
        if(length2==0){
            return false;
        }
        boolean result=false;
        if(target<matrix[0][0]||target>matrix[length1-1][length2-1]){
            return false;
        }
        for(int i=0;i<=length1-1;i++){
            int j=0;
            int k=length2-1;
            int mid=(j+k)/2;
            while(j<=k){
                if(target==matrix[i][mid]){
                    result=true;
                    return result;
                }else if(target<matrix[i][mid]){
                    k=mid-1;
                    mid=(j+k)/2;
                }else if(target>matrix[i][mid]){
                    j=mid+1;
                    mid=(j+k)/2;
                }
            }
        }
        return result;
    }
    public static void main(String[] args){
        int[][] nums={{4,8,20,22,28},{5,9,21,23,29},{6,10,22,24,30}};
        boolean result=findNumberIn2DArray(nums,20);
        System.out.println(result);
    }
}
