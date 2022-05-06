package everyday;

import java.util.LinkedList;
import java.util.Queue;

public class test_933最近的请求次数 {
    class RecentCounter {
        int result;
        Queue<Integer> queue;
        public RecentCounter() {
            result=0;
            queue=new LinkedList<Integer>();
        }

        public int ping(int t) {
            queue.offer(t);
            while(!queue.isEmpty()&&queue.peek()<t-3000){
                queue.poll();
            }
            return queue.size();
        }
    }
}
