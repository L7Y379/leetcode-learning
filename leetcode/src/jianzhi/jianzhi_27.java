package jianzhi;

//Definition for a binary tree node.
class TreeNode3 {
    int val;
    TreeNode3 left;
    TreeNode3 right;
    TreeNode3(int x) { val = x; }
}
public class jianzhi_27 {

    public TreeNode3 mirrorTree(TreeNode3 root) {

        res(root);
        return root;
    }
    public void res(TreeNode3 root){
        if(root==null){
            return;
        }
        TreeNode3 t_left=root.left;
        TreeNode3 t_right=root.right;
        root.left=t_right;
        root.right=t_left;
        res(root.left);
        res(root.right);
        // if(root.left!=null&&root.right==null){
        //     root.right=root.left;
        //     root.left=null;
        //     res(root.right);
        // }
        // if(root.right!=null&&root.left==null){
        //     root.left=root.right;
        //     root.right=null;
        //     res(root.left);
        // }
    }
//    public void bianli(TreeNode3 root){
//        if(root!=null){
//            System.out.println(root.val);
//        }
//        bianli(root.left);
//        bianli(root.right);
//    }
    public static void main(String[] args){
        jianzhi_27 result=new jianzhi_27();
        TreeNode3 root=new TreeNode3(5);
        root.left=new TreeNode3(6);
        root.right=new TreeNode3(10);
        root.left.right=new TreeNode3(2);
        root=result.mirrorTree(root);
        System.out.println(root);
    }

}
