package hot;

public class hot_48_int {
    public void rotate(int[][] matrix) {
        int length_matrix1=matrix.length;
        int length_matrix2=matrix[0].length;
        int n=length_matrix1/2;
        for(int i=0;i<n;i++){
            for(int j=i;j<length_matrix1-1-i;j++){
                int t=matrix[i][j];
                matrix[i][j]=matrix[length_matrix1-j-1][i];
                matrix[length_matrix1-j-1][i]=matrix[length_matrix1-i-1][length_matrix1-j-1];
                matrix[length_matrix1-i-1][length_matrix1-j-1]=matrix[j][length_matrix1-i-1];
                matrix[j][length_matrix1-i-1]=t;
            }
        }
        //return matrix;
    }
}
