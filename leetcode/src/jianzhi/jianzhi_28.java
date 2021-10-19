package jianzhi;

  //Definition for a binary tree node.
class TreeNode4 {
    int val;
    TreeNode4 left;
    TreeNode4 right;
    TreeNode4(int x) { val = x; }
}

public class jianzhi_28 {
    public boolean isSymmetric(TreeNode4 root) {
        return root == null ? true : recur(root.left, root.right);
    }
    boolean recur(TreeNode4 L, TreeNode4 R) {
        if(L == null && R == null) return true;
        if(L == null || R == null || L.val != R.val) return false;
        return recur(L.left, R.right) && recur(L.right, R.left);
    }


}
