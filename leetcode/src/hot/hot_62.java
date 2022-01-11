package hot;

public class hot_62 {
    // class Solution {
//     int result=0;
//     public int uniquePaths(int m, int n) {
//         back(m,n,0,0,0);
//         return result;
//     }
//     public void back(int m, int n,int i,int j,int k){
//         if(k==m+n-2){
//             result++;
//         }
//         if(i<m-1){
//             back(m,n,i+1,j,k+1);
//         }
//         if(j<n-1){
//             back(m,n,i,j+1,k+1);
//         }
//     }
// }

// class Solution {
//     public int uniquePaths(int m, int n) {
//         //int result=back(m,n);
//         return back(m,n);
//     }
//     public int back(int m, int n){
//         if(m==1||n==1){
//             return 1;
//         }
//         return back(m-1,n)+back(m,n-1);
//     }
// }

    // class Solution {
//     public int uniquePaths(int m, int n) {
//         int[][] f = new int[m][n];
//         for (int i = 0; i < m; ++i) {
//             f[i][0] = 1;
//         }
//         for (int j = 0; j < n; ++j) {
//             f[0][j] = 1;
//         }
//         for (int i = 1; i < m; ++i) {
//             for (int j = 1; j < n; ++j) {
//                 f[i][j] = f[i - 1][j] + f[i][j - 1];
//             }
//         }
//         return f[m - 1][n - 1];
//     }
// }
    class Solution {
        public int uniquePaths(int m, int n) {
            long ans = 1;
            for (int x = n, y = 1; y < m; ++x, ++y) {
                ans = ans * x / y;
            }
            return (int) ans;
        }
    }

}
