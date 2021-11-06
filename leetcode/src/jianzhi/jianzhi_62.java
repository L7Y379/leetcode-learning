package jianzhi;

public class jianzhi_62 {
    // class Solution {
//     public int lastRemaining(int n, int m) {
//         int num=n;
//         int result = 0;
//         int[] arr=new int[n];
//         //for()
//         int i=0;
//         while(num!=1){
//             int mum=1;
//             while(mum!=m){
//                 while(arr[i]==1){
//                     i++;
//                     if(i==n)i=0;
//                 }
//                 mum++;
//                 i++;
//                 if(i==n)i=0;

//             }
//             while(arr[i]==1){
//                 i++;
//                 if(i==n)i=0;
//             }
//             arr[i]=1;
//             num--;
//         }
//         System.out.println(Arrays.toString(arr));
//         for(int k=0;k<=n-1;k++){
//             if(arr[k]==0){
//                 result=k;
//             }
//         }
//         return result;
//     }
// }

    class Solution {
        public int lastRemaining(int n, int m) {
            int f = 0;
            for (int i = 2; i != n + 1; ++i) {
                f = (m + f) % i;
            }
            return f;
        }
    }

}
