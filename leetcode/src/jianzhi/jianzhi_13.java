package jianzhi;

public class jianzhi_13 {
    public int movingCount(int m, int n, int k) {
        int[][] num=new int[m][n];

        int result=0;
        for(int i=0;i<=m-1;i++){
            for(int j=0;j<=n-1;j++){
                if(i==0&j==0){
                    num[i][j]=1;
                }
                if(i==0&j!=0){
                    if((i/10+i%10+j/10+j%10<=k)&(num[i][j-1]==1)){
                        num[i][j]=1;
                    }
                }
                if(j==0&i!=0){
                    if((i/10+i%10+j/10+j%10<=k)&(num[i-1][j]==1)){
                        num[i][j]=1;
                    }
                }
                if(j!=0&i!=0){
                    if((i/10+i%10+j/10+j%10<=k)&(num[i-1][j]==1||num[i][j-1]==1)){
                        num[i][j]=1;
                    }
                }

            }
        }

        for(int i=0;i<=m-1;i++){
            for(int j=0;j<=n-1;j++){
                if(num[i][j]==1){
                    result=result+1;
                }
            }
        }
        return result;
    }
}
