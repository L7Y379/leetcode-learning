package everyday;

public class test_883三维形体投影面积 {
    public int projectionArea(int[][] grid) {
        int n=grid.length;
        int result=0;
        for(int i=0;i<n;i++){
            int max1=0;
            int max2=0;
            int up=0;
            for(int j=0;j<n;j++){
                max1=Math.max(max1,grid[i][j]);
                max2=Math.max(max2,grid[j][i]);
                if(grid[j][i]>0){
                    result++;
                }
                // up=grid[i][j]>0?1:0;
                // result+=up;
            }
            result=result+max1+max2;
        }
        return result;
    }
}
