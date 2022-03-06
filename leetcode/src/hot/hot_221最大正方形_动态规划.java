package hot;

public class hot_221最大正方形_动态规划 {
    // class Solution {
//     public int maximalSquare(char[][] matrix) {
//         int result=0;
//         for(int i=0;i<matrix.length;i++){
//             for(int j=0;j<matrix[0].length;j++){
//                 if(matrix[i][j]=='1'){
//                     int kkk=Math.min(matrix.length-i,matrix[0].length-j);
//                     for(int m=0;m<kkk;m++){
//                         System.out.println(m);
//                         if(dfs(matrix,i,j,m)){
//                             result=Math.max(result,m+1);
//                             //break;
//                         }
//                     }
//                 }
//             }
//         }
//         return result*result;
//     }
//     public boolean dfs(char[][] matrix,int i,int j,int m){
//         int len1=matrix.length;
//         int len2=matrix[0].length;
//         for(int q=i;q<=i+m;q++){
//             for(int p=j;p<=j+m;p++){
//                 if(matrix[q][p]=='0'){
//                     return false;
//                 }
//             }
//         }
//         return true;
//     }

// }

    class Solution {
        public int maximalSquare(char[][] matrix) {
            int max_len=0;
            int[][] result=new int[matrix.length][matrix[0].length];
            for(int i=0;i<matrix.length;i++){
                if(matrix[i][0]=='1'){
                    result[i][0]=1;
                    max_len=1;
                }
            }
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[0][j]=='1'){
                    result[0][j]=1;
                    max_len=1;
                }
            }
            for(int i=1;i<matrix.length;i++){
                for(int j=1;j<matrix[0].length;j++){
                    if(matrix[i][j]=='1'){
                        result[i][j]=Math.min(result[i-1][j-1],Math.min(result[i][j-1],result[i-1][j]))+1;
                        max_len=Math.max(max_len,result[i][j]);
                    }

                }
            }
            return max_len*max_len;
        }

    }
}
