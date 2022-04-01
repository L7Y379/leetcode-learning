package Alibaba;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][]input = new int[n][5];

        for(int i = 0 ; i < n;i++)
        {
            for(int j = 0 ; j < 5 ;j++)
            {
                input[i][j] = sc.nextInt();
            }

        }

        for(int i = 0 ; i < n ;i++)
        {
            int[] arr = input[i];
            int res = 0 ;
            while(true)
            {
                int count = 0 ;
                for(int k = 0 ; k < 5; k++)
                {

                    int num = arr[k];
                    if(num==0)continue;
                    arr[k] = num-1;
                    count++;

                    if(count==4)
                    {
                        res++;
                        break;
                    }
                }
                if(count<4)
                    break;
            }
            System.out.println(res);
        }

    }
}
