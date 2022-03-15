package meituan;

import java.util.Scanner;

public class Main8 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] color=new int[n];
        int[] struct=new int[n];
        for(int i=0;i<n;i++){
            color[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            struct[i]=sc.nextInt();
        }
        int result_white=0;
        int result_black=0;


        int count_black=0;
        if(color[0]==1){
            for(int i=0;i<n;i++){
                if(struct[i]==1&&color[i]==1){
                    count_black++;
                }
            }
            if(count_black==0){
                result_black++;
            }
        }
        int count_black2=0;
        int count_white2=0;
        if(color[0]==0){
            for(int i=0;i<n;i++){
                if(struct[i]==1&&color[i]==0){
                    count_white2++;
                }
                if(struct[i]==1&&color[i]==1){
                    count_black2++;
                }
            }
            if((count_white2==0&&count_black2==0)||count_black2>0){
                result_white++;
            }
        }
        for(int i=1;i<n;i++){
            if(color[i]==0&&good_check_white(color,struct,i)){
                result_white++;
            }
            if(color[i]==1&&good_check_black(color,struct,i)){
                result_black++;
            }
        }
        System.out.print(result_white+" "+result_black);

    }
    public static boolean good_check_white(int[] color,int[] struct,int num){
        int count_black2=0;
        int count_white2=0;
        for(int i=0;i<color.length;i++){
            if(struct[i]==num+1&&color[i]==0){
                count_white2++;
            }
            if(struct[i]==num+1&&color[i]==1){
                count_black2++;
            }
        }
        if((count_white2==0&&count_black2==0)||count_black2>0){
            return true;
        }
        return false;
    }
    public static boolean good_check_black(int[] color,int[] struct,int num){
        int count_black=0;
        if(color[0]==1){
            for(int i=0;i<color.length;i++){
                if(struct[i]==num+1&&color[i]==1){
                    count_black++;
                }
            }
            if(count_black==0){
                return true;
            }
        }
        return false;
    }
}

