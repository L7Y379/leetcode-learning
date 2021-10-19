public class test36 {
    public static boolean isValidSudoku(char[][] board) {
        for(int i=0;i<=8;i++){
            String str1=""+board[i][0];
            String str2=""+board[0][i];
            for(int j=1;j<=8;j++){
                if(str1.contains(board[i][j]+"")&&board[i][j]!='.'){
                    return false;
                }else{
                    str1=str1+board[i][j];
                }
                if(str2.contains(board[j][i]+"")&&board[j][i]!='.'){
                    return false;
                }else{
                    str2=str2+board[j][i];
                }
            }
        }
        for(int k=0;k<=8;k++){
            int q=k/3;
            int p=k%3;
            String str3="";
            for(int n=0;n<=2;n++){
                for(int m=0;m<=2;m++)
                    if(n==0&&m==0){
                        str3=""+board[q*3][p*3];
                    }else{
                        if(str3.contains(board[q*3+n][p*3+m]+"")&&board[q*3+n][p*3+m]!='.'){
                            return false;
                        }else{
                            str3=str3+board[q*3+n][p*3+m];
                        }
                    }

            }
        }
        return true;


    }
    public static void main(String[] args){
        char[][] ccc={{'5','3','.','.','7','.','.','.','.'},{'6','.','.','1','9','5','.','.','.'},{'.','9','8','.','.','.','.','6','.'},{'8','.','.','.','6','.','.','.','3'},{'4','.','.','8','.','3','.','.','1'},{'7','.','.','.','2','.','.','.','6'},{'.','6','.','.','.','.','2','8','.'},{'.','.','.','4','1','9','.','.','5'},{'.','.','.','.','8','.','.','7','9'}};
        boolean result=isValidSudoku(ccc);
        System.out.println(result);
    }
}
