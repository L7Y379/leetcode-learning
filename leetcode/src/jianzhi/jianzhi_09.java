package jianzhi;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class jianzhi_09 {
}

class CQueue {
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    public CQueue() {
        stack1=new Stack<Integer>();
        stack2=new Stack<Integer>();
    }

    public void appendTail(int value) {
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        stack1.push(value);
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
    }

    public int deleteHead() {
        if (stack1.isEmpty()) {
            return -1;
        }else{
            return (int)stack1.pop();
        }

    }
}

class CQueue1 {
    Deque<Integer> stack1;
    Deque<Integer> stack2;

    public CQueue1() {
        stack1 = new LinkedList<Integer>();
        stack2 = new LinkedList<Integer>();
    }

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        // 如果第二个栈为空
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        if (stack2.isEmpty()) {
            return -1;
        } else {
            int deleteItem = stack2.pop();
            return deleteItem;
        }
    }
}
/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */
