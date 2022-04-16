package 网易互娱;

import java.util.Arrays;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] jump=new int[N];
        for(int i=0;i<N;i++){
            jump[i]=sc.nextInt();
        }
        int[] dongtai=new int[N];
        dongtai[N-1]=1;
        for(int i=N-2;i>=0;i--){
            if(jump[i]+i>N-1){
                dongtai[i]=1;
                continue;
            }
            dongtai[i]=dongtai[i+jump[i]]+1;
            for(int j=0;j<i;j++){
                if(jump[j]+j>N-1){
                    if(dongtai[i]>2){
                        dongtai[i]=2;
                    }
                    break;

                }
                if(jump[j]+j>i){
                    if(dongtai[jump[j]+j]+2<dongtai[i]){
                        dongtai[i]=dongtai[jump[j]]+2;
                    }
                }
            }
        }

        System.out.println(dongtai[0]);
        System.out.println(Arrays.toString(dongtai));
    }
}
