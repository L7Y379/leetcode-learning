package 网易互娱;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        System.out.println();

    }
    public static int stat_hit_count(int[] R,int N) {
        Queue<Integer> queue=new LinkedList<Integer>();
        int result=0;
        for(int i=0;i<R.length;i++){
            if(!queue.contains(R[i])){
                if (queue.size()<N){
                    queue.add(R[i]);
                }else {
                    queue.add(R[i]);
                    queue.poll();
                }

            }else {
                queue.remove(R[i]);
                queue.add(R[i]);
                result++;
            }
        }
        return result;
    }
}
