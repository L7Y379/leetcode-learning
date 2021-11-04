package jianzhi;

public class jianzhi_66_int {
    // class Solution {
//     public int[] constructArr(int[] a) {
//         if(a.length==0||a.length==1){
//             return new int[0];
//         }
//         int[] result=new int[a.length];
//         result[0]=getji(a,1,a.length-1);
//         result[a.length-1]=getji(a,0,a.length-2);
//         if(a.length==2){
//             return result;
//         }
//         for(int i=1;i<=a.length-2;i++){
//             int left=getji(a,0,i-1);
//             int right=getji(a,i+1,a.length-1);
//             result[i]=left*right;
//         }
//         return result;
//     }
//     public int getji(int[] a,int i,int j){
//         if(i==j){
//             return a[i];
//         }
//         return a[i]*getji(a,i+1,j);
//     }
// }

    class Solution {
        public int[] constructArr(int[] a) {
            int len = a.length;
            if(len == 0) return new int[0];
            int[] b = new int[len];
            b[0] = 1;
            int tmp = 1;
            for(int i = 1; i < len; i++) {
                b[i] = b[i - 1] * a[i - 1];
            }
            for(int i = len - 2; i >= 0; i--) {
                tmp *= a[i + 1];
                b[i] *= tmp;
            }
            return b;
        }
    }

}
