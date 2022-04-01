package jianzhi;

public class jianzhi_52_2_tree {
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
        public boolean isBalanced(TreeNode root) {
            if(root==null){
                return true;
            }
            int left_deep=get_deep(root.left);
            int right_deep=get_deep(root.right);
            if(left_deep-right_deep>1||left_deep-right_deep<-1){
                return false;
            }
            return isBalanced(root.left)&&isBalanced(root.right);

        }
        public int get_deep(TreeNode t){
            if(t==null){
                return 0;
            }
            return Math.max(get_deep(t.left),get_deep(t.right))+1;
        }
    }
}
