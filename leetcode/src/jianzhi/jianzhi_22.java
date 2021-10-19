package jianzhi;

public class jianzhi_22 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */

    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode p=head;
        int length_head=0;
        while(p!=null){
            length_head++;
            p=p.next;
        }
        while(length_head!=k){
            head=head.next;
            length_head--;
        }
        return head;
    }

}
