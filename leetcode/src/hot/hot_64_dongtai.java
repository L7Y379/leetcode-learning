package hot;

public class hot_64_dongtai {
    // class Solution {
//     public int minPathSum(int[][] grid) {
//         int len1=grid.length;
//         int len2=grid[0].length;
//         return back(len1,len2,grid);

//     }
//     public int back(int len1,int len2,int[][] grid) {
//         if(len1==1&&len2==1){
//             return grid[0][0];
//         }
//         if(len1==1){
//             return back(len1,len2-1,grid)+grid[len1-1][len2-1];
//         }
//         if(len2==1){
//             return back(len1-1,len2,grid)+grid[len1-1][len2-1];
//         }
//         return Math.min(back(len1-1,len2,grid)+grid[len1-1][len2-1],back(len1,len2-1,grid)+grid[len1-1][len2-1]);

//     }
// }

    class Solution {
        public int minPathSum(int[][] grid) {
            int len1=grid.length;
            int len2=grid[0].length;
            int[][] result=new int[len1][len2];
            result[0][0]=grid[0][0];
            for(int i=1;i<len1;i++){
                result[i][0]=grid[i][0]+result[i-1][0];
            }
            for(int j=1;j<len2;j++){
                result[0][j]=grid[0][j]+result[0][j-1];
            }
            for(int i=1;i<len1;i++){
                for(int j=1;j<len2;j++){
                    result[i][j]=Math.min(result[i-1][j],result[i][j-1])+grid[i][j];
                }
            }

            return result[len1-1][len2-1];

        }
    }
}
