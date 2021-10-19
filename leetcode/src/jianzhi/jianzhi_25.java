package jianzhi;


class ListNode2{
    int val;
    ListNode2 next;
    ListNode2(int x) { val = x; }
}

public class jianzhi_25 {

     //Definition for singly-linked list.

    public ListNode2 mergeTwoLists(ListNode2 l1, ListNode2 l2) {
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        ListNode2 l3=new ListNode2(0);
        ListNode2 p=l3;
        if(l1.val<=l2.val){
            l3.val=l1.val;
            l1=l1.next;
        }else{
            l3.val=l2.val;
            l2=l2.next;
        }
        while(l1!=null&&l2!=null){
            if(l1.val<=l2.val){
                p.next=new ListNode2(l1.val);
                p=p.next;
                l1=l1.next;
            }else{
                p.next=new ListNode2(l2.val);
                p=p.next;
                l2=l2.next;
            }
        }
        if(l1==null){
            p.next=l2;
        }
        if(l2==null){
            p.next=l1;
        }
        return l3;

    }
}
