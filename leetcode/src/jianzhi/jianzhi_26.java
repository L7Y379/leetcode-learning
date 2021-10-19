package jianzhi;

  //Definition for a binary tree node.
class TreeNode2 {
    int val;
    TreeNode2 left;
    TreeNode2 right;
    TreeNode2(int x) { val = x; }
}
public class jianzhi_26 {
    public boolean isSubStructure(TreeNode2 A, TreeNode2 B) {
        if(B==null||A==null){
            return false;
        }
        return (recur(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B));
    }
    boolean recur(TreeNode2 A, TreeNode2 B) {
        if(B == null) return true;
        if(A == null || A.val != B.val) return false;
        return recur(A.left, B.left) && recur(A.right, B.right);
    }

}
