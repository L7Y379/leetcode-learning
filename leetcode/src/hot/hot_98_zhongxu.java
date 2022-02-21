package hot;

public class hot_98_zhongxu {
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
// class Solution {
//     public boolean isValidBST(TreeNode root) {
//         return defleft(root.left,root.val)&&defright(root.right,root.val);

//     }
//     public boolean defleft(TreeNode p,int val) {
//         if(p==null){
//             return true;
//         }
//         if(p.val<val){
//             return defleft(p.left,p.val)&&defright(p.right,p.val);
//         }else{
//             return false;
//         }

//     }
//     public boolean defright(TreeNode p,int val) {
//         if(p==null){
//             return true;
//         }
//         if(p.val>val){
//             return defleft(p.left,p.val)&&defright(p.right,p.val);
//         }else{
//             return false;
//         }
//     }
// }
//
//    class Solution {
//        int result=1;
//        long val=Long.MIN_VALUE;
//        public boolean isValidBST(TreeNode root) {
//            dfs(root);
//            if(result==1){
//                return true;
//            }
//            return false;
//
//        }
//        public void dfs(TreeNode root){
//            if(root==null||result==0){
//                return;
//            }
//            dfs(root.left);
//            if(root.val<=val){
//                result=0;
//            }
//            val=root.val;
//            System.out.println(val);
//            dfs(root.right);
//        }
//    }
}
