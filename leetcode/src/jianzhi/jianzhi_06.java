package jianzhi;

import java.lang.reflect.Array;
import java.util.Arrays;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
public class jianzhi_06 {

     //Definition for singly-linked list.


    public int[] reversePrint(ListNode head) {
        ListNode p=head;
        int length_list=0;
        while(p!=null){
            length_list=length_list+1;
            p=p.next;
        }
        int[] result=new int[length_list];
        for(int i=0;i<=length_list-1;i++){
            result[length_list-1-i]=head.val;
            head=head.next;
        }
        return result;
    }
    public static void main(String[] args){
        jianzhi_06 hhh=new jianzhi_06();
        ListNode head=new ListNode(45);
        head.next=new ListNode(55);
        int[] result=hhh.reversePrint(head);
        System.out.println(Arrays.toString(result));
    }

}
