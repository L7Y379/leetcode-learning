package jianzhi;
//Definition for singly-linked list.
class ListNode3 {
    int val;
    ListNode3 next;
    ListNode3(int x) { val = x; }

    public ListNode3() {

    }
}
public class jianzhi_24 {

    public ListNode3 reverseList(ListNode3 head) {
        if(head==null){
            return null;
        }
        ListNode3 result=new ListNode3();
        result.val=head.val;
        head=head.next;

        //ListNode p=new ListNode();
        while(head!=null){
            ListNode3 p=new ListNode3(head.val);
            p.next=result;
            result=p;
            head=head.next;

        }
        return result;


    }
    public static void main(String[] args){
        ListNode3 test=new ListNode3(5);
        test.next=new ListNode3(6);
        test.next.next=new ListNode3(7);
        jianzhi_24 jj=new jianzhi_24();
        ListNode3 result=jj.reverseList(test);
        System.out.println(result.val);
    }

}
