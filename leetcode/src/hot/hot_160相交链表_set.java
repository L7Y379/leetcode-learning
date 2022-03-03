package hot;

import java.util.HashSet;
import java.util.Set;

public class hot_160相交链表_set {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) {
     *         val = x;
     *         next = null;
     *     }
     * }
     */
    public class Solution {
//        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//            if(headB==null||headA==null){
//                return null;
//            }
//            ListNode pa=headA;
//            ListNode pb=headB;
//            while(pa!=pb){
//                pa=pa.next;
//                pb=pb.next;
//                if(pa==null&&pb!=null){
//                    pa=headB;
//                }
//                if(pb==null&&pa!=null){
//                    pb=headA;
//                }
//                if(pa==null&&pb==null){
//                    return null;
//                }
//
//            }
//            return pa;
//        }
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            Set<ListNode> set_A=new HashSet<ListNode>();
            while(headA!=null){
                set_A.add(headA);
                headA=headA.next;
            }
            while(headB!=null){
                if(set_A.contains(headB)){
                    return headB;
                }
                headB=headB.next;
            }
            return null;

        }
    }
}
