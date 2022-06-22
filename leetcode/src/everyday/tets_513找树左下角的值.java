package everyday;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode1{
    int val;
    TreeNode1 left;
    TreeNode1 right;
    public TreeNode1(){
        val=0;
    }
    public TreeNode1(int val){
        this.val=val;
    }
    public TreeNode1(int val,TreeNode1 left,TreeNode1 right){
        this.val=val;
        this.left=left;
        this.right=right;
    }
}
public class tets_513找树左下角的值 {
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        queue.add(root);
        int result=root.val;
        while(!queue.isEmpty()){
            int len=queue.size();
            for(int i=0;i<len;i++){

                TreeNode t=queue.poll();
                if(i==0){
                    result=t.val;
                }
                if(t.left!=null)queue.add(t.left);
                if(t.right!=null)queue.add(t.right);
            }
        }
        return result;
    }
}
