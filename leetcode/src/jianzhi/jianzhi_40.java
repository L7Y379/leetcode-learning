package jianzhi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

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
    public static int[] getLeastNumbers(int[] arr, int k) {
        PriorityQueue<Integer> pp=new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });

        int i=0;
        for(int a:arr){
            //System.out.println(a);
            if(i<k){
                pp.offer(a);
                i++;
                continue;
            }
            if(i>k){
                pp.offer(a);
            }

        }
        System.out.println(pp);
        int[] result=new int[k];
        for(int j=0;j<k;j++){
            result[j]=pp.poll();
        }
//        System.out.println(pp.peek());
//        System.out.println(pp.size());

        return result;
    }
    public static void main(String[] args){
        int[] arr={0,0,1,3,4,5,0,7,6,7};
        System.out.println(Arrays.toString(getLeastNumbers(arr, 9)));
    }
//    class Solution {
//        public int[] getLeastNumbers(int[] arr, int k) {
//            if(k==0){
//                return new int[0];
//            }
//            Arrays.sort(arr);
//            int[] result=new int[k];
//            for(int i=0;i<=k-1;i++){
//                result[i]=arr[i];
//            }
//            return result;
//
//
//        }
//    }
}
