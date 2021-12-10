package hot;

 //Definition for singly-linked list.
class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class hot_19 {

    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            int length_head=0;
            ListNode l=head;
            ListNode l2=head;
            while(l!=null){
                length_head++;
                l=l.next;

            }
            if(n==length_head){
                return head.next;
            }
            while(length_head>n+1){
                l2=l2.next;
                length_head--;
            }
            ListNode t=l2.next.next;
            l2.next=t;
            return head;
        }
    }
}
