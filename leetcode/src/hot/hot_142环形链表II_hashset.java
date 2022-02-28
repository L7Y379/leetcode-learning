package hot;

import java.util.HashSet;
import java.util.Set;

public class hot_142环形链表II_hashset {
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
        public ListNode detectCycle(ListNode head) {
            Set<ListNode> node_set=new HashSet<ListNode>();
            ListNode p=head;
            while(p!=null){
                if(node_set.contains(p)){
                    return p;
                }
                node_set.add(p);
                p=p.next;
            }
            return null;
        }
    }
}
