package everyday;
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
public class test2两数相加 {

    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

            int t=0;
            ListNode result=new ListNode((l1.val+l2.val)%10);
            int c=(l1.val+l2.val)/10;
            ListNode p=result;
            l1=l1.next;
            l2=l2.next;
            while(l1!=null&&l2!=null){
                p.next=new ListNode(((l1.val+l2.val+c)%10));

                c=(l1.val+l2.val+c)/10;
                l1=l1.next;
                l2=l2.next;
                p=p.next;

            }
            while(l1!=null){
                p.next=new ListNode(((l1.val+c)%10));
                c=(l1.val+c)/10;
                l1=l1.next;
                p=p.next;
            }
            while(l2!=null){
                p.next=new ListNode(((l2.val+c)%10));
                c=(l2.val+c)/10;
                l2=l2.next;
                p=p.next;
            }
            if(c!=0){
                p.next=new ListNode(c);
            }
            return result;
        }
    }
}
