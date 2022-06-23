package qianxin;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] arrs=s.split(" ");
        Deque<String> deque=new LinkedList<String>();
        Deque<String> deque2=new LinkedList<String>();
        for(int i=0;i<arrs.length;i++){
            if(arrs[i].equals("undo")){
                if(!deque.isEmpty()){
                    deque2.push(deque.pop());
                }
            }else if(arrs[i].equals("redo")){
                if(!deque2.isEmpty()){
                    deque.push(deque2.pop());
                }
            }else {
                deque2.clear();
                deque.push(arrs[i]);
            }

        }
        String result="";
        int len=deque.size();
        for(int i=1;i<len;i++){
            result=" "+deque.pop()+result;
        }
        result=deque.pop()+result;
        System.out.println(result);
    }
}
