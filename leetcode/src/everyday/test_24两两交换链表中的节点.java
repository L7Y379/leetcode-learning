package everyday;

public class test_24两两交换链表中的节点 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode swapPairs(ListNode head) {
            if(head==null){
                return null;
            }
            int len=0;
            ListNode p=head;
            while(p!=null){
                len++;
                p=p.next;
            }
            if(len==1){
                return head;
            }

            ListNode result=head.next;
            int link1=len/2;
            int link2=len%2;
            ListNode cur=new ListNode(0);
            for(int i=0;i<link1;i++){
                ListNode q1=head.next;
                ListNode q2=q1.next;
                q1.next=head;
                head.next=q2;
                cur.next=q1;
                cur=head;
                head=q2;

            }
            return result;
        }
    }
}
