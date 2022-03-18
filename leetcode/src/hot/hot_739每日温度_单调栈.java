package hot;

import java.util.Deque;
import java.util.LinkedList;

public class hot_739每日温度_单调栈 {
    public static void main(String[] args) {
    }
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result=new int[temperatures.length];
        // for(int i=0;i<temperatures.length;i++){
        //     for(int j=i+1;j<temperatures.length;j++){
        //         if(temperatures[j]>temperatures[i]){
        //             result[i]=j-i;
        //             break;
        //         }
        //     }
        // }


        //单调栈
        Deque<Integer> stack=new LinkedList<Integer>();
        for(int i=0;i<temperatures.length;i++){
            if(stack.size()==0){
                stack.push(i);
            }else {
                while (stack.size()!=0&&temperatures[stack.peek()]<temperatures[i]){
                    result[stack.peek()]=i-stack.peek();
                    stack.pop();
                }
                stack.push(i);
            }

        }
        return result;

    }


    }
