package jianzhi;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
public class jianzhi_32_3 {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
    class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {

            Queue<TreeNode> queue=new LinkedList<TreeNode>();
            List<List<Integer>> list=new ArrayList<List<Integer>>();
            int k=0;
            if(root!=null){
                queue.add(root);
            }
            while(!queue.isEmpty()){
                List<Integer> l1=new ArrayList<Integer>();
                int n=queue.size()-1;
                for(int i=0;i<=n;i++){
                    TreeNode tree=queue.poll();
                    l1.add(tree.val);
                    if(tree.left!=null){
                        queue.add(tree.left);
                    }
                    if(tree.right!=null){
                        queue.add(tree.right);
                    }
                }
                k++;
                if(k%2==0){
                    List<Integer> l2=new ArrayList<Integer>();
                    for(int j=l1.size()-1;j>=0;j--){
                        l2.add(l1.get(j));
                    }
                    list.add(l2);
                }else{
                    list.add(l1);
                }



            }
            return list;
        }
    }
}
