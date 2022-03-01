package hot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class hot_148排序链表_Collections {
    class Solution {
        public ListNode sortList(ListNode head) {

            List<Integer> list=new ArrayList<Integer>();
            if(head==null){
                return null;
            }
            while(head!=null){
                list.add(head.val);
                head=head.next;
            }
            Collections.sort(list);
            ListNode result=new ListNode(list.get(0));
            ListNode p=result;
            for(int i=1;i<list.size();i++){
                //ListNode pp=
                p.next=new ListNode(list.get(i));
                p=p.next;
            }
            return result;
        }
    }
}
