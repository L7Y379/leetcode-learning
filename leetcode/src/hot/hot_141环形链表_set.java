package hot;

import java.util.HashSet;
import java.util.Set;

public class hot_141环形链表_set {
    /**
     * Definition for singly-linked list.
     * class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) {
     *         val = x;
     *         next = null;
     *     }
     * }
     */
    public class Solution {
        public boolean hasCycle(ListNode head) {
            Set<ListNode> node_set=new HashSet<ListNode>();
            ListNode p=head;
            while(p!=null){
                if(node_set.contains(p)){
                    return true;
                }
                node_set.add(p);
                p=p.next;
            }
            return false;

        }
    }
}
