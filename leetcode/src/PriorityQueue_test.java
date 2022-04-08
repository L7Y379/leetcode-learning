import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueue_test {
    public static void main(String[] args) {
        int k=5;
        int[] arr={1,5,8,9,7,6,3,2,4,77,99};
        PriorityQueue<Integer> qq=new PriorityQueue<Integer>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        for(int i=0;i<arr.length;i++){
            if(qq.size()!=k){
                qq.add(arr[i]);
            }else {
                qq.poll();
                qq.offer(arr[i]);
            }

        }
        System.out.println(qq.poll());

    }
}
