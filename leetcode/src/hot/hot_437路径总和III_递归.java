package hot;

public class hot_437路径总和III_递归 {
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
        int result=0;
        public int pathSum(TreeNode root, int targetSum) {
            gen_bl(root,targetSum);
            return result;
        }
        public void gen_bl(TreeNode root,int targetSum){
            if(root==null){
                return;
            }
            get_lj(root,root.val,targetSum);
            gen_bl(root.left,targetSum);
            gen_bl(root.right,targetSum);
        }
        public void get_lj(TreeNode root,int sum,int targetSum){
            // if(root==null){
            //     return;
            // }
            if(sum==targetSum){
                result++;
            }
            if(root.left!=null){
                get_lj(root.left,sum+root.left.val,targetSum);
            }
            if(root.right!=null){
                get_lj(root.right,sum+root.right.val,targetSum);
            }

        }
    }
}
