package jianzhi;

public class jianzhi_29 {
    public int[] spiralOrder(int[][] matrix) {
        int length_matrix=matrix.length;
        if(length_matrix==0){
            return new int[0];
        }
        int length_matrix1=matrix[0].length;
        int[] result=new int[length_matrix*length_matrix1];
        if(length_matrix1==0){
            return result;
        }
        if(matrix.length==1){
            for(int i=0;i<=length_matrix1-1;i++){
                result[i]=matrix[0][i];
            }
            return result;
        }
        if(matrix[0].length==1){
            for(int i=0;i<=length_matrix-1;i++){
                result[i]=matrix[i][0];
            }
            return result;
        }
        int[][] matrix_bb=new int[length_matrix][length_matrix1];
        for(int i =0;i<=length_matrix-1;i++){
            for(int j=0;j<=length_matrix1-1;j++){
                matrix_bb[i][j]=-1;
            }
        }
        matrix_bb[0][0]=-2;
        int k=1;
        int xuanzhuan=1;//旋转方向判断基准
        int i=0,j=0;
        result[0]=matrix[0][0];
        while(k<=length_matrix*length_matrix1-1){
            if(xuanzhuan==1){
                while(j<=length_matrix1-2&&matrix_bb[i][j+1]==-1){
                    result[k]=matrix[i][j+1];
                    matrix_bb[i][j+1]=-2;
                    j++;
                    k++;
                }
                xuanzhuan=2;
                continue;
            }
            if(xuanzhuan==2){
                while(i<=length_matrix-2&&matrix_bb[i+1][j]==-1){
                    result[k]=matrix[i+1][j];
                    matrix_bb[i+1][j]=-2;
                    i++;
                    k++;
                }
                xuanzhuan=3;
                continue;
            }
            if(xuanzhuan==3){
                while(j>=1&&matrix_bb[i][j-1]==-1){
                    result[k]=matrix[i][j-1];
                    matrix_bb[i][j-1]=-2;
                    j--;
                    k++;
                }
                xuanzhuan=4;
                continue;
            }
            if(xuanzhuan==4){
                while(i>=1&&matrix_bb[i-1][j]==-1){
                    result[k]=matrix[i-1][j];
                    matrix_bb[i-1][j]=-2;
                    i--;
                    k++;
                }
                xuanzhuan=1;
                continue;
            }
            // if(xuanzhuan==1&&j<=length_matrix1-2&&matrix_bb[i][j+1]==-1){
            //     result[k]=matrix[i][j+1];
            //     matrix_bb[i][j+1]=-2;
            //     j++;
            // }else if(i<=length_matrix-2&&matrix_bb[i+1][j]==-1){
            //     result[k]=matrix[i+1][j];
            //     matrix_bb[i+1][j]=-2;
            //     i++;
            // }else if(j>=1&&matrix_bb[i][j-1]==-1){
            //     result[k]=matrix[i][j-1];
            //     matrix_bb[i][j-1]=-2;
            //     j--;
            // }else if(i>=1&&matrix_bb[i-1][j]==-1){
            //     result[k]=matrix[i-1][j];
            //     matrix_bb[i-1][j]=-2;
            //     i--;
            // }
            // k++;
        }
        return result;


    }

}
