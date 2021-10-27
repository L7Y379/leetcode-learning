package jianzhi;

public class jianzhi_47 {
    // class Solution {
//     public int maxValue(int[][] grid) {
//         int length_grid1=grid.length;
//         if(length_grid1==0){
//             return 0;
//         }
//         int length_grid2=grid[0].length;
//         if(length_grid2==0){
//             return 0;
//         }
//         int max=res(grid,length_grid1,length_grid2);
//         return max;
//     }
//     public int res(int[][] grid,int length_grid1,int length_grid2){
//         int link1=0;
//         int link2=0;
//         if(length_grid1==1){
//             link1=grid[length_grid1-1][length_grid2-1];
//         }else{
//             link1=res(grid,length_grid1-1,length_grid2)+grid[length_grid1-1][length_grid2-1];
//         }
//         if(length_grid2==1){
//             link2=grid[length_grid1-1][length_grid2-1];
//         }else{
//             link2=res(grid,length_grid1,length_grid2-1)+grid[length_grid1-1][length_grid2-1];
//         }
//         return Math.max(link1,link2);

//     }
// }

// class Solution {
//     public int maxValue(int[][] grid) {
//         int length_grid1=grid.length;
//         if(length_grid1==0){
//             return 0;
//         }
//         int length_grid2=grid[0].length;
//         if(length_grid2==0){
//             return 0;
//         }
//         int max=res(grid,length_grid1,length_grid2);
//         return max;
//     }
//     public int res(int[][] grid,int length_grid1,int length_grid2){
//         int link1=0;
//         int link2=0;
//         if(length_grid1==1){
//             link1=0;
//         }else{
//             link1=res(grid,length_grid1-1,length_grid2);
//         }
//         if(length_grid2==1){
//             link2=0;
//         }else{
//             link2=res(grid,length_grid1,length_grid2-1);
//         }
//         return Math.max(link1,link2)+grid[length_grid1-1][length_grid2-1];

//     }
// }

    class Solution {
        public int maxValue(int[][] grid) {
            int m = grid.length, n = grid[0].length;
            for(int i = 0; i < m; i++) {
                for(int j = 0; j < n; j++) {
                    if(i == 0 && j == 0) continue;
                    if(i == 0) grid[i][j] += grid[i][j - 1] ;
                    else if(j == 0) grid[i][j] += grid[i - 1][j];
                    else grid[i][j] += Math.max(grid[i][j - 1], grid[i - 1][j]);
                }
            }
            return grid[m - 1][n - 1];
        }
    }

}
