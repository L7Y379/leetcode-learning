package TP_link;

import java.util.PriorityQueue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
public class Main {
    public int kthLargest(TreeNode root, int k) {
        PriorityQueue<Integer> pri=new PriorityQueue<>();
        dfs(root,k,pri);
        return pri.poll();
    }
    public static void dfs(TreeNode root, int k,PriorityQueue<Integer> pri){
        if(root==null){
            return;
        }
        if(pri.size()<k){
            pri.add(root.val);
        }else {
            pri.add(root.val);
            pri.poll();
        }
        dfs(root.left,k,pri);
        dfs(root.right,k,pri);
    }
}
