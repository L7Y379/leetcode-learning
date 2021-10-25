package jianzhi;

import java.util.LinkedList;
import java.util.List;

public class jianzhi_34 {
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
//     public List<List<Integer>> pathSum(TreeNode root, int target) {
//         List<List<Integer>> list=new List<List<Integer>>();
//         int real=0;
//         List<Integer> l=new List<Integer>();
//         res(root,target,real,l);
//         return list;

//     }
//     public void res(TreeNode root, int target,int real,List<Integer> l) {
//         if(root==null||root.val+real>target){
//             return;
//         }
//         if(root.val+real<target){
//             l.add(root.val);
//             res(root.left,target,root.val+real,l);
//             res(root.right,target,root.val+real,l);
//         }
//         if(root.val+real==target){
//             l.add(root.val);
//             list.add(l);
//         }

//     }
// }

    class Solution {
        LinkedList<List<Integer>> res = new LinkedList<>();
        LinkedList<Integer> path = new LinkedList<>();
        public List<List<Integer>> pathSum(TreeNode root, int sum) {
            recur(root, sum);
            return res;
        }
        void recur(TreeNode root, int tar) {
            if(root == null) return;
            path.add(root.val);
            tar -= root.val;
            if(tar == 0 && root.left == null && root.right == null)
                res.add(new LinkedList(path));
            recur(root.left, tar);
            recur(root.right, tar);
            path.removeLast();
        }
    }

}
