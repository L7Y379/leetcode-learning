package jianzhi;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class jianzhi_32_1 {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
    class Solution {

        public int[] levelOrder(TreeNode root) {

            if(root == null) return new int[0];
            List<Integer> list=new ArrayList<Integer>();
            Queue<TreeNode> queue=new LinkedList<TreeNode>();
            queue.add(root);
            while(!queue.isEmpty()){
                TreeNode tree=queue.poll();
                list.add(tree.val);
                if(tree.left!=null){
                    queue.add(tree.left);
                }
                if(tree.right!=null){
                    queue.add(tree.right);
                }
            }
            int[] res = new int[list.size()];
            for(int i = 0; i < list.size(); i++)
                res[i] = list.get(i);
            return res;
        }

    }

// class Solution {
//     public int[] levelOrder(TreeNode root) {
//         if(root == null) return new int[0];
//         Queue<TreeNode> queue = new LinkedList<>(){{ add(root); }};
//         ArrayList<Integer> ans = new ArrayList<>();
//         while(!queue.isEmpty()) {
//             TreeNode node = queue.poll();
//             ans.add(node.val);
//             if(node.left != null) queue.add(node.left);
//             if(node.right != null) queue.add(node.right);
//         }
//         int[] res = new int[ans.size()];
//         for(int i = 0; i < ans.size(); i++)
//             res[i] = ans.get(i);
//         return res;
//     }
// }

}
