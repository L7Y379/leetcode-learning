package jianzhi;

public class jianzhi_18 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */

    public ListNode deleteNode(ListNode head, int val) {
        ListNode p=head;
        if(p==null){
            return null;
        }
        if(p.val==val){
            return head.next;
        }
        while(p.next!=null){
            if(p.next.val==val){
                p.next=p.next.next;
            }else{
                p=p.next;
            }

        }
        return head;
    }

}
