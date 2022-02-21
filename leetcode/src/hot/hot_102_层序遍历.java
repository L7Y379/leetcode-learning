package hot;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class hot_102_层序遍历 {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */
    class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> result=new ArrayList<List<Integer>>();
            // Queue<String> queue = new LinkedList<String>();
            // queue.add();
            // queue.poll();
            if(root==null){
                return result;
            }
            List<Integer> list=new ArrayList<Integer>();
            Queue<TreeNode> queue = new LinkedList<TreeNode>();
            queue.add(root);
            //list.add(root.val);
            //result.add(list);

            dfs(queue,result);

            return result;
        }
        public void dfs(Queue<TreeNode> queue,List<List<Integer>> result){
            if(queue.size()==0){
                return;
            }
            List<Integer> list=new ArrayList<Integer>();
            Queue<TreeNode> q = new LinkedList<TreeNode>();
            while(queue.size()!=0){
                TreeNode t=queue.poll();
                list.add(t.val);
                if(t.left!=null){
                    q.add(t.left);
                }
                if(t.right!=null){
                    q.add(t.right);
                }

            }
            result.add(list);
            dfs(q,result);

        }
    }
}
