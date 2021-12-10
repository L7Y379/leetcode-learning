package hot;

public class hot_21 {
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
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            ListNode list=new ListNode();
            ListNode result=list;
            ListNode l1=list1;
            ListNode l2=list2;
            if(l1==null&&l2==null){
                return null;
            }
            while(l1!=null&&l2!=null){
                if(l1.val<l2.val){
                    list.val=l1.val;
                    l1=l1.next;
                    list.next=new ListNode();
                    list=list.next;
                }else{
                    list.val=l2.val;
                    l2=l2.next;
                    list.next=new ListNode();
                    list=list.next;
                }
            }
            if(l1!=null){
                list.val=l1.val;
                list.next=l1.next;
            }
            if(l2!=null){
                list.val=l2.val;
                list.next=l2.next;
            }
            return result;
        }
    }
}
