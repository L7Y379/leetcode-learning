package everyday;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class test_875爱吃香蕉的珂珂 {
    public static void main(String[] args){

    }
    public int minEatingSpeed(int[] piles, int h) {
        int k=h-piles.length;
        PriorityQueue<Integer> pp=new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1=o1;
            }
        });
        int i=0;
        for(int pile:piles){
            if(i<k+1){
                pp.add(pile);
                i++;
            }else {
                pp.add(pile);
                pp.poll();
            }
        }

        List<Integer> list=new ArrayList<Integer>();
        Integer[] integer = list.toArray(new Integer[list.size()]);

        return pp.poll();
    }
}
