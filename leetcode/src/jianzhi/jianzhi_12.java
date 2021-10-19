package jianzhi;

public class jianzhi_12 {
    public boolean exist(char[][] board, String word) {
        char[] words=word.toCharArray();
        int k=0;
        for(int i=0;i<=board.length-1;i++){
            for(int j=0;j<=board[0].length-1;j++){
                if(res(board,words,i,j,k)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean res(char[][] board,char[] words,int i,int j,int k){
        //越界 or  没找到work[k] 字母
        if(i<0||i>board.length-1||j<0||j>board[0].length-1||words[k]!=board[i][j]){
            return false;
        }
        //全部搜索完
        if(k==words.length-1){
            return true;
        }
        //走过的路，赋值 /0
        board[i][j]='\0';
        boolean result=false;
        result=res(board,words,i+1,j,k+1)||res(board,words,i,j+1,k+1)||res(board,words,i-1,j,k+1)||res(board,words,i,j-1,k+1);
        //回溯，恢复原来字符
        board[i][j]=words[k];
        return result;
    }
    public static void main(String[] args){

    }
}
