package jianzhi;

public class jianzhi_52 {
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
// public class Solution {
//     public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//         Map<ListNode,Integer> map=new HashMap<ListNode,Integer>();
//         while(headA!=null){
//             map.put(headA,1);
//             headA=headA.next;
//         }
//         while(headB!=null){
//             if(map.containsKey(headB)){
//                 return headB;
//             }
//             headB=headB.next;
//         }
//         return null;
//     }
// }

    public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            if (headA == null || headB == null) {
                return null;
            }
            ListNode pA = headA, pB = headB;
            while (pA != pB) {
                pA = pA == null ? headB : pA.next;
                pB = pB == null ? headA : pB.next;
            }
            return pA;
        }
    }

}
