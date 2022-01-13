package hot;

public class hot_79_back {
    class Solution {
        boolean result=false;
        public boolean exist(char[][] board, String word) {
            int[][] bb=new int[board.length][board[0].length];
            for(int i=0;i<board.length;i++){
                for(int j=0;j<board[0].length;j++){
                    if(board[i][j]==word.charAt(0)){
                        bb[i][j]=1;
                        back(board,word,bb,1,i,j);
                        bb[i][j]=0;
                        if(result==true){
                            return result;
                        }
                    }
                }
            }
            return result;
        }
        public void back(char[][] board, String word,int[][] bb,int k,int i,int j) {
            if(k==word.length()){
                result=true;
                return;
            }
            // for(int m=0;m<4;m++){

            // }
            //System.out.println(k);
            if(j>=1&&bb[i][j-1]==0&&board[i][j-1]==word.charAt(k)){
                bb[i][j-1]=1;
                back(board,word,bb,k+1,i,j-1);
                bb[i][j-1]=0;
            }
            if(i>=1&&bb[i-1][j]==0&&board[i-1][j]==word.charAt(k)){
                bb[i-1][j]=1;
                back(board,word,bb,k+1,i-1,j);
                bb[i-1][j]=0;
            }
            if(j<=board[0].length-2&&bb[i][j+1]==0&&board[i][j+1]==word.charAt(k)){
                bb[i][j+1]=1;
                back(board,word,bb,k+1,i,j+1);
                bb[i][j+1]=0;
            }
            if(i<=board.length-2&&bb[i+1][j]==0&&board[i+1][j]==word.charAt(k)){
                bb[i+1][j]=1;
                back(board,word,bb,k+1,i+1,j);
                bb[i+1][j]=0;
            }
        }
    }
}
