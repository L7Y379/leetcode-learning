package hot;

public class hot_538把二叉搜索树转换为累加树_中序遍历 {
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
//    class Solution {
//        int k;
//        public TreeNode convertBST(TreeNode root) {
//            if(root==null){
//                return null;
//            }
//            int sum=0;
//            sum=getsum(root);
//            zhongxu(root,sum);
//            return root;
//        }
//        public void zhongxu(TreeNode root,int sum){
//            if(root==null){
//                return;
//            }
//            zhongxu(root.left,sum);
//            k=k+root.val;
//            root.val=sum-k+root.val;
//            zhongxu(root.right,sum);
//        }
//        public int getsum(TreeNode root){
//            if(root==null){
//                return 0;
//            }
//            return root.val+getsum(root.left)+getsum(root.right);
//        }
//    }
    int k;
    public TreeNode convertBST(TreeNode root) {
        if(root==null){
            return null;
        }
        zhongxu(root);
        return root;
    }
    public void zhongxu(TreeNode root){
        if(root==null){
            return;
        }
        zhongxu(root.right);
        k=k+root.val;
        root.val=k;
        zhongxu(root.left);
    }

}
