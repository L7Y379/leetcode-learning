package hot;

public class hot_617合并二叉树 {
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
//     public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
//         if(root1==null&&root2==null){
//             return root1;
//         }
//         hebing(root1,root2);
//         return root1;
//     }
//     public void hebing(TreeNode root1, TreeNode root2){
//         if(root1==null&&root2==null){
//             return;
//         }
//         if(root1==null&&root2!=null){
//             root1=root2;
//         }else if(root1!=null&&root2!=null){
//             root1.val=root1.val+root2.val;
//             hebing(root1.left,root2.left);
//             hebing(root1.right,root2.right);
//         }else if(root1!=null&&root2==null){
//             hebing(root1.left,null);
//             hebing(root1.right,null);
//         }

//     }
// }


    class Solution {
        public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
            if (t1 == null) {
                return t2;
            }
            if (t2 == null) {
                return t1;
            }
            TreeNode merged = new TreeNode(t1.val + t2.val);
            merged.left = mergeTrees(t1.left, t2.left);
            merged.right = mergeTrees(t1.right, t2.right);
            return merged;
        }
    }







}
