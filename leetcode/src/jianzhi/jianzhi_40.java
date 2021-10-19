package jianzhi;

import java.util.Arrays;

public class jianzhi_40 {
    // class Solution {
//     public int[] getLeastNumbers(int[] arr, int k) {
//         if(k==0){
//             return new int[0];
//         }
//         int length_arr=arr.length;
//         int[] result=new int[k];
//         int min=100000;
//         int m=-1;
//         for(int j=0;j<=k-1;j++){
//             min=100000;
//             for(int i=0;i<=length_arr-1;i++){
//                 if(arr[i]<min){
//                     min=arr[i];
//                     m=i;
//                 }
//             }
//             result[j]=min;
//             arr[m]=10000;

//         }
//         return result;


//     }
// }

    class Solution {
        public int[] getLeastNumbers(int[] arr, int k) {
            if(k==0){
                return new int[0];
            }
            Arrays.sort(arr);
            int[] result=new int[k];
            for(int i=0;i<=k-1;i++){
                result[i]=arr[i];
            }
            return result;


        }
    }
}
