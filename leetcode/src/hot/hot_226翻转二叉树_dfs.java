package hot;

public class hot_226翻转二叉树_dfs {
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
        public TreeNode invertTree(TreeNode root) {
            dfs(root);
            return root;
        }
        public void dfs(TreeNode root){
            if(root==null){
                return;
            }
            TreeNode p=root.left;
            root.left=root.right;
            root.right=p;
            dfs(root.left);
            dfs(root.right);
        }
    }
}
