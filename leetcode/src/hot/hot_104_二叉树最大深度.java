package hot;

public class hot_104_二叉树最大深度 {
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
        int max_deep=0;
        public int maxDepth(TreeNode root) {
            if(root==null){
                return max_deep;
            }
            dfs(root,0);
            return max_deep;
        }
        public void dfs(TreeNode root,int k){
            if(root==null){
                if(k>max_deep){
                    max_deep=k;
                }
                return;
            }
            k++;
            dfs(root.left,k);
            dfs(root.right,k);
        }
    }
}
