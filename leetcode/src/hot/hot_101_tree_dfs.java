package hot;

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
    }
}

public class hot_101_tree_dfs {

    class Solution {
        public boolean isSymmetric(TreeNode root) {
            return dfs(root.left,root.right);

        }
        public boolean dfs(TreeNode left,TreeNode right) {
            if(left==null&&right!=null){
                return false;
            }
            if(left!=null&&right==null){
                return false;
            }
            if(left==null&&right==null){
                return true;
            }
            if(left.val==right.val){
                return dfs(left.left,right.right)&&dfs(left.right,right.left);
            }else{
                return false;
            }


        }
    }
}
