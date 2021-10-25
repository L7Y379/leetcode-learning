package jianzhi;

public class jianzhi_55 {
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
        int MAX=0;
        public int maxDepth(TreeNode root) {
            int max=0;
            res(root,max);
            return MAX;
        }
        public void res(TreeNode root,int max) {
            if(root==null){
                return;
            }
            max=max+1;
            if(max>MAX){
                MAX=max;
            }
            res(root.left,max);
            res(root.right,max);
        }
    }
}
