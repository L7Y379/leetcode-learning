package hot;

public class hot_70_dongtai {
    // class Solution {
//     int result=0;
//     public int climbStairs(int n) {
//         back(n,0);
//         return result;
//     }
//     public void back(int n,int k) {
//         if(n==k){
//             result++;
//             return;
//         }
//         if(n==k-1){
//             return;
//         }
//         back(n,k+1);
//         back(n,k+2);
//     }
// }

    class Solution {
        public int climbStairs(int n) {
            int[] result=new int[n+1];
            result[0]=1;
            result[1]=1;
            for(int i=2;i<n+1;i++){
                result[i]=result[i-2]+result[i-1];
            }
            return result[n];
        }

    }
}
