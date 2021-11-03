package jianzhi;

public class jianzhi_59_2_queue {
    class MaxQueue {
        Queue<Integer> queue;
        public MaxQueue() {
            queue=new LinkedList<Integer>();
        }

        public int max_value() {
            if(queue.size()==0){
                return -1;
            }else{
                return Collections.max(queue);
            }

        }

        public void push_back(int value) {
            queue.add(value);
        }

        public int pop_front() {
            if(queue.size()==0){
                return -1;
            }else{
                return queue.poll();
            }
        }
    }

/**
 * Your MaxQueue object will be instantiated and called as such:
 * MaxQueue obj = new MaxQueue();
 * int param_1 = obj.max_value();
 * obj.push_back(value);
 * int param_3 = obj.pop_front();
 */
}
