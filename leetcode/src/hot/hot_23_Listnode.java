package hot;

public class hot_23_Listnode {
    class Solution {
        public ListNode mergeKLists(ListNode[] lists) {
            if(lists.length==0){
                return null;
            }
            int mi=10001;
            int mi_i=-1;
            for(int i=0;i<lists.length;i++){
                if(lists[i]!=null&&lists[i].val<mi){
                    mi=lists[i].val;
                    mi_i=i;
                }
            }
            if(mi==10001){
                return null;
            }
            ListNode result=new ListNode(mi);
            ListNode p=result;
            lists[mi_i]=lists[mi_i].next;

            while(true){
                int min=10001;
                int min_i=-1;
                for(int i=0;i<lists.length;i++){
                    if(lists[i]!=null&&lists[i].val<min){
                        min=lists[i].val;
                        min_i=i;
                    }
                }
                if(min==10001){
                    break;
                }
                p.next=new ListNode(min);
                lists[min_i]=lists[min_i].next;
                p=p.next;
            }
            return result;

        }
    }
}
