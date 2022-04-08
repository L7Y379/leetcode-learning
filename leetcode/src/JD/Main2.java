package JD;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] nums=new int[T];
        String[] ss=new String[T];
        for(int i=0;i<T;i++){
            nums[i]=sc.nextInt();
            ss[i]=sc.next();
        }
        for(int i=0;i<T;i++){
            int[] take=new int[3];
            for(int j=0;j<ss[i].length();j++){
                if(ss[i].charAt(j)=='A'){
                    take[0]++;
                }
                if(ss[i].charAt(j)=='B'){
                    take[1]++;
                }
                if(ss[i].charAt(j)=='C'){
                    take[2]++;
                }
            }
            if(take[0]==take[1]&&take[0]==take[2]){
                System.out.println(0);
            }else {
                if(take[0]==0||take[1]==0||take[2]==0){
                    System.out.println(1);
                }
                System.out.println(2);
            }

        }

    }
}
