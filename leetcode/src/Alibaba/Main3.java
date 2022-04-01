package Alibaba;

import java.util.Arrays;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        int[][] nums=new int[t][5];
        for(int i=0;i<t;i++){
            nums[i][0]=sc.nextInt();
            nums[i][1]=sc.nextInt();
            nums[i][2]=sc.nextInt();
            nums[i][3]=sc.nextInt();
            nums[i][4]=sc.nextInt();
        }
        for(int i=0;i<t;i++){
            int result=0;
            Arrays.sort(nums[i]);
            while(nums[i][1]!=0){
                nums[i][1]--;
                nums[i][2]--;
                nums[i][3]--;
                nums[i][4]--;
                result++;
            }
            //System.out.println(Arrays.toString(nums[i]));
            Arrays.sort(nums[i]);
            while(nums[i][1]!=0){
                nums[i][1]--;
                nums[i][2]--;
                nums[i][3]--;
                nums[i][4]--;
                result++;
            }
            //System.out.println(Arrays.toString(nums[i]));
            System.out.println(result);

        }



    }
}
