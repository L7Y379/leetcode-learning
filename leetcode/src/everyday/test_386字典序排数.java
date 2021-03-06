package everyday;

import java.util.*;

public class test_386字典序排数 {
    public static void main(String[] args) {
        System.out.println(lexicalOrder(20));
    }
    public static List<Integer> lexicalOrder(int n) {
//        Integer a=11;
//        Integer b=9;
//        String c="19";
//        String d="9";
//        System.out.println(a.toString().compareTo(b.toString()));
//        System.out.println(c.compareTo(d));
        PriorityQueue<Integer> pq=new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o2, Integer o1) {
                return o1.toString().compareTo(o2.toString());
            }
        });
        for(int i=1;i<=n;i++){
            pq.offer(i);
        }
        List<Integer> result=new ArrayList<>();
        for(int i=1;i<=n;i++){
            result.add(pq.poll());
        }
        System.out.println(result);
        Collections.sort(result,(a,b)-> a.toString().compareTo(b.toString()));
        return result;

    }
}
