package hot;

public class hot_206反转链表 {
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
        public ListNode reverseList(ListNode head) {
            // if(head==null){
            //     return null;
            // }
            // List<ListNode> list=new ArrayList<ListNode>();
            // while(head!=null){
            //     list.add(head);
            //     head=head.next;
            // }
            // ListNode result=list.get(list.size()-1);
            // ListNode p=result;
            // for(int i=list.size()-2;i>=0;i--){
            //     p.next=list.get(i);
            //     p=p.next;
            // }
            // p.next=null;
            // return result;

//            if(head==null){
//                return null;
//            }
//            ListNode p=new ListNode(head.val);
//            head=head.next;
//            while(head!=null){
//                ListNode q=new ListNode(head.val,p);
//                head=head.next;
//                p=q;
//            }
//            return p;

            if(head==null){
                return null;
            }
            ListNode p=head;
            ListNode q=p.next;
            p.next=null;
            while(q!=null){
                ListNode t=q.next;
                q.next=p;
                p=q;
                q=t;
            }
            return p;
        }
    }
}
