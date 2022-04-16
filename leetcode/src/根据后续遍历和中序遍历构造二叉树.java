class TreeNode{
    int val;
    public TreeNode(int val){
        this.val=val;
    }
    TreeNode left=null;
    TreeNode right=null;
}
public class 根据后续遍历和中序遍历构造二叉树 {
    public static void main(String[] args){
        int[] inorder=new int[10];
        int[] postorder=new int[10];
        TreeNode root=getTreeNode(inorder,0,9,postorder,9);
    }
    public static TreeNode getTreeNode(int[] inorder,int lefti,int righti,int[] postorder,int post){
        if(lefti>righti){
            return null;
        }
        TreeNode root=new TreeNode(postorder[post]);
        int index=0;
        for(int i=lefti;i<=righti;i++){
            if(inorder[i]==postorder[post]){
                index=i;
            }
        }
        root.left=getTreeNode(inorder,lefti,index-1,postorder,post-righti+index-1);
        root.right=getTreeNode(inorder,index+1,righti,postorder,post-1);
        return root;
    }
}
